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
import com.asimily.dao.ConnectorsDao;
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

  @Autowired
  ConnectorsDao connectorsDao;
  
  private final Logger logger = LoggerFactory.getLogger(this.getClass());
  private static final String FIELD_DECRYPT = "decrypt";
  private static final String FIELD_ENCRYPT = "encrypt";
  private static final Integer FIELD_CUSTOMER_ID = 2;

  public void serve(String option) {
    if (!option.isEmpty() && FIELD_ENCRYPT.equalsIgnoreCase(option)) {
      encrypt();
    }
    else if (!option.isEmpty() && FIELD_DECRYPT.equalsIgnoreCase(option)) {
      decrypt();
    }
  }

  private void decrypt() {
    List<EConnectorsConnectionInfo> eConnectorsConnectionInfos = connectorsConnectionInfoDao.getAllConnectorConnection();
    if (eConnectorsConnectionInfos != null && !eConnectorsConnectionInfos.isEmpty()) {
      for (EConnectorsConnectionInfo eConnectorsConnectionInfo : eConnectorsConnectionInfos) {
        logger.info("************");
        final int id = eConnectorsConnectionInfo.getId();
        final String connector = connectorsDao.findByEConnectorsId(eConnectorsConnectionInfo.getConnectorId()).getConnectorName();
      
      }
    }
  }

  private void encrypt() {
    List<EConnectorsConnectionInfo> eConnectorsConnectionInfos = connectorsConnectionInfoDao.getAllConnectorConnection();
    if (eConnectorsConnectionInfos != null && !eConnectorsConnectionInfos.isEmpty()) {
      for (EConnectorsConnectionInfo eConnectorsConnectionInfo : eConnectorsConnectionInfos) {
        String pass = eConnectorsConnectionInfo.getPassword();

        EMasterKeys eMasterKeys = masterKeysDao.findByCustomerId(FIELD_CUSTOMER_ID);
        ECustomerKeys eCustomerKeys = customerKeysDao.findByCustomerId(FIELD_CUSTOMER_ID);

        if (eMasterKeys != null && eCustomerKeys != null && pass != null && !pass.isEmpty()) {

          // Check if password encrypted
          String decryptedPass = encryptorAesGcm.decrypt(eConnectorsConnectionInfo.getPassword(), FIELD_CUSTOMER_ID);
          if (decryptedPass != null && !decryptedPass.isEmpty()) {
            String password = decryptedPass;
            logger.info("Password is decrypted.. " + decryptedPass);

            boolean doubleEncrypted = false;
            while (decryptedPass != null) {
              password = decryptedPass;
              decryptedPass = encryptorAesGcm.decrypt(decryptedPass, FIELD_CUSTOMER_ID);
              logger.info("Password is encrypted multiple times : " + password);
              doubleEncrypted = true;
            }
            if (!doubleEncrypted) {
              final String encryptedText = encryptorAesGcm.encryptKeys(password, FIELD_CUSTOMER_ID);
              if (encryptedText != null && !encryptedText.isEmpty()) {
                eConnectorsConnectionInfo.setPassword(encryptedText);
                // connectorsConnectionInfoDaoManager.saveConnection(eConnectorsConnectionInfo);
                logger.info("Password encrypted and saved : " + encryptedText);
              }
            } else {
              // Show error or fix.
              /** logger.info("AAA unencrypted password : " + password);
              final String encryptedText = encryptorAesGcm.encryptKeys(password, FIELD_CUSTOMER_ID);
              if (encryptedText != null && !encryptedText.isEmpty()) {
              System.out.println("***********************");
              eConnectorsConnectionInfo.setPassword(encryptedText);
              // connectorsConnectionInfoDaoManager.saveConnection(eConnectorsConnectionInfo);
              logger.info("Password encrypted and saved : " + encryptedText);
              System.out.println("***********************");
              } **/
            }
          }
        } else if (pass == null || pass.isEmpty()) {
          logger.info("Keys are not encypted!");
          final String encryptedText = encryptorAesGcm.encryptKeys(pass, FIELD_CUSTOMER_ID);
          if (encryptedText != null && !encryptedText.isEmpty()) {
            eConnectorsConnectionInfo.setPassword(encryptedText);
            // connectorsConnectionInfoDaoManager.saveConnection(eConnectorsConnectionInfo);
            logger.info("Password encrypted and saved : " + encryptedText);
          }
        }
      }
    }
  }
}
