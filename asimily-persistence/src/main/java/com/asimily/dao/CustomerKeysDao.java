package com.asimily.dao;

import com.asimily.models.ECustomerKeys;

public interface CustomerKeysDao extends BaseDao<ECustomerKeys, Integer>, CustomerKeysDaoCustom {

  ECustomerKeys findByCustomerId(Integer customerId);
}
