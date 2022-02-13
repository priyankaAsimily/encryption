package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "ip_nbr", schema = "raw_on_prem")
public class EIpNbr extends ETenantBase {

  private static final long serialVersionUID = 1L;

  @Column(name = "nbr_ip_addr")
  private String nbrIpAddr;

  @Column(name = "node_ip_addr")
  private String nodeIpAddr;

  @Column(name = "service_port_mapping")
  private String servicePortMapping;
  
  @Column(name = "metadata_id")
  private Integer metadataId;

  @Column(name = "record_id")
  private Integer recordId;

  @Column(name = "pkt_capture_id")
  private Integer pktCaptureId;

  @Column(name = "ip_reuse_zone")
  private Integer ipReuseZone;

  public EIpNbr() {
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

  public String getNbrIpAddr() {
    return nbrIpAddr;
  }

  public void setNbrIpAddr(String nbrIpAddr) {
    this.nbrIpAddr = nbrIpAddr;
  }

  public String getNodeIpAddr() {
    return nodeIpAddr;
  }

  public void setNodeIpAddr(String nodeIpAddr) {
    this.nodeIpAddr = nodeIpAddr;
  }

  public String getServicePortMapping() {
    return servicePortMapping;
  }

  public void setServicePortMapping(String servicePortMapping) {
    this.servicePortMapping = servicePortMapping;
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

}
