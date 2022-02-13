package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "device_bacnet", schema = "portal")
public class EDeviceBacnet extends ETenantBase{
  @Column(name = "device_info_id")
  private Integer deviceInfoId;
  
  @Column(name = "bacnet_field_id")
  private Integer bacnetFieldId;
  
  @Column(name = "bacnet_field_value")
  private String bacnetFieldValue;  
  
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

  public Integer getBacnetFieldId() {
    return bacnetFieldId;
  }

  public void setBacnetFieldId(Integer bacnetFieldId) {
    this.bacnetFieldId = bacnetFieldId;
  }

  public String getBacnetFieldValue() {
    return bacnetFieldValue;
  }

  public void setBacnetFieldValue(String bacnetFieldValue) {
    this.bacnetFieldValue = bacnetFieldValue;
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
