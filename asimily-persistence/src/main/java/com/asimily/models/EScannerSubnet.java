package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "scanner_subnet", schema = "customer_config")
public class EScannerSubnet extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "ip_addr")
  private String ipAddr;

  private String description;

  public String getIpAddr() {
    return ipAddr;
  }

  public void setIpAddr(String ipAddr) {
    this.ipAddr = ipAddr;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
