package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "device_snmp", schema = "portal")
public class EDeviceSnmp extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "device_info_id")
  private Integer deviceInfoId;

  // @Column(name = "parsed_snmp_oid_id")
  // private Integer parsedSnmpOidId;

  @Column(name = "snmp_oid")
  private String snmpOid;

  /*
   * @Column(name = "snmp_oid_value_id") private Integer snmpOidValueId;
   */

  private String value;

  @Column(name = "value_type")
  private String valueType;

  @Column(name = "community")
  private String community;

  private String version;

  @Column(name = "raw_snmp_oid")
  private String rawSnmpOid;

  @Column(name = "snmp_oid_value")
  private String snmpOidValue;
  
  @Column(name = "metadata_id")
  private Integer metadataId;
  
  @Column(name = "record_id")
  private Integer recordId;

  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public String getValueType() {
    return valueType;
  }

  public void setValueType(String valueType) {
    this.valueType = valueType;
  }

  /*
   * public Integer getSnmpOidValueId() { return snmpOidValueId; }
   * 
   * public void setSnmpOidValueId(Integer snmpOidValueId) { this.snmpOidValueId
   * = snmpOidValueId; }
   */

  public String getSnmpOid() {
    return snmpOid;
  }

  public void setSnmpOid(String snmpOid) {
    this.snmpOid = snmpOid;
  }

  public String getCommunity() {
    return community;
  }

  public void setCommunity(String community) {
    this.community = community;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public String getRawSnmpOid() {
    return rawSnmpOid;
  }

  public void setRawSnmpOid(String rawSnmpOid) {
    this.rawSnmpOid = rawSnmpOid;
  }

  public String getSnmpOidValue() {
    return snmpOidValue;
  }

  public void setSnmpOidValue(String snmpOidValue) {
    this.snmpOidValue = snmpOidValue;
  }
  
  public Integer getMetadataId() {
    return metadataId;
  }

  public void setMetadataId(Integer metadataId) {
    this.metadataId = metadataId;
  }

  public Integer getRecordId() {
    return recordId;
  }

  public void setRecordId(Integer recordId) {
    this.recordId = recordId;
  }

}
