package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "hl7_sft", schema = "raw_on_prem")
public class EHL7Sft extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "vendor")
  private String vendor;

  @Column(name = "version")
  private String version;

  @Column(name = "product_name")
  private String productName;

  @Column(name = "binary_id")
  private String binaryId;

  @Column(name = "product_info")
  private String productInfo;

  @Column(name = "install_date")
  private String installDate;

  public EHL7Sft() {
  }

  public String getVendor() {
    return vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public String getBinaryId() {
    return binaryId;
  }

  public void setBinaryId(String binaryId) {
    this.binaryId = binaryId;
  }

  public String getProductInfo() {
    return productInfo;
  }

  public void setProductInfo(String productInfo) {
    this.productInfo = productInfo;
  }

  public String getInstallDate() {
    return installDate;
  }

  public void setInstallDate(String installDate) {
    this.installDate = installDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EHL7Sft ehl7Sft = (EHL7Sft) o;
    return Objects.equals(vendor, ehl7Sft.vendor) &&
        Objects.equals(version, ehl7Sft.version) &&
        Objects.equals(productName, ehl7Sft.productName) &&
        Objects.equals(binaryId, ehl7Sft.binaryId) &&
        Objects.equals(productInfo, ehl7Sft.productInfo) &&
        Objects.equals(installDate, ehl7Sft.installDate);
  }

  @Override
  public int hashCode() {

    return Objects.hash(vendor, version, productName, binaryId, productInfo, installDate);
  }
}
