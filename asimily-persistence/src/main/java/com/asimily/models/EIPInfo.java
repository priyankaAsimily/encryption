package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the ip_info database table.
 * 
 */
@Entity
@Table(name = "ip_info", schema = "raw_on_prem")
public class EIPInfo extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "dst_ip_id")
  private Integer dstIpAddr;

  @Column(name = "src_ip_id")
  private Integer srcIpAddr;

  public EIPInfo() {
  }

  public Integer getDstIpAddr() {
    return dstIpAddr;
  }

  public void setDstIpAddr(Integer dstIpAddr) {
    this.dstIpAddr = dstIpAddr;
  }

  public Integer getSrcIpAddr() {
    return srcIpAddr;
  }

  public void setSrcIpAddr(Integer srcIpAddr) {
    this.srcIpAddr = srcIpAddr;
  }
}