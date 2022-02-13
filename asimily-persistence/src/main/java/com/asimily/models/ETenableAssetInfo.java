package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tenable_asset_info", schema = "raw_third_party")
public class ETenableAssetInfo extends ETenantBase {

  private static final long serialVersionUID = 1L;
  
  @Column(name = "asset_id")
  private String assetId;
  
  @Column(name = "device_info_id")
  private Integer deviceInfoId;
  
  @Column(name = "host_name")
  private String hostName;
  
  @Column(name = "ipv4_addrs")
  private String ipv4Addrs;
  
  @Column(name = "ipv6_addrs")
  private String ipv6Addrs;

  @Column(name = "mac_addrs")
  private String macAddrs;
  
  @Column(name = "os_name")
  private String osName;

  @Column(name = "scan_source")
  private String scanSource;
  
  @Column(name = "fqdn")
  private String fqdn;

  public String getAssetId() {
    return assetId;
  }

  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
  }

  public String getHostName() {
    return hostName;
  }

  public void setHostName(String hostName) {
    this.hostName = hostName;
  }

  public String getIpv4Addrs() {
    return ipv4Addrs;
  }

  public void setIpv4Addrs(String ipv4Addrs) {
    this.ipv4Addrs = ipv4Addrs;
  }

  public String getIpv6Addrs() {
    return ipv6Addrs;
  }

  public void setIpv6Addrs(String ipv6Addrs) {
    this.ipv6Addrs = ipv6Addrs;
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

  public String getScanSource() {
    return scanSource;
  }

  public void setScanSource(String scanSource) {
    this.scanSource = scanSource;
  }

  public String getFqdn() {
    return fqdn;
  }

  public void setFqdn(String fqdn) {
    this.fqdn = fqdn;
  }

}
