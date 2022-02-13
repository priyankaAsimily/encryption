package com.asimily.dao.impl;

import com.asimily.dao.CustomerInfoDaoCustom;
import com.asimily.exception.AsimilyDataException;
import com.asimily.models.EDeviceAnomaly;
import com.asimily.models.ECustomerInfo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomerInfoDaoImpl extends PrimaryPersistenceContext implements CustomerInfoDaoCustom{

  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  @Override
  public ECustomerInfo getById(Integer id) {
    try {
		Query q = entityManager
		    .createQuery("select d from ECustomerInfo d where d.id = :id")
		    .setParameter("id", id);
		return (ECustomerInfo) q.getSingleResult();
	} catch (Exception e) {
		logger.error("CustomerInfoDaoImpl.getById Exception: {}",e.getMessage());
		throw new AsimilyDataException("CustomerInfoDaoImpl.getById Exception: "+e.getMessage());
	}
  }

}
