package com.asimily.models;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;

/**
 * The persistent class for the application_info database table.
 * 
 */
@Entity
@Table(name = "application", schema = "raw_cloud")
// @Converter(name="uuidConverter",converterClass=UUIDConverter.class)
public class EApplication extends EUUIDBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "name")
  private String appName;

  @Column(name = "vendor_id")
  private String vendorId;

  @Column(name = "direct_alias")
  private String directAlias;

  @Column(name = "final_alias")
  private String finalAlias;

  @Column(name = "category")
  private Integer category;

  @Column(name = "insert_src")
  private String insertSrc;

  public EApplication() {
  }

  public String getDirectAlias() {
    return directAlias;
  }

  public void setDirectAlias(String directAlias) {
    this.directAlias = directAlias;
  }

  public String getFinalAlias() {
    return finalAlias;
  }

  public void setFinalAlias(String finalAlias) {
    this.finalAlias = finalAlias;
  }

  public Integer getCategory() {
    return category;
  }

  public void setCategory(Integer category) {
    this.category = category;
  }

  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public String getVendorId() {
    return vendorId;
  }

  public void setVendorId(String vendorId) {
    this.vendorId = vendorId;
  }

  public String getInsertSrc() {
    return insertSrc;
  }

  public void setInsertSrc(String insertSrc) {
    this.insertSrc = insertSrc;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    String uniqueOn = this.getAppName() + this.getVendorId();
    uuid = UUIDType5.nameUUIDFromNamespaceAndString(UUIDType5.NAMESPACE_URL, uniqueOn).toString();
  }

  @Override
  public String toString() {
    return "EApplication [appName=" + appName + ", vendorId=" + vendorId + ", directAlias=" + directAlias
        + ", finalAlias=" + finalAlias + ", category=" + category + "]";
  }

}
