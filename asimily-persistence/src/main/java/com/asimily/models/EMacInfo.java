package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the mac_info database table.
 * 
 */
@Entity
@Table(name = "mac_info", schema = "raw_on_prem")
public class EMacInfo extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "dst_mac_id")
  private Integer dstMacId;

  @Column(name = "src_mac_id")
  private Integer srcMacId;

  public EMacInfo() {
  }

  public Integer getDstMacId() {
    return dstMacId;
  }

  public void setDstMacId(Integer dstMacId) {
    this.dstMacId = dstMacId;
  }

  public Integer getSrcMacId() {
    return srcMacId;
  }

  public void setSrcMacId(Integer srcMacId) {
    this.srcMacId = srcMacId;
  }

}