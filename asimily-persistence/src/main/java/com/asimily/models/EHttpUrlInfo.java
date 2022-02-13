package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the http_url_info database table.
 * 
 */
@Entity
@Table(name = "http_url_info", schema = "raw_on_prem")
public class EHttpUrlInfo extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "host_name")
  private String hostName;

  @Column(name = "request_target")
  private String requestTarget;

  @Column(name = "white_list")
  private boolean isWhiteList;

  @Column(name = "black_list")
  private boolean isBlackList;
  
  public EHttpUrlInfo() {
  }

  public String getHostName() {
    return this.hostName;
  }

  public void setHostName(String hostName) {
    this.hostName = hostName;
  }

  public String getRequestTarget() {
    return this.requestTarget;
  }

  public void setRequestTarget(String requestTarget) {
    this.requestTarget = requestTarget;
  }

  public boolean isWhiteList() {
    return isWhiteList;
  }

  public void setWhiteList(boolean isWhiteList) {
    this.isWhiteList = isWhiteList;
  }

  public boolean isBlackList() {
    return isBlackList;
  }

  public void setBlackList(boolean isBlackList) {
    this.isBlackList = isBlackList;
  }

}