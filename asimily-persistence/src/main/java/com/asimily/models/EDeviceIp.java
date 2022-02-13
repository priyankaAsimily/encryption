package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "device_ip", schema = "portal")
public class EDeviceIp extends ETenantBase {

  @Column(name = "device_info_id")
  private Integer deviceInfoId;

  @Column(name = "ip_addr")
  private String ipAddr;

  @Column(name = "is_local_ip")
  private boolean isLocalIp;

  @Column(name = "is_dhcp")
  private boolean isDhcp;
  
  @Column(name = "metadata_id")
  private Integer metadataId;
  
  @Column(name = "record_id")
  private Integer recordId;

  @Column(name = "ip_ttl")
  private String ipTtl;

  @Column(name = "pkt_capture_id")
  private Integer pktCaptureId;

  @Column(name = "ip_reuse_zone")
  private Integer ipReuseZone;

  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
  }

  public String getIpAddr() {
    return ipAddr;
  }

  public void setIpAddr(String ipAddr) {
    this.ipAddr = ipAddr;
  }

  public Boolean getIsDhcp() {
    return isDhcp;
  }

  public void setIsDhcp(Boolean isDhcp) {
    this.isDhcp = isDhcp;
  }

  public boolean isLocalIp() { return isLocalIp; }

  public void setLocalIp(boolean localIp) { isLocalIp = localIp; }
  
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

  public String getIpTtl() {
    return ipTtl;
  }

  public void setIpTtl(String ipTtl) {
    this.ipTtl = ipTtl;
  }

  public Integer getPktCaptureId() {
    return pktCaptureId;
  }

  public void setPktCaptureId(Integer pktCaptureId) {
    this.pktCaptureId = pktCaptureId;
  }

  public Integer getIpReuseZone() {
    return ipReuseZone;
  }

  public void setIpReuseZone(Integer ipReuseZone) {
    this.ipReuseZone = ipReuseZone;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((deviceInfoId == null) ? 0 : deviceInfoId.hashCode());
    result = prime * result + ((ipAddr == null) ? 0 : ipAddr.hashCode());
    return result;
  }

  @Override
  public String toString() {
    return "EDeviceIp{" +
        "deviceInfoId=" + deviceInfoId +
        ", ipAddr='" + ipAddr + '\'' +
        ", id=" + id +
        '}';
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    EDeviceIp other = (EDeviceIp) obj;
    if (deviceInfoId == null) {
      if (other.deviceInfoId != null)
        return false;
    } else if (!deviceInfoId.equals(other.deviceInfoId))
      return false;
    if (ipAddr == null) {
      if (other.ipAddr != null)
        return false;
    } else if (!ipAddr.equals(other.ipAddr))
      return false;
    return true;
  }

  
  
}
