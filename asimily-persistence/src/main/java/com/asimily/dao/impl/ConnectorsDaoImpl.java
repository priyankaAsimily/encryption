package com.asimily.dao.impl;

import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.asimily.dao.ConnectorsDaoCustom;
import com.asimily.exception.AsimilyDataException;
import com.asimily.models.EConnectors;

public class ConnectorsDaoImpl extends PrimaryPersistenceContext implements ConnectorsDaoCustom {

  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  @Override
  public EConnectors findByEConnectorsId(Integer id) {
    try {
      Query q = entityManager
          .createQuery("select d from EConnectors d where d.id = :id").setParameter("id", id);
      return (EConnectors) q.getSingleResult();
    } catch (Exception e) {
      logger.error("ConnectorsDaoImpl.findByEConnectorsId Exception: {}", e.getMessage());
      throw new AsimilyDataException("ConnectorsDaoImpl.findByEConnectorsId Exception: " + e.getMessage());
    }
  }

  @Override
  public String getByConnectorName(String name) {
    try {
      String query = "select configuration from admin.connectors_connection_info cci where connector_id = (select id from admin.connectors where connector_name='"+name+"')";
      Query q = entityManager.createNativeQuery(query);
        String config= (String)q.getSingleResult();
      return config;
    } catch (Exception e) {
      logger.error("ConnectorsDaoImpl.findByEConnectorsId Exception: {}", e.getMessage());
      throw new AsimilyDataException("ConnectorsDaoImpl.findByEConnectorsId Exception: " + e.getMessage());
    }
  }
}
