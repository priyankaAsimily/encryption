package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "device_topology_detail_view", schema = "portal")
public class EDeviceTopologyDetailView extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "src_device_id")
  private Integer srcDeviceId;

  @Column(name = "src_mac_addr")
  private String srcMacAddr;

  @Column(name = "src_ip")
  private String nodeIpAddr;

  @Column(name = "peer_ip")
  private String nbrIpAddr;

  @Column(name = "service_port_mapping")
  private String servicePortMapping;

  public Integer getSrcDeviceId() {
    return srcDeviceId;
  }

  public void setSrcDeviceId(Integer srcDeviceId) {
    this.srcDeviceId = srcDeviceId;
  }

  public String getSrcMacAddr() {
    return srcMacAddr;
  }

  public void setSrcMacAddr(String srcMacAddr) {
    this.srcMacAddr = srcMacAddr;
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

  public String getServicePortMapping() {
    return servicePortMapping;
  }

  public void setServicePortMapping(String servicePortMapping) {
    this.servicePortMapping = servicePortMapping;
  }

}
