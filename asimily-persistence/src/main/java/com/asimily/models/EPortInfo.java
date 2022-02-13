package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the tcp_info database table.
 * 
 */
@Entity
@Table(name = "port_info", schema = "raw_on_prem")
public class EPortInfo extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "dst_port_id")
  private Integer dstPortId;

  @Column(name = "src_port_id")
  private Integer srcPortId;

  public EPortInfo() {
  }

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getDstPortId() {
    return dstPortId;
  }

  public void setDstPortId(Integer dstPortId) {
    this.dstPortId = dstPortId;
  }

  public Integer getSrcPortId() {
    return srcPortId;
  }

  public void setSrcPortId(Integer srcPortId) {
    this.srcPortId = srcPortId;
  }
}