package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "customer_keys", schema = "customer_config")
public class ECustomerKeys extends ETenantBase {

  private static final long serialVersionUID = 1L;

  @Column(name = "customer_id")
  private Integer customerId;
  
  @Column(name = "customer_key")
  private String customerKey;
  
  public Integer getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }

  public String getCustomerKey() {
    return customerKey;
  }

  public void setCustomerKey(String customerKey) {
    this.customerKey = customerKey;
  }

}
