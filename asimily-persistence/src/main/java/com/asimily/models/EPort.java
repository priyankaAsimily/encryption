package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the tcp_port database table.
 * 
 */
@Entity
@Table(name = "port", schema = "raw_on_prem")
public class EPort extends ETenantBase {
  private static final long serialVersionUID = 1L;

  private Integer port;

  private Integer transport;

  public EPort() {
  }

  public Integer getPort() {
    return this.port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public Integer getTransport() {
    return transport;
  }

  public void setTransport(Integer transport) {
    this.transport = transport;
  }

}