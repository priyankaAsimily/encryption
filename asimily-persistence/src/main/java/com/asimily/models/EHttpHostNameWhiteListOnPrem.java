package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "http_host_name_white_list", schema = "customer_config")
public class EHttpHostNameWhiteListOnPrem extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "host_name")
  private String hostName;

  @Column(name = "white_list")
  private Boolean whiteList;

  @Column(name = "subdomains_are_internal")
  private Boolean subDomainsAreInternal;

  public String getHostName() {
    return hostName;
  }

  public void setHostName(String hostName) {
    this.hostName = hostName;
  }

  public void setWhiteList(Boolean whiteList){
    this.whiteList = whiteList;
  }

  public Boolean getWhiteList() {
    return whiteList;
  }

  public Boolean getSubDomainsAreInternal() {
    return subDomainsAreInternal;
  }

  public void setSubDomainsAreInternal(Boolean subDomainsAreInternal) {
    this.subDomainsAreInternal = subDomainsAreInternal;
  }
}