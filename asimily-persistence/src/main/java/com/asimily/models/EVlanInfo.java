package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "vlan_info", schema = "raw_on_prem")
public class EVlanInfo extends ETenantBase {

  @Column(name = "ip_addr")
  private String ipAddr;

  @Column(name = "vlan")
  private Integer vlan;

  @Column(name = "ip_reuse_zone")
  private Integer ipReuseZone;

  private String description;

  private String facility;

  private Integer status;

  public String getIpAddr() {
    return ipAddr;
  }

  public void setIpAddr(String ipAddr) {
    this.ipAddr = ipAddr;
  }

  public Integer getVlan() {
    return vlan;
  }

  public void setVlan(Integer vlan) {
    this.vlan = vlan;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Integer getIpReuseZone() {
    return ipReuseZone;
  }

  public void setIpReuseZone(Integer ipReuseZone) {
    this.ipReuseZone = ipReuseZone;
  }

  public String getFacility() {
    return facility;
  }

  public void setFacility(String facility) {
    this.facility = facility;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

}
