package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the nbr_info database table.
 *
 */
@Entity
@Table(name = "nbr_info", schema = "raw_on_prem")
public class ENBRInfo extends ETenantBase {

  private static final long serialVersionUID = 1L;

  @Column(name = "nbr_mac_addr")
  private String nbrMacAddr;

  @Column(name = "node_mac_addr")
  private String nodeMacAddr;

  @Column(name = "metadata_id")
  private Integer metadataId;

  @Column(name = "record_id")
  private Integer recordId;


  public ENBRInfo() {
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

  public String getNbrMacAddr() {
    return this.nbrMacAddr;
  }

  public void setNbrMacAddr(String nbrMacAddr) {
    this.nbrMacAddr = nbrMacAddr;
  }

  public String getNodeMacAddr() {
    return this.nodeMacAddr;
  }

  public void setNodeMacAddr(String nodeMacAddr) {
    this.nodeMacAddr = nodeMacAddr;
  }

}