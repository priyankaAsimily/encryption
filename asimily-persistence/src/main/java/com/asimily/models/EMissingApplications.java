package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "missing_applications", schema = "portal")
public class EMissingApplications extends ETenantBase {

  private static final long serialVersionUID = 1L;
  
  @Column(name = "device_info_id")
  private Integer deviceInfoId;
  
  @Column(name = "app_version_id")
  private String applicationVersionId;

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
  
  
  
}
