package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "external_ip_white_list", schema = "customer_config")
public class EExternalIPWhiteList extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "ip_addr")
  private String ipAddr;

  @Column(name = "white_list")
  private Boolean isWhiteList;

  private String country;

  @Column(name = "mfg_id")
  private String mfgId;

  @Column(name = "reputation_enum_id")
  private Integer reputationEnumId;

  private String description;

  @Column(name = "is_local")
  private Boolean isLocal;

  public String getIpAddr() {
    return ipAddr;
  }

  public void setIpAddr(String ipAddr) {
    this.ipAddr = ipAddr;
  }

  public Boolean getIsWhiteList() {
    return isWhiteList;
  }

  public void setIsWhiteList(Boolean isWhiteList) {
    this.isWhiteList = isWhiteList;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getMfgId() {
    return mfgId;
  }

  public void setMfgId(String mfgId) {
    this.mfgId = mfgId;
  }

  public Integer getReputationEnumId() {
    return reputationEnumId;
  }

  public void setReputationEnumId(Integer reputationEnumId) {
    this.reputationEnumId = reputationEnumId;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Boolean getIsLocal() {
    return isLocal;
  }

  public void setIsLocal(Boolean isLocal) {
    this.isLocal = isLocal;
  }

}
