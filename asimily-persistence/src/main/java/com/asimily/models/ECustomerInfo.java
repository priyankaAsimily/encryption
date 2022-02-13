package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the application_info database table.
 *
 */
@Entity
@Table(name = "customer_info", schema = "cloud_admin")
public class ECustomerInfo extends EBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "unique_id")
  private String uniqueId;


  @Column(name="org_id")
  private String orgId;

  @Column(name="description")
  private String description;

  @Column(name="customer_name")
  private String name;

  @Column(name="location")
  private String location;

  public ECustomerInfo() {
  }

  public String getUniqueId() {
    return uniqueId;
  }

  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
  }

  public String getOrgId() {
    return orgId;
  }

  public void setOrgId(String orgId) {
    this.orgId = orgId;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }
}
