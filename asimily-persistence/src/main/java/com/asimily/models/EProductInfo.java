package com.asimily.models;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;

/**
 * The persistent class for the product_info database table.
 * 
 */
@Entity
@Table(name = "product_info", schema = "raw_cloud")
// @Converter(name="uuidConverter",converterClass=UUIDConverter.class)
public class EProductInfo extends EUUIDBase {
  private static final long serialVersionUID = 1L;

  private String name;

  @Column(name = "device_type")
  private Integer deviceTypeId;

  @Column(name = "mfg_id")
  private String mfgId;

  @Column(name = "direct_alias")
  private String directAlias;

  @Column(name = "final_alias")
  private String finalAlias;

  @Column(name = "insert_src")
  private Integer insertSrc;

  public EProductInfo() {
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getDeviceTypeId() {
    return deviceTypeId;
  }

  public void setDeviceTypeId(Integer deviceTypeId) {
    this.deviceTypeId = deviceTypeId;
  }

  public String getMfgId() {
    return mfgId;
  }

  public void setMfgId(String mfgId) {
    this.mfgId = mfgId;
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

  public Integer getInsertSrc() {
    return insertSrc;
  }

  public void setInsertSrc(Integer insertSrc) {
    this.insertSrc = insertSrc;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    String uniqueOn = this.getName() + this.getMfgId();
    uuid = UUIDType5.nameUUIDFromNamespaceAndString(UUIDType5.NAMESPACE_URL, uniqueOn).toString();
  }

  @Override
  public String toString() {
    return "EProductInfo{" + "name='" + name + '\'' + ", deviceTypeId=" + deviceTypeId + ", mfgId='" + mfgId + '\''
        + ", directAlias='" + directAlias + '\'' + ", finalAlias='" + finalAlias + '\'' + '}';
  }
}