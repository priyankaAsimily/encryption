package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "master_keys", schema = "customer_config")
public class EMasterKeys extends ETenantBase {

  private static final long serialVersionUID = 1L;

  @Column(name = "customer_id")
  private Integer customerId;
  
  @Column(name = "master_key")
  private String masterKey;
  
  public Integer getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }

  public String getMasterKey() {
    return masterKey;
  }

  public void setMasterKey(String masterKey) {
    this.masterKey = masterKey;
  }

}
