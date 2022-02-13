package com.asimily.dao;

import com.asimily.models.EConnectors;

public interface ConnectorsDaoCustom {

  EConnectors findByEConnectorsId(Integer id);
  String getByConnectorName(String name);
}
