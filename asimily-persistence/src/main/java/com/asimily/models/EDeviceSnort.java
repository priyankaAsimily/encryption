package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.asimily.models.EBase;

@Entity
@Table(name = "device_snort", schema = "portal")
public class EDeviceSnort extends EBase {

  @Id
  @Column(name = "customer_id")
  private Integer customerId;

  @Id
  @Column(name = "device_info_id")
  private Integer deviceInfoId;

  @Column(name = "is_sender")
  private Boolean isSender;

  @Column(name = "peer_ip")
  private String peerIp;

  @Column(name = "peer_device_info_id")
  private Integer peerDeviceInfoId;

  @Column(name = "device_anomaly_id")
  private String deviceAnomalyId;

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

  public Boolean getIsSender() {
    return isSender;
  }

  public void setIsSender(Boolean isSender) {
    this.isSender = isSender;
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
