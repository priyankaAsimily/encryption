package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the network_servers_info database table.
 * 
 */
@Entity
@Table(name = "network_servers_info", schema = "raw_on_prem")
public class ENetworkServersInfo extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "ip_addr")
  private String ipAddr;

  @Column(name = "type_id")
  private Integer typeId;

  @Column(name = "pkt_capture_id")
  private Integer pktCaptureId;

  @Column(name = "vlan_id")
  private Integer vlanId;

  public ENetworkServersInfo() {
  }

  public Integer getTypeId() {
    return typeId;
  }

  public String getIpAddr() {
    return ipAddr;
  }

  public void setIpAddr(String ipAddr) {
    this.ipAddr = ipAddr;
  }

  public void setTypeId(Integer typeId) {
    this.typeId = typeId;
  }

  public Integer getPktCaptureId() {
    return pktCaptureId;
  }

  public void setPktCaptureId(Integer pktCaptureId) {
    this.pktCaptureId = pktCaptureId;
  }

  public Integer getVlanId() {
    return vlanId;
  }

  public void setVlanId(Integer vlanId) {
    this.vlanId = vlanId;
  }

  @Override
  public String toString() {
    return "ENetworkServersInfo [ipAddr=" + ipAddr + ", typeId=" + typeId + "]";
  }

 
}
