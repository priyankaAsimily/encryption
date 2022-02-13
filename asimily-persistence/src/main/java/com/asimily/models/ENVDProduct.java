package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the product database table.
 * 
 */
@Entity
@Table(name = "nvd_product", schema = "raw_cloud")
public class ENVDProduct extends EBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "product_name")
  private String productName;

  @Column(name = "version_value")
  private String versionValue;

  public ENVDProduct() {
  }

  public String getProductName() {
    return this.productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public String getVersionValue() {
    return this.versionValue;
  }

  public void setVersionValue(String versionValue) {
    this.versionValue = versionValue;
  }

}