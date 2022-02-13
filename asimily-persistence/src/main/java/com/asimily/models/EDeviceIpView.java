package com.asimily.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The persistent class for the application_view database view.
 *
 */
@Entity
@Table(name = "device_ip_view", schema = "portal")
public class EDeviceIpView extends Object implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "device_info_id")
  protected Integer deviceInfoId;

  @Column(name = "mac_addr")
  private String macAddr;

  @Column(name = "ip_addr")
  private String ipAddr;

  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
  }

  public String getMacAddr() {
    return macAddr;
  }

  public void setMacAddr(String macAddr) {
    this.macAddr = macAddr;
  }

  public String getIpAddr() {
    return ipAddr;
  }

  public void setIpAddr(String ipAddr) {
    this.ipAddr = ipAddr;
  }

}
