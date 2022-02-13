package com.asimily.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "external_connectivity_ip_view", schema = "portal")
public class EExternalConnectivityIpView extends Object implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "device_info_id")
  protected Integer deviceInfoId;

  @Column(name = "external_connectivity")
  private String externalConnectivity;

  @Column(name = "external_connectivity_value")
  private String externalConnectivityValue;

  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
  }

  public String getExternalConnectivity() {
    return externalConnectivity;
  }

  public void setExternalConnectivity(String externalConnectivity) {
    this.externalConnectivity = externalConnectivity;
  }

  public String getExternalConnectivityValue() {
    return externalConnectivityValue;
  }

  public void setExternalConnectivityValue(String externalConnectivityValue) {
    this.externalConnectivityValue = externalConnectivityValue;
  }

}
