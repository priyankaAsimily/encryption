package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "device_printer", schema = "portal")
public class EDevicePrinter extends ETenantBase{

  @Column(name = "device_info_id")
  private Integer deviceInfoId;
  
  @Column(name = "is_printer")
  private Boolean isPrinter;
  
  @Column(name = "vendor_name")
  private String vendorName;

  @Column(name = "product_name")
  private String productName;
  
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

  public Boolean getPrinter() {
    return isPrinter;
  }

  public void setPrinter(Boolean printer) {
    isPrinter = printer;
  }

  public String getVendorName() {
    return vendorName;
  }

  public void setVendorName(String vendorName) {
    this.vendorName = vendorName;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
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
