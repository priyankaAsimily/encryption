package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "parsed_snmp_oid", schema = "raw_on_prem")
public class EParsedSnmpOid extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "snmp_oid")
  private String snmpOid;

  public EParsedSnmpOid() {
  }

  public String getSnmpOid() {
    return snmpOid;
  }

  public void setSnmpOid(String snmpOid) {
    this.snmpOid = snmpOid;
  }
}
