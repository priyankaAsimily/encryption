package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "nvd_cve_product", schema = "raw_cloud")
public class ENVDCVEProduct extends EBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "cve_id")
  private Integer cveId;

  @Column(name = "product_os_id")
  private String productOsId;

  @Column(name = "product_app_id")
  private String productAppId;

  @Column(name = "product_hw_id")
  private String productHwId;

  @Column(name = "insert_src")
  private String insertSrc;

  public ENVDCVEProduct() {
  }

  public Integer getCveId() {
    return cveId;
  }

  public void setCveId(Integer cveId) {
    this.cveId = cveId;
  }

  public String getProductOsId() {
    return productOsId;
  }

  public void setProductOsId(String productOsId) {
    this.productOsId = productOsId;
  }

  public String getProductAppId() {
    return productAppId;
  }

  public void setProductAppId(String productAppId) {
    this.productAppId = productAppId;
  }

  public String getInsertSrc() {
    return insertSrc;
  }

  public void setInsertSrc(String insertSrc) {
    this.insertSrc = insertSrc;
  }

  public String getProductHwId() {
    return productHwId;
  }

  public void setProductHwId(String productHwId) {
    this.productHwId = productHwId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ENVDCVEProduct that = (ENVDCVEProduct) o;
    return Objects.equals(cveId, that.cveId) &&
        Objects.equals(productOsId, that.productOsId) &&
        Objects.equals(productAppId, that.productAppId) &&
        Objects.equals(productHwId, that.productHwId);
  }

  @Override
  public int hashCode() {

    return Objects.hash(cveId, productOsId, productAppId, productHwId);
  }
}