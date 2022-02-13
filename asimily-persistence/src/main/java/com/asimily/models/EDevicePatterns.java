package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.asimily.models.EBase;

@Entity
@Table(name = "device_patterns", schema = "portal")
public class EDevicePatterns extends EBase {

  @Id
  @Column(name = "customer_id")
  private Integer customerId;

  @Id
  @Column(name = "device_info_id")
  private Integer deviceInfoId;

  @Column(name = "patterns_list")
  private String patternsList;

  @Column(name = "is_sender")
  private Boolean isSender;

  @Column(name = "peer_mac")
  private String peerMac;

  @Column(name = "peer_ip")
  private String peerIp;

  @Column(name = "peer_device_info_id")
  private Integer peerDeviceInfoId;

  @Column(name = "device_anomaly_id")
  private String deviceAnomalyId;

  @Column(name = "metadata_id")
  private Integer metadataId;

  @Column(name = "record_id")
  private Integer recordId;

  public Integer getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }

  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
  }

  public String getPatternsList() {
    return patternsList;
  }

  public void setPatternsList(String patternsList) {
    this.patternsList = patternsList;
  }

  public Boolean getIsSender() {
    return isSender;
  }

  public void setIsSender(Boolean isSender) {
    this.isSender = isSender;
  }

  public Integer getMetadataId() {
    return metadataId;
  }

  public void setMetadataId(Integer metadataId) {
    this.metadataId = metadataId;
  }

  public Integer getRecordId() {
    return recordId;
  }

  public void setRecordId(Integer recordId) {
    this.recordId = recordId;
  }

  public String getPeerMac() {
    return peerMac;
  }

  public void setPeerMac(String peerMac) {
    this.peerMac = peerMac;
  }

  public String getPeerIp() {
    return peerIp;
  }

  public void setPeerIp(String peerIp) {
    this.peerIp = peerIp;
  }

  public Integer getPeerDeviceInfoId() {
    return peerDeviceInfoId;
  }

  public void setPeerDeviceInfoId(Integer peerDeviceInfoId) {
    this.peerDeviceInfoId = peerDeviceInfoId;
  }

  public String getDeviceAnomalyId() {
    return deviceAnomalyId;
  }

  public void setDeviceAnomalyId(String deviceAnomalyId) {
    this.deviceAnomalyId = deviceAnomalyId;
  }

}
