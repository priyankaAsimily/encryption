package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "device_nac_info", schema = "portal")
public class EDeviceNacInfo extends ETenantBase {

  private static final long serialVersionUID = 1L;

  @Column(name = "device_info_id")
  private Integer deviceInfoId;
  
  @Column(name = "nac_policy_id")
  private Integer nacPolicyId;
  
  @Column(name = "insert_src")
  private Integer insertSrc;

  @Column(name = "ip_addr")
  private String ipAddr;

  @Column(name = "mac_addr")
  private String macAddr;

  @Column(name = "session_info")
  private String sessionInfo;

  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
  }

  public Integer getNacPolicyId() {
    return nacPolicyId;
  }

  public void setNacPolicyId(Integer nacPolicyId) {
    this.nacPolicyId = nacPolicyId;
  }

  public Integer getInsertSrc() {
    return insertSrc;
  }

  public void setInsertSrc(Integer insertSrc) {
    this.insertSrc = insertSrc;
  }

  public String getIpAddr() {
    return ipAddr;
  }

  public void setIpAddr(String ipAddr) {
    this.ipAddr = ipAddr;
  }

  public String getMacAddr() {
    return macAddr;
  }

  public void setMacAddr(String macAddr) {
    this.macAddr = macAddr;
  }

  public String getSessionInfo() {
    return sessionInfo;
  }

  public void setSessionInfo(String sessionInfo) {
    this.sessionInfo = sessionInfo;
  }
}
