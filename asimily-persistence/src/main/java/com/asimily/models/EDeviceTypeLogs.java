package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "device_type_logs", schema = "portal")
public class EDeviceTypeLogs extends ETenantBase{
  @Column(name = "device_info_id")
  private Integer deviceInfoId;
  
  @Column(name = "device_type")
  private Integer deviceTypeId;
  
  @Column(name = "log_txt")
  private String logText;

  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
  }

  public Integer getDeviceTypeId() {
    return deviceTypeId;
  }

  public void setDeviceTypeId(Integer deviceTypeId) {
    this.deviceTypeId = deviceTypeId;
  }

  public String getLogText() {
    return logText;
  }

  public void setLogText(String logText) {
    this.logText = logText;
  }
  
}
