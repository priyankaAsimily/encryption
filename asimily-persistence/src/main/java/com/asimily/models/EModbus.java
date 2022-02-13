package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "modbus", schema = "raw_on_prem")
public class EModbus extends ETenantBase{
  @Column(name = "vendor_name")
  private String vendorName;
  
  @Column(name = "product_code")
  private String productCode;
  
  @Column(name = "major_minor_revision")
  private String majorMinorRevision;
  
  @Column(name = "vendor_url")
  private String vendorUrl;
  
  @Column(name = "product_name")
  private String productName;
  
  @Column(name = "model_name")
  private String modelName;
  
  @Column(name = "user_application_name")
  private String userApplicationName;

  public String getVendorName() {
    return vendorName;
  }

  public void setVendorName(String vendorName) {
    this.vendorName = vendorName;
  }

  public String getProductCode() {
    return productCode;
  }

  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }

  public String getMajorMinorRevision() {
    return majorMinorRevision;
  }

  public void setMajorMinorRevision(String majorMinorRevision) {
    this.majorMinorRevision = majorMinorRevision;
  }

  public String getVendorUrl() {
    return vendorUrl;
  }

  public void setVendorUrl(String vendorUrl) {
    this.vendorUrl = vendorUrl;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public String getModelName() {
    return modelName;
  }

  public void setModelName(String modelName) {
    this.modelName = modelName;
  }

  public String getUserApplicationName() {
    return userApplicationName;
  }

  public void setUserApplicationName(String userApplicationName) {
    this.userApplicationName = userApplicationName;
  }
  
}
