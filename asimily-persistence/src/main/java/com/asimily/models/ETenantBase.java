package com.asimily.models;


import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.eclipse.persistence.annotations.AdditionalCriteria;
@MappedSuperclass
// Since eclipselink ignores additionalCriteria of base classes!
@AdditionalCriteria("(this.customerId=:USER_CUST_ID OR this.customerId=:ASIMILY_CUST_ID) AND (this.softDelete = false OR this.softDelete is NULL)")
public class ETenantBase extends EBase{

  private static final long serialVersionUID = 1L;

  @Column(name = "customer_id")
  private Integer customerId;

  public Integer getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }

}
