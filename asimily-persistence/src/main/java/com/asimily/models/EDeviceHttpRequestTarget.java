package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.asimily.models.EBase;

@Entity
@Table(name = "device_http_request_target", schema = "portal")
public class EDeviceHttpRequestTarget extends ETenantBase {

  @Column(name = "device_info_id")
  private Integer deviceInfoId;

  @Column(name = "device_http_id")
  private Integer deviceHttpId;

  @Column(name = "request_target")
  private String requestTarget;

  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
  }

  public Integer getDeviceHttpId() {
    return deviceHttpId;
  }

  public void setDeviceHttpId(Integer deviceHttpId) {
    this.deviceHttpId = deviceHttpId;
  }

  public String getRequestTarget() {
    return requestTarget;
  }

  public void setRequestTarget(String requestTarget) {
    this.requestTarget = requestTarget;
  }

}
