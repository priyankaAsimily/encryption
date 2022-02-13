package com.asimily.common;

import org.springframework.context.annotation.Configuration;

/**
 * Class to hold all the constants for this application
 *
 */
@Configuration
public class PersistenceAppConstants {

  public static final String ROLE_USER = "ROLE_USER";

  public static final String EXCLUDE_QUERY = "excludeQuery";
  public static final String INCLUDE_QUERY = "includeQuery";

  public static final Integer ASIMILY_CUST_ID = 1;
  public static final Integer DUMMY_ASIMILY_CUST_ID = 0;

  public static final String ASIMILY_CUST_ID_KEY = "ASIMILY_CUST_ID";

  public static final String USER_CUST_ID_KEY = "USER_CUST_ID";
  
  public static final String DEFAULT_JAVA_APP_NAME = "java_runtime_environment";
  
  public static final String DEFAULT_FLASH_APP_NAME = "flash_player";

  public static final Integer DICOM_PROTO_SERVICE_ID = 10716;
  
  public static final String TRANSACTION_MANAGER = "transactionManager";
  public static final String TRANSACTION_MANAGER_SEC = "transactionManagerSec";
  
  public static final String PERSISTENCE_UNITNAME = "persistenceUnitNamePrimary";
  public static final String PERSISTENCE_UNITNAME_SEC = "persistenceUnitNameSecondary";

  public static final String FILTER_OPTION_ANY_VALUE = "[Any Value]";
  public static final String FILTER_OPTION_NO_VALUE = "[No Value]";
  public static final String FILTER_OPTION_NO = "[No]";
  public static final String FILTER_OPTION_ALL = "[All]";
  public static final String OS_UNKNOWN = "unknown";
}
