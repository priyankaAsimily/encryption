package com.asimily;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.asimily.dao.ConnectorsConnectionInfoDao;
import com.asimily.dao.CustomerKeysDao;
import com.asimily.dao.MasterKeysDao;
import com.asimily.daomgr.ConnectorsConnectionInfoDaoManager;
import com.asimily.models.EConnectorsConnectionInfo;
import com.asimily.models.ECustomerKeys;
import com.asimily.models.EMasterKeys;
import org.springframework.stereotype.Service;


@Service
public class EncryptionService {

  @Autowired
  ConnectorsConnectionInfoDao connectorsConnectionInfoDao;

  @Autowired
  MasterKeysDao masterKeysDao;

  @Autowired
  CustomerKeysDao customerKeysDao;

  @Autowired
  ConnectorsConnectionInfoDaoManager connectorsConnectionInfoDaoManager;

  @Autowired
  EncryptorAesGcm encryptorAesGcm;
  
  private final Logger logger = LoggerFactory.getLogger(this.getClass());
  private static final String FIELD_DECRYPT = "decrypt";
  private static final String FIELD_ENCRYPT = "encrypt";
  private static final Integer FIELD_CUSTOMER_ID = 2;

  public void serve(String option) {
    if (!option.isEmpty() && FIELD_ENCRYPT.equalsIgnoreCase(option)) {
      encrypt();
    }
    else if (!option.isEmpty() && FIELD_DECRYPT.equalsIgnoreCase(option)) {
//      System.out.println("Enter encrypted text to decrypt");
//      String encyptedText = sc.next();
//      System.out.println("Enter encrypted master key. You'll find it in schema:customer_config & table:master_keys");
//      String masterKey = sc.next();
//      System.out.println("Enter encrypted customer key. You'll find it in schema:customer_config & table:customer_keys");
//      String customerKey = sc.next();
//
//      String decryptedText = encryptorAesGcm.decrypt(encyptedText, customerKey, masterKey);
//      if (decryptedText != null && !decryptedText.isEmpty()) {
//        System.out.println("***********************");
//        System.out.println("Decrypted key : " + decryptedText);
//        System.out.println("***********************");
//      }
//      else {
//        System.out.println("***********************");
//        System.out.println("Decryption failed");
//        System.out.println("***********************");
//      }
    }
  }
  
  private void encrypt() {
    List<EConnectorsConnectionInfo> eConnectorsConnectionInfos = connectorsConnectionInfoDao.getAllConnectorConnection();
    if (eConnectorsConnectionInfos != null && !eConnectorsConnectionInfos.isEmpty()) {
      for (EConnectorsConnectionInfo eConnectorsConnectionInfo : eConnectorsConnectionInfos) {
        String pass = eConnectorsConnectionInfo.getPassword();

        EMasterKeys eMasterKeys = masterKeysDao.findByCustomerId(FIELD_CUSTOMER_ID);
        ECustomerKeys eCustomerKeys = customerKeysDao.findByCustomerId(FIELD_CUSTOMER_ID);

        if (eMasterKeys != null && eCustomerKeys != null) {
          
          // Check if password encrypted
          String decryptedPass = encryptorAesGcm.decrypt(eConnectorsConnectionInfo.getPassword(), FIELD_CUSTOMER_ID);
          if (decryptedPass != null && !decryptedPass.isEmpty()) {
            logger.info("Password is decrypted..");
            
            while (decryptedPass != null && !decryptedPass.isEmpty()) {
              decryptedPass = encryptorAesGcm.decrypt(eConnectorsConnectionInfo.getPassword(), FIELD_CUSTOMER_ID);
              logger.info("Password is encrypted multiple times");
            }
            logger.info("AAA unencrypted password : " + decryptedPass);
            final String encryptedText = encryptorAesGcm.encryptKeys(decryptedPass, FIELD_CUSTOMER_ID);
            if (encryptedText != null && !encryptedText.isEmpty()) {
              System.out.println("***********************");
              eConnectorsConnectionInfo.setPassword(encryptedText);
//              connectorsConnectionInfoDaoManager.saveConnection(eConnectorsConnectionInfo);
              logger.info("Password encrypted and saved : " + encryptedText);
              System.out.println("***********************");
            }
            else {
              System.out.println("***********************");
              System.out.println("Encyption failed");
              System.out.println("***********************");
            }
          } else {
            logger.info("Keys are not encypted, skip!");
          }
        }
      }
    }
  }
}
