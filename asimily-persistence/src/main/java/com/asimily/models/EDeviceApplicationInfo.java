package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

/**
 * The persistent class for the device_application_info database table.
 * 
 */
@Entity
@Table(name = "device_application_info", schema = "portal")
public class EDeviceApplicationInfo extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "app_version_id")
  private String applicationVersionId;

  /*
  @ManyToOne
  @JoinColumn(name = "device_info_id", referencedColumnName = "id")
  private EDeviceInfo deviceInfo;
  */
  @Column(name = "device_info_id")
  private Integer deviceInfoId;
  
  @Column(name = "metadata_id")
  private Integer metadataId;
  
  @Column(name = "record_id")
  private Integer recordId;

  public EDeviceApplicationInfo(){
  }

  /*
  public EDeviceInfo getDeviceInfo() {
    return deviceInfo;
  }

  public void setDeviceInfo(EDeviceInfo deviceInfo) {
    this.deviceInfo = deviceInfo;
  }
  */

  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
  }

  public String getApplicationVersionId() {
    return applicationVersionId;
  }

  public void setApplicationVersionId(String applicationVersionId) {
    this.applicationVersionId = applicationVersionId;
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

  @Override
  public String toString() {
    return "EDeviceApplicationInfo{" +
        "applicationVersionId=" + applicationVersionId +
        ", deviceInfoId=" + deviceInfoId +
        ", id=" + id +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EDeviceApplicationInfo that = (EDeviceApplicationInfo) o;
    return Objects.equals(applicationVersionId, that.applicationVersionId) &&
        Objects.equals(deviceInfoId, that.deviceInfoId);
  }

  @Override
  public int hashCode() {

    return Objects.hash(applicationVersionId, deviceInfoId);
  }
}
