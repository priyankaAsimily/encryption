package com.asimily.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "connectiv_locations", schema = "raw_third_party")
public class EConnectivLocations extends ETenantBase {

  private static final long serialVersionUID = 1L;

  @Column(name = "sys_id")
  private String sysId;

  @Column(name = "location_name")
  private String locationName;

  public String getSysId() {
    return sysId;
  }

  public void setSysId(String sysId) {
    this.sysId = sysId;
  }

  public String getLocationName() {
    return locationName;
  }

  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }
}
