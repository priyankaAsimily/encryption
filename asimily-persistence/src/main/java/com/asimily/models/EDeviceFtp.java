package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "device_ftp", schema = "portal")
public class EDeviceFtp extends ETenantBase {

  private static final long serialVersionUID = 1L;

  @Column(name = "device_info_id")
  private Integer deviceInfoId;

  @Column(name = "banner")
  private String banner;

  @Column(name = "system")
  private String system;

  @Column(name = "os_version")
  private String osVersion;

  @Column(name = "transfer_type")
  private String transferType;

  @Column(name = "client_software")
  private String clientSoftware;

  @Column(name = "server_username")
  private String serverUsername;

  @Column(name = "server_password")
  private String serverPassword;
  
  @Column(name = "metadata_id")
  private Integer metadataId;
  
  @Column(name = "record_id")
  private Integer recordId;

  @Column(name = "anomaly")
  private Integer anomaly;

  @Column(name = "is_sender")
  private Boolean isSender;

  @Column(name = "peer_device_info_id")
  private Integer peerDeviceInfoId;

  @Column(name = "peer_mac")
  private String peerMac;

  @Column(name = "peer_ip")
  private String peerIp;

  @Column(name = "device_anomaly_id")
  private String deviceAnomalyId;

  public Integer getAnomaly() {
    return anomaly;
  }

  public void setAnomaly(Integer anomaly) {
    this.anomaly = anomaly;
  }

  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
  }

  public String getBanner() {
    return banner;
  }

  public void setBanner(String banner) {
    this.banner = banner;
  }

  public String getSystem() {
    return system;
  }

  public void setSystem(String system) {
    this.system = system;
  }

  public String getOsVersion() {
    return osVersion;
  }

  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }

  public String getTransferType() {
    return transferType;
  }

  public void setTransferType(String transferType) {
    this.transferType = transferType;
  }

  public String getClientSoftware() {
    return clientSoftware;
  }

  public void setClientSoftware(String clientSoftware) {
    this.clientSoftware = clientSoftware;
  }

  public String getServerUsername() {
    return serverUsername;
  }

  public void setServerUsername(String serverUsername) {
    this.serverUsername = serverUsername;
  }

  public String getServerPassword() {
    return serverPassword;
  }

  public void setServerPassword(String serverPassword) {
    this.serverPassword = serverPassword;
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

  public Boolean getIsSender() {
    return isSender;
  }

  public void setIsSender(Boolean isSender) {
    this.isSender = isSender;
  }

  public Integer getPeerDeviceInfoId() {
    return peerDeviceInfoId;
  }

  public void setPeerDeviceInfoId(Integer peerDeviceInfoId) {
    this.peerDeviceInfoId = peerDeviceInfoId;
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

  public String getDeviceAnomalyId() {
    return deviceAnomalyId;
  }

  public void setDeviceAnomalyId(String deviceAnomalyId) {
    this.deviceAnomalyId = deviceAnomalyId;
  }

}
