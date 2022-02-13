package com.asimily.dao;

import com.asimily.models.EConnectors;

public interface ConnectorsDao extends BaseDao<EConnectors, Integer>, ConnectorsDaoCustom {
  EConnectors findByConnectorName(String connectorName);
}
