package com.asimily;


import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asimily.dao.CustomerInfoDao;
import com.asimily.dao.CustomerKeysDao;
import com.asimily.dao.MasterKeysDao;
import com.asimily.models.EConnectivDeviceInfo;
import com.asimily.models.ECustomerInfo;
import com.asimily.models.ECustomerKeys;
import com.asimily.models.EMasterKeys;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Base64;


/**
 * AES-GCM inputs - 12 bytes IV, need the same IV and secret keys for encryption and decryption.
 * <p>
 * The output consist of iv, password's salt, encrypted content and auth tag in the following format:
 * output = byte[] {i i i s s s c c c c c c ...}
 * <p>
 * i = IV bytes
 * s = Salt bytes
 * c = content bytes (encrypted content)
 */
@Service
public class EncryptorAesGcm {

  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  @Autowired
  MasterKeysDao masterKeysDao;

  @Autowired
  CustomerKeysDao customerKeysDao;

  @Autowired
  CryptoUtils cryptoUtils;

  @Autowired
  CustomerInfoDao customerInfoDao;

  private final String ENCRYPT_ALGO = "AES/GCM/NoPadding";

  private final int TAG_LENGTH_BIT = 128; // must be one of {128, 120, 112, 104, 96}
  private final int IV_LENGTH_BYTE = 12;
  private final int SALT_LENGTH_BYTE = 16;
  private final Charset UTF_8 = StandardCharsets.UTF_8;

  // return a base64 encoded AES encrypted text
  public String encrypt(byte[] pText, String password) throws Exception {

    // 16 bytes salt
    byte[] salt = cryptoUtils.getRandomNonce(SALT_LENGTH_BYTE);

    // GCM recommended 12 bytes iv
    byte[] iv = cryptoUtils.getRandomNonce(IV_LENGTH_BYTE);

    // secret key from password
    SecretKey aesKeyFromPassword = cryptoUtils.getAESKeyFromPassword(password.toCharArray(), salt);

    Cipher cipher = Cipher.getInstance(ENCRYPT_ALGO);

    // ASE-GCM needs GCMParameterSpec
    cipher.init(Cipher.ENCRYPT_MODE, aesKeyFromPassword, new GCMParameterSpec(TAG_LENGTH_BIT, iv));

    byte[] cipherText = cipher.doFinal(pText);

    // prefix IV and Salt to cipher text
    byte[] cipherTextWithIvSalt = ByteBuffer.allocate(iv.length + salt.length + cipherText.length)
        .put(iv)
        .put(salt)
        .put(cipherText)
        .array();

    // string representation, base64, send this string to other for decryption.
    return Base64.getEncoder().encodeToString(cipherTextWithIvSalt);

  }

  // we need the same password, salt and iv to decrypt it
  private String decrypt(String cText, String password) throws Exception {

    byte[] decode = Base64.getDecoder().decode(cText.getBytes(UTF_8));

    // get back the iv and salt from the cipher text
    ByteBuffer bb = ByteBuffer.wrap(decode);

    byte[] iv = new byte[IV_LENGTH_BYTE];
    bb.get(iv);

    byte[] salt = new byte[SALT_LENGTH_BYTE];
    bb.get(salt);

    byte[] cipherText = new byte[bb.remaining()];
    bb.get(cipherText);

    // get back the aes key from the same password and salt
    SecretKey aesKeyFromPassword = cryptoUtils.getAESKeyFromPassword(password.toCharArray(), salt);

    Cipher cipher = Cipher.getInstance(ENCRYPT_ALGO);

    cipher.init(Cipher.DECRYPT_MODE, aesKeyFromPassword, new GCMParameterSpec(TAG_LENGTH_BIT, iv));

    byte[] plainText = cipher.doFinal(cipherText);

    return new String(plainText, UTF_8);
  }

  public String decrypt(String encryptedText, Integer customerId) {
    ECustomerKeys customerKeys = customerKeysDao.findByCustomerId(customerId);
    if (customerKeys != null) {
      String encryptedCustomerKey = customerKeys.getCustomerKey();
      try {
        String masterKey = null;
        EMasterKeys eMasterKeys = masterKeysDao.findByCustomerId(customerId);
        if (eMasterKeys != null) {
          masterKey = eMasterKeys.getMasterKey();
        }
        String decryptedCustomerKey = decrypt(encryptedCustomerKey, masterKey);
        return decrypt(encryptedText, decryptedCustomerKey);
      }
      catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
        e.printStackTrace();
      }
      catch (Exception e) {
        e.printStackTrace();
      }
    }
    return null;
  }

  public String encryptKeys(String text, Integer customerId) {
    try {
      String masterKey = null;
      EMasterKeys eMasterKeys = masterKeysDao.findByCustomerId(customerId);
      if (eMasterKeys == null) {
        logger.info("**DB operation**: Creating EMasterKeys");
        eMasterKeys = new EMasterKeys();
        eMasterKeys.setCustomerId(customerId);
        masterKey = cryptoUtils.generateRandomString();
        eMasterKeys.setMasterKey(masterKey);
        saveMasterKeys(eMasterKeys);
      }
      else {
        masterKey = eMasterKeys.getMasterKey();
        logger.info("Master key already present with customer id : {}", customerId);
      }

      ECustomerKeys eCustomerKeys = customerKeysDao.findByCustomerId(customerId);
      String encryptedCustomerKey = null;
      if (eCustomerKeys == null) {
        logger.info("**DB operation**: Creating ECustomerKeys");
        eCustomerKeys = new ECustomerKeys();
        final String customerKey = cryptoUtils.generateRandomString();
        encryptedCustomerKey = encrypt(customerKey.getBytes(UTF_8), masterKey);
        eCustomerKeys.setCustomerKey(encryptedCustomerKey);
        eCustomerKeys.setCustomerId(customerId);
        saveCustomerKeys(eCustomerKeys);
      }
      else {
        encryptedCustomerKey = eCustomerKeys.getCustomerKey();
        logger.info("Customer key already present with customer id : {}", customerId);
      }
      if (encryptedCustomerKey != null) {
        String decryptedCustomerKey = decrypt(encryptedCustomerKey, masterKey);
        return encrypt(text.getBytes(UTF_8), decryptedCustomerKey);
      }
    }
    catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
      e.printStackTrace();
    }
    catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

  private ECustomerKeys saveCustomerKeys(ECustomerKeys eCustomerKeys) {
    eCustomerKeys.setLastUpdatedTime(new Timestamp(System.currentTimeMillis()));
    return customerKeysDao.saveAndFlush(eCustomerKeys);
  }

  private EMasterKeys saveMasterKeys(EMasterKeys eMasterKeys) {
    eMasterKeys.setLastUpdatedTime(new Timestamp(System.currentTimeMillis()));
    return masterKeysDao.saveAndFlush(eMasterKeys);
  }
}