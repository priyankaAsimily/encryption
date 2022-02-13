package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "edge_facility_region_map", schema = "customer_config")
public class EEdgeFacilityRegionMap extends ETenantBase {

  private static final long serialVersionUID = 1L;

  private String facility;

  private String region;

  @Column(name = "edge_id")
  private Integer edgeId;

  @Column(name = "interface_id")
  private Integer interfaceId;

  @Column(name = "pkt_capture_id")
  private Integer pktCaptureId;

  @Column(name = "ip_reuse_zone")
  private Integer ipReuseZone;

  @Column(name = "insert_src")
  private Integer insertSrc;

  public String getFacility() {
    return facility;
  }

  public void setFacility(String facility) {
    this.facility = facility;
  }

  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public Integer getEdgeId() {
    return edgeId;
  }

  public void setEdgeId(Integer edgeId) {
    this.edgeId = edgeId;
  }

  public Integer getInterfaceId() {
    return interfaceId;
  }

  public void setInterface(Integer interfaceId) {
    this.interfaceId = interfaceId;
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

  public Integer getInsertSrc() {
    return insertSrc;
  }

  public void setInsertSrc(Integer insertSrc) {
    this.insertSrc = insertSrc;
  }

}
