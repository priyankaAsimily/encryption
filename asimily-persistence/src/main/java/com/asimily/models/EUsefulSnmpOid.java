package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "useful_snmp_info", schema = "raw_cloud")
public class EUsefulSnmpOid extends EBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "snmp_oid")
  private String snmpOid;

  @Column(name = "oid_value")
  private String oidValue;

  @Column(name = "attribute_id")
  private Integer attributeId;

  @Column(name = "attribute_value")
  private String attributeValue;

  private String description;

  @Column(name = "insert_src")
  private String insertSrc;

  public EUsefulSnmpOid() {
  }

  public String getSnmpOid() {
    return snmpOid;
  }

  public void setSnmpOid(String snmpOid) {
    this.snmpOid = snmpOid;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getInsertSrc() {
    return insertSrc;
  }

  public void setInsertSrc(String insertSrc) {
    this.insertSrc = insertSrc;
  }

  public String getOidValue() {
    return oidValue;
  }

  public void setOidValue(String oidValue) {
    this.oidValue = oidValue;
  }

  public Integer getAttributeId() {
    return attributeId;
  }

  public void setAttributeId(Integer attributeId) {
    this.attributeId = attributeId;
  }

  public String getAttributeValue() {
    return attributeValue;
  }

  public void setAttributeValue(String attributeValue) {
    this.attributeValue = attributeValue;
  }
}
