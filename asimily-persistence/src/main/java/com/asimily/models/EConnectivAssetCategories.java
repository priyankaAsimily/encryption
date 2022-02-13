package com.asimily.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "connectiv_asset_categories", schema = "raw_third_party")
public class EConnectivAssetCategories extends ETenantBase {

  private static final long serialVersionUID = 1L;

  @Column(name = "sys_id")
  private String sysId;

  @Column(name = "category_name")
  private String categoryName;

  public String getSysId() {
    return sysId;
  }

  public void setSysId(String sysId) {
    this.sysId = sysId;
  }

  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }
}
