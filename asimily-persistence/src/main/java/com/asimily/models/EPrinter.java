package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "printer", schema = "raw_on_prem")
public class EPrinter extends ETenantBase{
  
  @Column(name = "vendor_name")
  private String vendorName;

  @Column(name = "product_name")
  private String productName;

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
}
