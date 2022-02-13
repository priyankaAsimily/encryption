package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "facility_mapping", schema = "raw_third_party")
public class EFacilityMapping extends ETenantBase {

  private static final long serialVersionUID = 1L;

  @Column(name = "connector_id")
  private Integer connectorId;

  @Column(name = "facility_code")
  private String facilityCode;

  @Column(name = "facility_name")
  private String facilityName;

  @Column(name = "asimily_facility")
  private String asimilyFacility;

  @Column(name = "ip_reuse_zone")
  private Integer ipReuseZone;

  public Integer getConnectorId() {
    return connectorId;
  }

  public void setConnectorId(Integer connectorId) {
    this.connectorId = connectorId;
  }

  public String getFacilityCode() {
    return facilityCode;
  }

  public void setFacilityCode(String facilityCode) {
    this.facilityCode = facilityCode;
  }

  public String getFacilityName() {
    return facilityName;
  }

  public void setFacilityName(String facilityName) {
    this.facilityName = facilityName;
  }

  public String getAsimilyFacility() {
    return asimilyFacility;
  }

  public void setAsimilyFacility(String asimilyFacility) {
    this.asimilyFacility = asimilyFacility;
  }

  public Integer getIpReuseZone() {
    return ipReuseZone;
  }

  public void setIpReuseZone(Integer ipReuseZone) {
    this.ipReuseZone = ipReuseZone;
  }

}
