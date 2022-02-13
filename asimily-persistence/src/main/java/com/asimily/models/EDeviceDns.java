package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "device_dns", schema = "portal")
public class EDeviceDns extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "query_name")
  private String queryName;

  @Column(name = "is_dns_server")
  private boolean isDnsServer;

  @Column(name = "device_info_id")
  private Integer deviceInfoId;
  
  @Column(name = "metadata_id")
  private Integer metadataId;
  
  @Column(name = "record_id")
  private Integer recordId;

  @Column(name = "white_list")
  private boolean isWhiteList;

  @Column(name = "black_list")
  private boolean isBlackList;

  @Column(name = "category_id")
  private Integer categoryId;

  public String getQueryName() {
    return queryName;
  }

  public void setQueryName(String queryName) {
    this.queryName = queryName;
  }

  public boolean getIsDnsServer() {
    return isDnsServer;
  }

  public void setIsDnsServer(boolean isDnsServer) {
    this.isDnsServer = isDnsServer;
  }

  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
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

  public boolean isWhiteList() {
    return isWhiteList;
  }

  public void setWhiteList(boolean whiteList) {
    isWhiteList = whiteList;
  }

  public boolean isBlackList() {
    return isBlackList;
  }

  public void setBlackList(boolean blackList) {
    isBlackList = blackList;
  }

  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }
}
