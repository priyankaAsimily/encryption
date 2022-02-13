package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "mitigation_topology_detail_view", schema = "portal")
public class EMitigationTopologyDetailView extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "src_device_id")
  private Integer srcDeviceId;

  @Column(name = "src_ip")
  private String nodeIpAddr;

  @Column(name = "peer_ip")
  private String nbrIpAddr;

//  @Column(name = "service_port_mapping")
//  private String servicePortMapping;

  @Column(name = "peer_device_id")
  private Integer peerDeviceId;

  @Column(name = "is_networking_device")
  private Boolean isNetworkingDevice;

  public Integer getSrcDeviceId() {
    return srcDeviceId;
  }

  public void setSrcDeviceId(Integer srcDeviceId) {
    this.srcDeviceId = srcDeviceId;
  }

  public String getNodeIpAddr() {
    return nodeIpAddr;
  }

  public void setNodeIpAddr(String nodeIpAddr) {
    this.nodeIpAddr = nodeIpAddr;
  }

  public String getNbrIpAddr() {
    return nbrIpAddr;
  }

  public void setNbrIpAddr(String nbrIpAddr) {
    this.nbrIpAddr = nbrIpAddr;
  }

  public Integer getPeerDeviceId() {
    return peerDeviceId;
  }

  public void setPeerDeviceId(Integer peerDeviceId) {
    this.peerDeviceId = peerDeviceId;
  }

  public Boolean getIsNetworkingDevice() {
    return isNetworkingDevice;
  }

  public void setIsNetworkingDevice(Boolean isNetworkingDevice) {
    this.isNetworkingDevice = isNetworkingDevice;
  }
}
