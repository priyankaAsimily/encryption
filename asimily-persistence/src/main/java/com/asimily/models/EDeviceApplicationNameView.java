package com.asimily.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "device_application_name_view", schema = "portal")
public class EDeviceApplicationNameView extends ETenantBase implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "device_info_id")
  protected Integer deviceInfoId;

  @Column(name = "application_name")
  private String applicationName;
  
  @Column(name = "application_version")
  private String applicationVersion;

  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
  }

  public String getApplicationName() {
    return applicationName;
  }

  public void setApplicationName(String applicationName) {
    this.applicationName = applicationName;
  }

  public String getApplicationVersion() {
    return applicationVersion;
  }

  public void setApplicationVersion(String applicationVersion) {
    this.applicationVersion = applicationVersion;
  }

}
