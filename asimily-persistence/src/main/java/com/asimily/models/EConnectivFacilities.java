package com.asimily.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "connectiv_facilities", schema = "raw_third_party")
public class EConnectivFacilities extends ETenantBase {

  private static final long serialVersionUID = 1L;

  @Column(name = "sys_id")
  private String sysId;

  @Column(name = "facility_name")
  private String facilityName;

  public String getSysId() {
    return sysId;
  }

  public void setSysId(String sysId) {
    this.sysId = sysId;
  }

  public String getFacilityName() {
    return facilityName;
  }

  public void setFacilityName(String facilityName) {
    this.facilityName = facilityName;
  }

}
