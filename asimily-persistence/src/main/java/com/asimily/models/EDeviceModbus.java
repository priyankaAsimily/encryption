package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "device_modbus", schema = "portal")
public class EDeviceModbus extends ETenantBase {
  @Column(name = "device_info_id")
  private Integer deviceInfoId;
  
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
  
  @Column(name = "metadata_id")
  private Integer metadataId;
  
  @Column(name = "record_id")
  private Integer recordId;

  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
  }

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
  
  public Integer getMetadataId() {
    return metadataId;
  }

  public void setMetadataId(Integer metadataId) {
    this.metadataId = metadataId;
  }

  public Integer getRecordId() {
    return recordId;
  }

  public void setRecordId(Integer recordId) {
    this.recordId = recordId;
  }
  
}
