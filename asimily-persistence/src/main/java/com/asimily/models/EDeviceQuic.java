package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "device_quic", schema = "portal")
public class EDeviceQuic extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "device_info_id")
  private Integer deviceInfoId;

  @Column(name = "server_name")
  private String serverName;

  @Column(name = "uaid")
  private String uaid;
  
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

  public String getServerName() {
    return serverName;
  }

  public void setServerName(String serverName) {
    this.serverName = serverName;
  }

  public String getUaid() {
    return uaid;
  }

  public void setUaid(String uaid) {
    this.uaid = uaid;
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
    return "EDeviceQuic{" + "deviceInfoId=" + deviceInfoId 
        + ", serverName='" + serverName + '\'' 
        + ", uaid='" + uaid + '\'' 
        + ", metadataId='" + metadataId + '\'' 
        + ", recordId='" + recordId + '\'' 
        + '}';
  }
}
