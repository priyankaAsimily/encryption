package com.asimily.dao.impl;

import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.asimily.dao.CustomerKeysDaoCustom;
import com.asimily.exception.AsimilyDataException;
import com.asimily.models.ECustomerKeys;

public class CustomerKeysDaoImpl extends PrimaryPersistenceContext implements CustomerKeysDaoCustom {

  private final Logger logger = LoggerFactory.getLogger(this.getClass());
  
}
