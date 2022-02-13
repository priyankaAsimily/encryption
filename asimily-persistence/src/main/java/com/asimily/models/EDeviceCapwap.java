package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.asimily.models.EBase;

@Entity
@Table(name = "device_capwap", schema = "portal")
public class EDeviceCapwap extends ETenantBase {

  @Column(name = "device_info_id")
  private Integer deviceInfoId;

  @Column(name = "is_source")
  private Boolean isSource;

  @Column(name = "wlan_control_field")
  private String wlanControlField;

  @Column(name = "wlan_payload")
	private byte[] wlanPayload;
  
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

  public Boolean getIsSource() {
    return isSource;
  }

  public void setIsSource(Boolean isSource) {
    this.isSource = isSource;
  }

  public String getWlanControlField() {
    return wlanControlField;
  }

  public void setWlanControlField(String wlanControlField) {
    this.wlanControlField = wlanControlField;
  }

  public byte[] getWlanPayload() {
    return this.wlanPayload;
  }

  public void setWlanPayload(byte[] wlanPayload) {
    this.wlanPayload = wlanPayload;
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
