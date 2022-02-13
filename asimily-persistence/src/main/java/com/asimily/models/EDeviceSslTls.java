package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "device_ssl_tls", schema = "portal")
public class EDeviceSslTls extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "device_info_id")
  private Integer deviceInfoId;

  @Column(name = "is_sender")
  private Boolean isSender;

  @Column(name = "version")
  private String version;

  @Column(name = "cipher_suite")
  private Integer cipherSuite;

  @Column(name = "host_name")
  private String hostName;

  @Column(name = "cert_info")
  private String certInfo;

  @Column(name = "server_ip")
  private String serverIp;

  @Column(name = "metadata_id")
  private Integer metadataId;
  
  @Column(name = "record_id")
  private Integer recordId;

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

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public Integer getCipherSuite() {
    return cipherSuite;
  }

  public void setCipherSuite(Integer cipherSuite) {
    this.cipherSuite = cipherSuite;
  }

  public String getHostName() {
    return hostName;
  }

  public void setHostName(String hostName) {
    this.hostName = hostName;
  }

  public String getCertInfo() {
    return certInfo;
  }

  public void setCertInfo(String certInfo) {
    this.certInfo = certInfo;
  }

  public String getServerIp() {
    return serverIp;
  }

  public void setServerIp(String serverIp) {
    this.serverIp = serverIp;
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
  
  @Override
  public String toString() {
    return "EDeviceSslTls{" + "deviceInfoId=" + deviceInfoId 
        + ", version='" + version + '\'' 
        + ", cipherSuite='" + cipherSuite + '\'' 
        + ", hostName='" + hostName + '\'' 
        + ", isSender='" + isSender + '\'' 
        + ", metadataId='" + metadataId + '\'' 
        + ", recordId='" + recordId + '\'' 
        + '}';
  }
}
