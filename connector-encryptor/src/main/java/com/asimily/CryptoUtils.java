package com.asimily;


import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Base64.Encoder;
import java.util.List;
import java.util.Random;


@Service
public class CryptoUtils {

  public byte[] getRandomNonce(int numBytes) {
    byte[] nonce = new byte[numBytes];
    new SecureRandom().nextBytes(nonce);
    return nonce;
  }

  // AES secret key
  public SecretKey getAESKey(int keysize) throws NoSuchAlgorithmException {
    KeyGenerator keyGen = KeyGenerator.getInstance("AES");
    keyGen.init(keysize, SecureRandom.getInstanceStrong());
    return keyGen.generateKey();
  }

  // Password derived AES 256 bits secret key
  public SecretKey getAESKeyFromPassword(char[] password, byte[] salt)
      throws NoSuchAlgorithmException, InvalidKeySpecException {

    SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
    // iterationCount = 65536
    // keyLength = 256
    KeySpec spec = new PBEKeySpec(password, salt, 65536, 256);
    SecretKey secret = new SecretKeySpec(factory.generateSecret(spec).getEncoded(), "AES");
    return secret;
  }

  // hex representation
  public String hex(byte[] bytes) {
    StringBuilder result = new StringBuilder();
    for (byte b : bytes) {
      result.append(String.format("%02x", b));
    }
    return result.toString();
  }

  // print hex with block size split
  public String hexWithBlockSize(byte[] bytes, int blockSize) {

    String hex = hex(bytes);

    // one hex = 2 chars
    blockSize = blockSize * 2;

    // better idea how to print this?
    List<String> result = new ArrayList<>();
    int index = 0;
    while (index < hex.length()) {
      result.add(hex.substring(index, Math.min(index + blockSize, hex.length())));
      index += blockSize;
    }

    return result.toString();
  }

  public String generateRandomString() {
    SecureRandom random = new SecureRandom();
    byte bytes[] = new byte[27];
    random.nextBytes(bytes);
    Encoder encoder = Base64.getUrlEncoder().withoutPadding();
    return encoder.encodeToString(bytes);
  }

}