package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * The persistent class for the impacted_device_cve_view database view.
 *
 */
@Entity
@Table(name = "impacted_device_cve_view", schema = "portal")
public class EImpactedDeviceCveView extends EBase implements Serializable {
  private static final long serialVersionUID = 1L;

  @Column(name = "cve_id")
  private Integer cveId;

  @Column(name = "device_info_id")
  private Integer deviceInfoId;

  @Column(name = "nvd_cve_product_id")
  private Integer cveProductId;

  @Column(name = "host_name")
  private String hostName;

  @Column(name = "mac_addr")
  private String macAddr;

  @Column(name = "ip_addr")
  private String ipAddr;

  @Column(name = "mfg_id")
  private String mfgId;

  @Column(name = "device_type")
  private Integer deviceType;

  @Column(name = "likelihood")
  private Double likelihood;

  @Column(name = "vulnerability_score")
  private Double vulnerabilityScore;

  @Column(name = "is_fixed")
  private Integer isFixed;

  @Column(name = "sub_device_type_id")
  private Integer subDeviceTypeId;

  public Integer getCveId() {
    return cveId;
  }

  public void setCveId(Integer cveId) {
    this.cveId = cveId;
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

  public String getMfgId() {
    return mfgId;
  }

  public void setMfgId(String mfgId) {
    this.mfgId = mfgId;
  }

  public Integer getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(Integer deviceType) {
    this.deviceType = deviceType;
  }

  public Double getLikelihood() {
    return likelihood;
  }

  public void setLikelihood(Double likelihood) {
    this.likelihood = likelihood;
  }

  public Double getVulnerabilityScore() {
    return vulnerabilityScore;
  }

  public void setVulnerabilityScore(Double vulnerabilityScore) {
    this.vulnerabilityScore = vulnerabilityScore;
  }

  public Integer getIsFixed() {
    return isFixed;
  }

  public void setIsFixed(Integer isFixed) {
    this.isFixed = isFixed;
  }

  public Integer getCveProductId() {
    return cveProductId;
  }

  public void setCveProductId(Integer cveProductId) {
    this.cveProductId = cveProductId;
  }

  public Integer getSubDeviceTypeId() {
    return subDeviceTypeId;
  }

  public void setSubDeviceTypeId(Integer subDeviceTypeId) {
    this.subDeviceTypeId = subDeviceTypeId;
  }
}
