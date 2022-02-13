
package com.asimily.models;

import java.sql.Timestamp;

import javax.persistence.*;

/**
 * The persistent class for the document_key_values_security_posture database
 * table.
 *
 */
@Entity
@Table(name = "device_doc_key_value", schema = "portal")
public class EDeviceDocKeyValue extends ETenantBase {

  private static final long serialVersionUID = 1L;

  @Column(name = "create_time")
  private Timestamp createTime;

  @Column(name = "customer_id")
  private Integer customerId;

  @Column(name = "create_user_id")
  private Integer createUserId;

  @Column(name = "document_id")
  private Integer documentId;

  @Column(name = "key_notes")
  private String keyNotes;

  @Column(name = "key_value")
  private String keyValue;

  @Column(name = "key_score")
  private Integer keyScore;

  @Column(name = "key_info_id")
  private Integer keysInfoId;

  @Column(name = "last_update_user_id")
  private Integer lastUpdateUserId;

  @Column(name = "is_template")
  private Boolean isTemplate;

  @Column(name = "soft_delete")
  private Boolean softDelete;

//  @ManyToOne
//  @JoinColumn(name = "device_info_id", referencedColumnName = "id")
//  private EDeviceInfo deviceInfo;
  @Column(name = "device_info_id")
  private Integer deviceInfoId;

  @Column(name = "key_device_software")
  private String keyDeviceSoftware;

  @Column(name = "key_device_firmware")
  private String keyDeviceFirmware;

  @Column(name = "key_security_addons")
  private String keySecurityAddOns;

  public EDeviceDocKeyValue() {
  }

  public Integer getCustomerId() {
      return customerId;
  }

  public void setCustomerId(Integer customerId) {
      this.customerId = customerId;
  }

  public Timestamp getCreateTime() {
      return this.createTime;
  }

  public void setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
  }

  public Integer getCreateUserId() {
    return this.createUserId;
  }

  public void setCreateUserId(Integer createUserId) {
    this.createUserId = createUserId;
  }

  public String getKeyNotes() {
    return this.keyNotes;
  }

  public void setKeyNotes(String keyNotes) {
    this.keyNotes = keyNotes;
  }

  public String getKeyValue() {
    return this.keyValue;
  }

  public void setKeyValue(String keyValue) {
    this.keyValue = keyValue;
  }

  public Integer getKeysInfoId() {
    return this.keysInfoId;
  }

  public void setKeysInfoId(Integer keysInfoId) {
    this.keysInfoId = keysInfoId;
  }

  public Integer getLastUpdateUserId() {
    return this.lastUpdateUserId;
  }

  public void setLastUpdateUserId(Integer lastUpdateUserId) {
    this.lastUpdateUserId = lastUpdateUserId;
  }

  public Integer getKeyScore() {
    return keyScore;
  }

  public void setKeyScore(Integer keyScore) {
    this.keyScore = keyScore;
  }

  public Integer getDocumentId() {
    return documentId;
  }

  public void setDocumentId(Integer documentId) {
    this.documentId = documentId;
  }

  public Boolean getIsTemplate() {
    return isTemplate;
  }

  public void setIsTemplate(Boolean isTemplate) {
    this.isTemplate = isTemplate;
  }


public Boolean getSoftDelete() {
    return softDelete;
}


public void setSoftDelete(Boolean softDelete) {
    this.softDelete = softDelete;
}

public Integer getDeviceInfoId() {
  return deviceInfoId;
}

public void setDeviceInfoId(Integer deviceInfoId) {
  this.deviceInfoId = deviceInfoId;
}

  public String getKeyDeviceSoftware() {
    return this.keyDeviceSoftware;
  }

  public void setKeyDeviceSoftware(String keyDeviceSoftware) {
    this.keyDeviceSoftware = keyDeviceSoftware;
  }

  public String getKeyDeviceFirmware() {
    return this.keyDeviceFirmware;
  }

  public void setKeyDeviceFirmware(String keyDeviceFirmware) {
    this.keyDeviceFirmware = keyDeviceFirmware;
  }

  public String getKeySecurityAddOns() {
    return this.keySecurityAddOns;
  }

  public void setKeySecurityAddOns(String keySecurityAddOns) {
    this.keySecurityAddOns = keySecurityAddOns;
  }

/*
public EDeviceInfo getDeviceInfo() {
    return deviceInfo;
}


public void setDeviceInfo(EDeviceInfo deviceInfo) {
    this.deviceInfo = deviceInfo;
}
*/




}
