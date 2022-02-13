package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "nexpose_sync_raw_device_info", schema = "raw_third_party")
public class ERapid7SyncRawDeviceInfo extends ETenantBase {

  private static final long serialVersionUID = 1L;

  @Column(name = "host_name")
  private String hostName;

  private String ip;

  @Column(name = "mac_addrs")
  private String macAddrs;

  @Column(name = "os_name")
  private String osName;

  @Column(name = "scan_history")
  private String scanHistory;

  @Column(name = "os_fingerprint")
  private String osFingerprint;

  @Column(name = "raw_risk_score")
  private String rawRiskScore;

  @Column(name = "risk_score")
  private String riskScore;
  
  @Column(name = "os_version")
  private String osVersion;
  
  @Column(name = "os_vendor")
  private String osVendor;
  
  @Column(name = "os_family")
  private String osFamily;

  public String getHostName() {
    return hostName;
  }

  public void setHostName(String hostName) {
    this.hostName = hostName;
  }

  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public String getMacAddrs() {
    return macAddrs;
  }

  public void setMacAddrs(String macAddrs) {
    this.macAddrs = macAddrs;
  }

  public String getOsName() {
    return osName;
  }

  public void setOsName(String osName) {
    this.osName = osName;
  }

  public String getScanHistory() {
    return scanHistory;
  }

  public void setScanHistory(String scanHistory) {
    this.scanHistory = scanHistory;
  }

  public String getOsFingerprint() {
    return osFingerprint;
  }

  public void setOsFingerprint(String osFingerprint) {
    this.osFingerprint = osFingerprint;
  }

  public String getRawRiskScore() {
    return rawRiskScore;
  }

  public void setRawRiskScore(String rawRiskScore) {
    this.rawRiskScore = rawRiskScore;
  }

  public String getRiskScore() {
    return riskScore;
  }

  public void setRiskScore(String riskScore) {
    this.riskScore = riskScore;
  }

  public String getOsVersion() {
    return osVersion;
  }

  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }

  public String getOsVendor() {
    return osVendor;
  }

  public void setOsVendor(String osVendor) {
    this.osVendor = osVendor;
  }

  public String getOsFamily() {
    return osFamily;
  }

  public void setOsFamily(String osFamily) {
    this.osFamily = osFamily;
  }
  
}
