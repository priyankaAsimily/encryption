package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the device_impact database table.
 * 
 */
@Entity
@Table(name = "device_impact", schema = "portal")
public class EDeviceImpact extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "key_id")
  private Integer keyId;

  @Column(name = "key_value")
  private String keyValue;

  @Column(name = "device_info_id")
  private Integer deviceInfoId;

  public EDeviceImpact() {
  }

  public String getKeyValue() {
    return this.keyValue;
  }

  public void setKeyValue(String keyValue) {
    this.keyValue = keyValue;
  }

  public Integer getKeyId() {
    return keyId;
  }

  public void setKeyId(Integer keyId) {
    this.keyId = keyId;
  }

  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
  }

}