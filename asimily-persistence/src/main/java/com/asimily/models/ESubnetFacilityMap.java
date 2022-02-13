package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "subnet_facility_map", schema = "customer_config")
public class ESubnetFacilityMap extends ETenantBase {

  private static final long serialVersionUID = 1L;

  @Column(name = "subnet")
  private String subnet;

  @Column(name = "facility")
  private String facility;

  @Column(name = "region")
  private String region;

  @Column(name = "location")
  private String location;

  @Column(name = "edge_id")
  private Integer edgeId;

  @Column(name = "ip_reuse_zone")
  private Integer ipReuseZone;

  public String getSubnet() {
    return subnet;
  }

  public void setSubnet(String subnet) {
    this.subnet = subnet;
  }

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

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public Integer getEdgeId() {
    return edgeId;
  }

  public void setEdgeId(Integer edgeId) {
    this.edgeId = edgeId;
  }

  public Integer getIpReuseZone() {
    return ipReuseZone;
  }

  public void setIpReuseZone(Integer ipReuseZone) {
    this.ipReuseZone = ipReuseZone;
  }

}
