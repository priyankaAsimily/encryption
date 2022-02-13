package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the network_servers_info database table.
 * 
 */
@Entity
@Table(name = "subnets_info", schema = "raw_on_prem")
public class ESubnetsInfo extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "addr")
  private String addr;

  @Column(name = "pkt_capture_id")
  private Integer pktCaptureId;

  @Column(name = "vlan_id")
  private Integer vlanId;

  public ESubnetsInfo() {
  }

  public String getAddr() {
    return addr;
  }

  public void setAddr(String addr) {
    this.addr = addr;
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


 
}
