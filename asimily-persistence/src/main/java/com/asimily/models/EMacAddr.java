package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "mac_addr",schema="raw_on_prem")
public class EMacAddr extends ETenantBase {
  private static final long serialVersionUID = 1L;

  private String addr;

  public EMacAddr() {
  }

  public String getAddr() {
    return this.addr;
  }

  public void setAddr(String addr) {
    this.addr = addr;
  }

}
