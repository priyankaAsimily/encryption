package com.asimily.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "device_port_service_name_view", schema = "portal")
public class EDevicePortServiceNameView extends ETenantBase implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "device_info_id")
  protected Integer deviceInfoId;

  @Column(name = "proto_service_name")
  private String protoServiceName;

  @Column(name = "proto_version")
  private String protoVersion;

  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
  }

  public String getProtoServiceName() {
    return protoServiceName;
  }

  public void setProtoServiceName(String protoServiceName) {
    this.protoServiceName = protoServiceName;
  }

  public String getProtoVersion() {
    return protoVersion;
  }

  public void setProtoVersion(String protoVersion) {
    this.protoVersion = protoVersion;
  }

}
