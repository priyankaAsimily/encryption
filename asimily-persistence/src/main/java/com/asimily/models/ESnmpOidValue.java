package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "snmp_oid_value", schema = "raw_on_prem")
public class ESnmpOidValue extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "snmp_id")
  private Integer snmpId;

  @Column(name = "snmp_oid_id")
  private Integer snmpOIdId;

  @Column(name = "oid_value")
  private String oidValue;


  public ESnmpOidValue() {
  }

  public Integer getSnmpId() {
    return snmpId;
  }

  public void setSnmpId(Integer snmpId) {
    this.snmpId = snmpId;
  }

  public Integer getSnmpOIdId() {
    return snmpOIdId;
  }

  public void setSnmpOIdId(Integer snmpOIdId) {
    this.snmpOIdId = snmpOIdId;
  }

  public String getOidValue() {
    return oidValue;
  }

  public void setOidValue(String oidValue) {
    this.oidValue = oidValue;
  }
}
