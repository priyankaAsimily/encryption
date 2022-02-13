package com.asimily.models;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;

/**
 * The persistent class for the os_info database table.
 * 
 */
@Entity
@Table(name = "os", schema = "raw_cloud")
public class EOs extends EUUIDBase {
  private static final long serialVersionUID = 1L;

  private String name;

  @Column(name = "vendor_id")
  private String vendorId;

  private Integer category;

  @Column(name = "direct_alias")
  private String directAlias;

  @Column(name = "final_alias")
  private String finalAlias;

  @Column(name = "insert_src")
  private Integer insertSrc;

  public EOs() {
  }

  public Integer getCategory() {
    return category;
  }

  public void setCategory(Integer category) {
    this.category = category;
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

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getVendorId() {
    return vendorId;
  }

  public void setVendorId(String vendorId) {
    this.vendorId = vendorId;
  }

  public Integer getInsertSrc() {
    return insertSrc;
  }

  public void setInsertSrc(Integer insertSrc) {
    this.insertSrc = insertSrc;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    String uniqueOn = this.getName() + this.getVendorId();
    uuid = UUIDType5.nameUUIDFromNamespaceAndString(UUIDType5.NAMESPACE_URL, uniqueOn).toString();
  }

  @Override
  public String toString() {
    return "EOs{" + "name='" + name + '\'' + ", vendorId='" + vendorId + '\'' + ", category=" + category
        + ", directAlias='" + directAlias + '\'' + ", finalAlias='" + finalAlias + '\'' + '}';
  }
}