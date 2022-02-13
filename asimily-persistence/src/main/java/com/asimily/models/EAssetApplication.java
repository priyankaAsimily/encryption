package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "asset_application", schema = "raw_third_party")
public class EAssetApplication extends ETenantBase {

  private static final long serialVersionUID = 1L;

  @Column(name = "tenable_asset_info_id")
  private Integer tenableAssetInfoId;
 
  @Column(name = "source_type")
  private Integer sourceType;
  
  private String name;

  private String version;

  public Integer getTenableAssetInfoId() {
    return tenableAssetInfoId;
  }

  public void setTenableAssetInfoId(Integer tenableAssetInfoId) {
    this.tenableAssetInfoId = tenableAssetInfoId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public Integer getSourceType() {
    return sourceType;
  }

  public void setSourceType(Integer sourceType) {
    this.sourceType = sourceType;
  }

}
