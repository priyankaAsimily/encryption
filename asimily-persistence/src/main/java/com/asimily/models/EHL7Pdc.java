package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "hl7_pdc", schema = "raw_on_prem")
public class EHL7Pdc extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "mfg")
  private String mfg;

  @Column(name = "country")
  private String country;

  @Column(name = "brand")
  private String brand;

  @Column(name = "device_family_name")
  private String deviceFamilyName;

  @Column(name = "generic_name")
  private String genericName;

  @Column(name = "model_id")
  private String modelId;

  @Column(name = "catalogue_id")
  private String catalogueId;

  @Column(name = "other_id")
  private String otherId;

  @Column(name = "product_code")
  private String productCode;


  public EHL7Pdc() {
  }

  public String getMfg() {
    return mfg;
  }

  public void setMfg(String mfg) {
    this.mfg = mfg;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getDeviceFamilyName() {
    return deviceFamilyName;
  }

  public void setDeviceFamilyName(String deviceFamilyName) {
    this.deviceFamilyName = deviceFamilyName;
  }

  public String getGenericName() {
    return genericName;
  }

  public void setGenericName(String genericName) {
    this.genericName = genericName;
  }

  public String getModelId() {
    return modelId;
  }

  public void setModelId(String modelId) {
    this.modelId = modelId;
  }

  public String getCatalogueId() {
    return catalogueId;
  }

  public void setCatalogueId(String catalogueId) {
    this.catalogueId = catalogueId;
  }

  public String getOtherId() {
    return otherId;
  }

  public void setOtherId(String otherId) {
    this.otherId = otherId;
  }

  public String getProductCode() {
    return productCode;
  }

  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EHL7Pdc ehl7Pdc = (EHL7Pdc) o;
    return Objects.equals(mfg, ehl7Pdc.mfg) &&
        Objects.equals(country, ehl7Pdc.country) &&
        Objects.equals(brand, ehl7Pdc.brand) &&
        Objects.equals(deviceFamilyName, ehl7Pdc.deviceFamilyName) &&
        Objects.equals(genericName, ehl7Pdc.genericName) &&
        Objects.equals(modelId, ehl7Pdc.modelId) &&
        Objects.equals(catalogueId, ehl7Pdc.catalogueId) &&
        Objects.equals(otherId, ehl7Pdc.otherId) &&
        Objects.equals(productCode, ehl7Pdc.productCode);
  }

  @Override
  public int hashCode() {

    return Objects.hash(mfg, country, brand, deviceFamilyName, genericName, modelId, catalogueId, otherId, productCode);
  }
}