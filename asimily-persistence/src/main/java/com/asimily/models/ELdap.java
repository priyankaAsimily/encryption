package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ldap", schema = "raw_on_prem")
public class ELdap extends ETenantBase {

  @Column(name = "protocol_operation")
  private Integer protocolOperation;

  @Column(name = "host_name")
  private String hostName;

  public Integer getProtocolOperation() {
    return this.protocolOperation;
  }

  public void setProtocolOperation(Integer protocolOperation) {
    this.protocolOperation = protocolOperation;
  }

  public String getHostName() {
    return hostName;
  }

  public void setHostName(String hostName) {
    this.hostName = hostName;
  }

}
