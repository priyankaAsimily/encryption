package com.asimily.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the device_impact_data_category database table.
 *
 */
@Entity
@Table(name = "device_impact_data_category", schema = "portal")
public class EImpactDataCategory extends ETenantBase implements Serializable {

  private static final long serialVersionUID = 1L;

  private String category;

  @Column(name = "category_desc")
  private String categoryDesc;

  @Column(name = "device_info_id")
  private Integer deviceInfoId;

  public EImpactDataCategory() {
  }

  public String getCategory() {
    return this.category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getCategoryDesc() {
    return this.categoryDesc;
  }

  public void setCategoryDesc(String categoryDesc) {
    this.categoryDesc = categoryDesc;
  }

  public Integer getDeviceInfoId() {
    return this.deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
  }

}