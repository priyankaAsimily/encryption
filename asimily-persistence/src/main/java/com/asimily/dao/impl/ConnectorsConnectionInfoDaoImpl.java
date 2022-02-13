package com.asimily.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.asimily.dao.ConnectorsConnectionInfoDaoCustom;
import com.asimily.exception.AsimilyDataException;
import com.asimily.models.EConnectorsConnectionInfo;
import com.asimily.models.EDeviceCVE;

public class ConnectorsConnectionInfoDaoImpl extends PrimaryPersistenceContext implements ConnectorsConnectionInfoDaoCustom {

  private final Logger logger = LoggerFactory.getLogger(this.getClass());


  @Override
  public EConnectorsConnectionInfo getLatestRecordByConnectorId(Integer connectorId) {

    try {
      Query q = entityManager.createQuery("select d from EConnectorsConnectionInfo d where d.connectorId = :connectorId order by d.lastUpdatedTime desc");
      q = q.setParameter("connectorId", connectorId);
      List<EConnectorsConnectionInfo> eConnectorsConnectionInfoList = q.getResultList();
      if(!eConnectorsConnectionInfoList.isEmpty()) {
        return eConnectorsConnectionInfoList.get(0);
      } else {
        return null;
      }
    } catch (Exception e) {
      logger.error("Returned null Exception: {}", e.getMessage());
      return null;
    }

  }

  @Override
  public EConnectorsConnectionInfo getByConnectorAndConnectionType(String connectorCategory, String connectorName,
      Integer connectionTypeId) {

    try {
      Query q = entityManager.createQuery("select cci from EConnectorsConnectionInfo cci join EConnectors c on c.id = cci.connectorId "
          + "where c.connectorCategory = :connectorCategory and c.connectorName = :connectorName "
          + "and cci.connectionTypeId = :connectionTypeId");
      q = q.setParameter("connectorCategory", connectorCategory);
      q = q.setParameter("connectorName", connectorName);
      q = q.setParameter("connectionTypeId", connectionTypeId);
      List<EConnectorsConnectionInfo> eConnectorsConnectionInfoList = q.getResultList();
      if(!eConnectorsConnectionInfoList.isEmpty()) {
        return eConnectorsConnectionInfoList.get(0);
      } else {
        return null;
      }
    } catch (Exception e) {
      logger.error("Returned null Exception: {}", e.getMessage());
      return null;
    }

  }
  
  @Override
  public EConnectorsConnectionInfo getByConnectorAndConnectionTypeWithoutCustomerId(String connectorCategory, String connectorName,
      Integer connectionTypeId) {

    try {
      Query q = entityManager.createNativeQuery("select cci.* from admin.connectors_connection_info cci join admin.connectors c on c.id = cci.connector_id "
          + "where c.connector_category = '"+connectorCategory+"' and c.connector_name = '"+connectorName+"' "
          + "and cci.connection_type_id = "+connectionTypeId+" order by cci.last_updated_time desc", EConnectorsConnectionInfo.class);
      
      List<EConnectorsConnectionInfo> eConnectorsConnectionInfoList = q.getResultList();
      if(!eConnectorsConnectionInfoList.isEmpty()) {
        return eConnectorsConnectionInfoList.get(0);
      } else {
        return null;
      }
    } catch (Exception e) {
      logger.error("Returned null Exception: {}", e.getMessage());
      return null;
    }

  }

	@Override
	public Boolean checkByConnectorNameAndConnectionCategory(String connectorName,String connectionCategory) {
		Boolean flag = false;
		try {
			Query q = entityManager.createNativeQuery(
					"select cci.* from admin.connectors_connection_info cci join admin.connectors c on c.id = cci.connector_id "
							+ "where c.connector_name = '" + connectorName + "' and c.connector_category = '"
							+ connectionCategory + "'",EConnectorsConnectionInfo.class);

			List<EConnectorsConnectionInfo> eConnectorsConnectionInfoList = q.getResultList();
			if (!eConnectorsConnectionInfoList.isEmpty()) {
				EConnectorsConnectionInfo eObj = eConnectorsConnectionInfoList.get(0);
				flag= eObj.getConnectorStatus();
			} else {
				flag= false;
			}
		} catch (Exception e) {
			logger.error("Returned null Exception: {}", e.getMessage());
			return false;
		}
		return flag;
	}

  @Override
  public EConnectorsConnectionInfo findByConnectorsConnectionInfoId(Integer id) {
    try {
      Query q = entityManager
          .createQuery("select d from EConnectorsConnectionInfo d where d.id = :id").setParameter("id", id);
      return (EConnectorsConnectionInfo) q.getSingleResult();
    } catch (Exception e) {
      logger.error("ConnectorsConnectionInfoDaoImpl.EConnectorsConnectionInfo Exception: {}", e.getMessage());
      throw new AsimilyDataException("ConnectorsConnectionInfoDaoImpl.EConnectorsConnectionInfo Exception: " + e.getMessage());
    }
  }
  
  @Override
  List<EConnectorsConnectionInfo> getAllConnectorConnection() {
    try {
      Query q = entityManager.createQuery("select d from EConnectorsConnectionInfo");
      List<EConnectorsConnectionInfo> eConnectorsConnectionInfoList = q.getResultList();
      if(!eConnectorsConnectionInfoList.isEmpty()) {
        return eConnectorsConnectionInfoList;
      } else {
        return null;
      }
    } catch (Exception e) {
      logger.error("Returned getAllConnectorConnection Exception: {}", e.getMessage());
      return null;
    }
  }
}
