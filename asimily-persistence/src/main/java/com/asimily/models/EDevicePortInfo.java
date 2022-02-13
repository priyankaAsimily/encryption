package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the device_port_info database table.
 * 
 */
@Entity
@Table(name = "device_port_info", schema = "portal")
public class EDevicePortInfo extends ETenantBase {
  private static final long serialVersionUID = 1L;

  private Integer port;

  @Column(name = "proto_service_name")
  private String protoServiceName;

  @Column(name = "proto_version")
  private String protoVersion;

  private Integer transport;

  @Column(name = "server_port")
  private Integer peerServerPort;

  /*
   * @ManyToOne
   * 
   * @JoinColumn(name = "device_info_id", referencedColumnName = "id") private
   * EDeviceInfo deviceInfo;
   */

  @Column(name = "device_info_id")
  private Integer deviceInfoId;

  @Column(name = "external_ip")
  private Boolean externalIp;

  @Column(name = "metadata_id")
  private Integer metadataId;
  
  @Column(name = "record_id")
  private Integer recordId;
  
  @Column(name = "tcp_flags")
  private Integer tcpFlags;

  private Integer status;

  public EDevicePortInfo() {
  }

  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public Integer getTransport() {
    return transport;
  }

  public void setTransport(Integer transport) {
    this.transport = transport;
  }

  /*
   * public EDeviceInfo getDeviceInfo() { return deviceInfo; }
   * 
   * public void setDeviceInfo(EDeviceInfo deviceInfo) { this.deviceInfo =
   * deviceInfo; }
   * 
   */
  public String getProtoServiceName() {
    return protoServiceName;
  }

  public void setProtoServiceName(String protoServiceName) {
    this.protoServiceName = protoServiceName;
  }

  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
  }

  public String getProtoVersion() {
    return protoVersion;
  }

  public void setProtoVersion(String protoVersion) {
    this.protoVersion = protoVersion;
  }

  public Integer getPeerServerPort() {
    return peerServerPort;
  }

  public void setPeerServerPort(Integer peerServerPort) {
    this.peerServerPort = peerServerPort;
  }

  public Boolean getExternalIp() {
    return externalIp;
  }

  public void setExternalIp(Boolean externalIp) {
    this.externalIp = externalIp;
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

  public Integer getTcpFlags() {
    return tcpFlags;
  }

  public void setTcpFlags(Integer tcpFlags) {
    this.tcpFlags = tcpFlags;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "EDevicePortInfo{" + "deviceInfoId=" + deviceInfoId + ", port=" + port + ", peerServerPort=" + peerServerPort 
      + ", protoServiceName=" + protoServiceName + ", protoVersion=" + protoVersion + ", transport=" + transport 
      + ", tcpFlags=" + tcpFlags + ", status=" + status + ", id=" + id + '}';
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((getCustomerId() == null) ? 0 : getCustomerId().hashCode());
    result = prime * result + ((port == null) ? 0 : port.hashCode());
    result = prime * result + ((protoServiceName == null) ? 0 : protoServiceName.hashCode());
    result = prime * result + ((transport == null) ? 0 : transport.hashCode());
    result = prime * result + ((deviceInfoId == null) ? 0 : deviceInfoId.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    EDevicePortInfo other = (EDevicePortInfo) obj;
    if (getCustomerId() == null) {
      if (other.getCustomerId() != null)
        return false;
    } else if (!getCustomerId().equals(other.getCustomerId()))
      return false;
    if (port == null) {
      if (other.port != null)
        return false;
    } else if (!port.equals(other.port))
      return false;
    if (protoServiceName == null) {
      if (other.protoServiceName != null)
        return false;
    } else if (!protoServiceName.equals(other.protoServiceName))
      return false;
    if (transport == null) {
      if (other.transport != null)
        return false;
    } else if (!transport.equals(other.transport))
      return false;
    if (deviceInfoId == null) {
      if (other.deviceInfoId != null)
        return false;
    } else if (!deviceInfoId.equals(other.deviceInfoId))
      return false;
    return true;
  }

}
