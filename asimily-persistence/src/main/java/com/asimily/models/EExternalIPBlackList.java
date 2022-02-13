package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "external_ip_black_list", schema = "raw_cloud")
public class EExternalIPBlackList extends EBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "ip_addr")
  private String ipAddr;

  @Column(name = "black_list")
  private Boolean isBlackList;

  private String country;

  @Column(name = "mfg_id")
  private String mfgId;

  @Column(name = "reputation_enum_id")
  private Integer reputationEnumId;

  @Column(name="category_id")
  private Integer categoryId;

  private String description;

  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

  public String getIpAddr() {
    return ipAddr;
  }

  public void setIpAddr(String ipAddr) {
    this.ipAddr = ipAddr;
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

  public Boolean getBlackList() {
    return isBlackList;
  }

  public void setBlackList(Boolean blackList) {
    isBlackList = blackList;
  }
}
