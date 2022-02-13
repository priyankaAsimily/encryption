package com.asimily.dao;

import com.asimily.models.EMasterKeys;

public interface MasterKeysDao extends BaseDao<EMasterKeys, Integer>, MasterKeysDaoCustom {

  EMasterKeys findByCustomerId(Integer customerId);
}
