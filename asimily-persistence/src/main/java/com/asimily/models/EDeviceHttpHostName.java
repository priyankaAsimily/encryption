package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "device_http_host_name", schema = "portal")
public class EDeviceHttpHostName extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "device_info_id")
  private Integer deviceInfoId;

  // @Column(name = "http_url_info_id")
  // private Integer httpUrlInfoId;

  @Column(name = "host_name")
  private String hostName;

  @Column(name = "request_target")
  private String requestTarget;

  @Column(name = "white_list")
  private boolean isWhiteList;

  @Column(name = "black_list")
  private boolean isBlackList;
  
  @Column(name = "is_local")
  private boolean isLocal;

  @Column(name = "category_id")
  private Integer categoryId;

  @Column(name = "external_ip")
  private String externalIp;

  @Column(name = "is_ssl_tls")
  private boolean isSslTls;

  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
  }

  public boolean isWhiteList() {
    return isWhiteList;
  }

  public void setWhiteList(boolean whiteList) {
    isWhiteList = whiteList;
  }

  public String getHostName() {
    return hostName;
  }

  public void setHostName(String hostName) {
    this.hostName = hostName;
  }

  public boolean isBlackList() {
    return isBlackList;
  }

  public void setBlackList(boolean blackList) {
    isBlackList = blackList;
  }
  
  public boolean isLocal() {
    return isLocal;
  }

  public void setLocal(boolean isLocal) {
    this.isLocal = isLocal;
  }

  public boolean isSslTls() {
    return isSslTls;
  }

  public void setIsSslTls(boolean isSslTls) {
    this.isSslTls = isSslTls;
  }

  public String getRequestTarget() {
    return requestTarget;
  }

  public void setRequestTarget(String requestTarget) {
    this.requestTarget = requestTarget;
  }

  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

  public String getExternalIp() {
    return externalIp;
  }

  public void setExternalIp(String externalIp) {
    this.externalIp = externalIp;
  }
}
