package com.asimily.dao;

import com.asimily.models.EConnectorsConnectionInfo;

public interface ConnectorsConnectionInfoDaoCustom {
  
  EConnectorsConnectionInfo getLatestRecordByConnectorId(Integer connectorId);
  EConnectorsConnectionInfo getByConnectorAndConnectionType(String connectorCategory, String connectorName, Integer connectionTypeId);
  EConnectorsConnectionInfo getByConnectorAndConnectionTypeWithoutCustomerId(String connectorCategory, String connectorName, Integer connectionTypeId);
  Boolean checkByConnectorNameAndConnectionCategory(String connectorName,String connectionCatogory);
  EConnectorsConnectionInfo findByConnectorsConnectionInfoId(Integer id);
  List<EConnectorsConnectionInfo> getAllConnectorConnection();
}
