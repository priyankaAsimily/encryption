package com.asimily;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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

      FileWriter myWriter = null;
      try {
        myWriter = new FileWriter("connector.txt");
      }
      catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }

      for (EConnectorsConnectionInfo eConnectorsConnectionInfo : eConnectorsConnectionInfos) {
        logger.info("************");
        final int id = eConnectorsConnectionInfo.getId();
        final String connector = connectorsDao.findByEConnectorsId(eConnectorsConnectionInfo.getConnectorId()).getConnectorName();
        final String host1 = eConnectorsConnectionInfo.getHost1();
        final String host2 = eConnectorsConnectionInfo.getHost2();
        final String userName = eConnectorsConnectionInfo.getUsername();
        String pass = eConnectorsConnectionInfo.getPassword();
        final String certficatePass = eConnectorsConnectionInfo.getCertificatePassword();
        final String certficateFilePath = eConnectorsConnectionInfo.getCertificateClientFilename();
        final String certficateClientFilePath = eConnectorsConnectionInfo.getCertificateClientFilename();
        final String port = eConnectorsConnectionInfo.getPort() != null ? eConnectorsConnectionInfo.getPort().toString() : "";
        final String transport = eConnectorsConnectionInfo.getTransport() != null ? eConnectorsConnectionInfo.getTransport().toString() : "";
        final String configuration = eConnectorsConnectionInfo.getConfiguration();

        EMasterKeys eMasterKeys = masterKeysDao.findByCustomerId(FIELD_CUSTOMER_ID);
        ECustomerKeys eCustomerKeys = customerKeysDao.findByCustomerId(FIELD_CUSTOMER_ID);
        String decryptedPass = pass;
        String password = pass;
        if (eMasterKeys != null && eCustomerKeys != null && pass != null && !pass.isEmpty()) {
          // Check if password encrypted
          decryptedPass = encryptorAesGcm.decrypt(eConnectorsConnectionInfo.getPassword(), FIELD_CUSTOMER_ID);
          if (decryptedPass != null && !decryptedPass.isEmpty()) {
            password = decryptedPass;
            logger.info("Checking... " + connector);

            boolean doubleEncrypted = false;
            int count = 1;
            while (decryptedPass != null) {
              password = decryptedPass;
              decryptedPass = encryptorAesGcm.decrypt(decryptedPass, FIELD_CUSTOMER_ID);
              logger.info("Password is encrypted multiple times : " + ++count);
              doubleEncrypted = true;
            }
            if (doubleEncrypted) {
              logger.info("****** ERROR: Password encrypted more than once for " + connector + " *******");
              logger.info("The correct password : " + password);
            }
          }
        }
        else {
          logger.info("Password is not encrypted for connector : " + connector);
        }

        try {
          if (myWriter != null) {
            myWriter.write("\n ************");
            myWriter.write("\n Connector : " + connector);
            myWriter.write("\n Connector connection info id : " + id);
            myWriter.write("\n Configuration : " + configuration);
            myWriter.write("\n User name : " + userName);
            myWriter.write("\n Password : " + password);
            myWriter.write("\n host1 : " + host1);
            myWriter.write("\n host2 : " + host2);
            myWriter.write("\n certficatePass : " + certficatePass);
            myWriter.write("\n certficateFilePath : " + certficateFilePath);
            myWriter.write("\n certficateClientFilePath : " + certficateClientFilePath);
            myWriter.write("\n port : " + port);
            myWriter.write("\n Transport : " + transport);
            myWriter.write("\n ************ \n");
          }
        }
        catch (IOException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
      }
      try {
        myWriter.close();
      }
      catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      System.out.println("Successfully wrote to the file.");
    }

  }

  private void encrypt() {
    List<EConnectorsConnectionInfo> eConnectorsConnectionInfos = connectorsConnectionInfoDao.getAllConnectorConnection();
    if (eConnectorsConnectionInfos != null && !eConnectorsConnectionInfos.isEmpty()) {
      EMasterKeys eMasterKeys = masterKeysDao.findByCustomerId(FIELD_CUSTOMER_ID);
      ECustomerKeys eCustomerKeys = customerKeysDao.findByCustomerId(FIELD_CUSTOMER_ID);

      for (EConnectorsConnectionInfo eConnectorsConnectionInfo : eConnectorsConnectionInfos) {
        String pass = eConnectorsConnectionInfo.getPassword();
        final String connector = connectorsDao.findByEConnectorsId(eConnectorsConnectionInfo.getConnectorId()).getConnectorName();
        
        if (eMasterKeys != null && eCustomerKeys != null && pass != null && !pass.isEmpty()) {
          // Check if password encrypted
          String decryptedPass = encryptorAesGcm.decrypt(eConnectorsConnectionInfo.getPassword(), FIELD_CUSTOMER_ID);
          if (decryptedPass != null && !decryptedPass.isEmpty()) {
            String password = decryptedPass;
            logger.info("Checking... " + connector);

            boolean doubleEncrypted = false;
            int count = 1;
            while (decryptedPass != null) {
              password = decryptedPass;
              decryptedPass = encryptorAesGcm.decrypt(decryptedPass, FIELD_CUSTOMER_ID);
              logger.info("Password is encrypted multiple times : " + ++count);
              doubleEncrypted = true;
            }
            if (!doubleEncrypted) {
              logger.info("Password is already encrypted ");
            }
            else {
              logger.info("Error: Password encrypted more than once");
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
          else {
            logger.info("Password is not encrypted");
            final String encryptedText = encryptorAesGcm.encryptKeys(pass, FIELD_CUSTOMER_ID);
            if (encryptedText != null && !encryptedText.isEmpty()) {
              eConnectorsConnectionInfo.setPassword(encryptedText);
              // connectorsConnectionInfoDaoManager.saveConnection(eConnectorsConnectionInfo);
              logger.info("Password encrypted and saved : " + encryptedText);
            }
          }
        }
        else if (pass == null || pass.isEmpty()) {
          logger.info("Key is empty!");
        }
      }
    }
  }
}
