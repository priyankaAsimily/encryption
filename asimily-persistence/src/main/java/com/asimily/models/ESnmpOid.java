package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "snmp_oid", schema = "raw_on_prem")
public class ESnmpOid extends ETenantBase {
  private static final long serialVersionUID = 1L;


  @Column(name = "snmp_oid")
  private String snmpOIdId;


  public ESnmpOid() {
  }


  public String getSnmpOIdId() {
    return snmpOIdId;
  }

  public void setSnmpOIdId(String snmpOIdId) {
    this.snmpOIdId = snmpOIdId;
  }
}
