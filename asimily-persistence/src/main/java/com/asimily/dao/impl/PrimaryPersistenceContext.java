package com.asimily.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.asimily.common.PersistenceAppConstants;

public class PrimaryPersistenceContext {

  protected static EntityManager entityManager;

  @PersistenceContext(unitName = PersistenceAppConstants.PERSISTENCE_UNITNAME)
  public void setFirstEntityManager(EntityManager entityManager) {
    this.entityManager = entityManager;
  }

}
