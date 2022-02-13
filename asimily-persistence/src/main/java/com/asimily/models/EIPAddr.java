package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the ip_addr database table.
 * 
 */
@Entity
@Table(name = "ip_addr", schema = "raw_on_prem")
public class EIPAddr extends ETenantBase {
  private static final long serialVersionUID = 1L;

  private String addr;

  private Integer version;

  public EIPAddr() {
  }

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getAddr() {
    return this.addr;
  }

  public void setAddr(String addr) {
    this.addr = addr;
  }

 
  public Integer getVersion() {
    return this.version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

 
}