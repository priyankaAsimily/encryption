package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "impacted_device_recomm_summary", schema = "portal")
public class EImpactedDeviceRecommSummary extends ETenantBase{
  private static final long serialVersionUID = 1L;

  @Column(name = "device_info_id")
  protected Integer deviceInfoId;

  @Column(name = "recommendation_id")
  private Integer recommendationId;

//  @Column(name = "total_cve_count")
//  private Integer totalCveCount;

  @Column(name = "highrisk_cve_count")
  private Integer highriskCveCount;

  @Column(name = "highrisk_cve_list")
  private String highriskCveList;

  @Column(name = "medium_low_risk_cve_count")
  private Integer mediumLowRiskCveCount;

  @Column(name = "medium_low_risk_cve_list")
  private String mediumLowRiskCveList;

//  @Column(name = "lowrisk_cve_count")
//  private Integer lowriskCveCount;


  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
  }


//  public String getIpAddr() {
//    return ipAddr;
//  }
//
//  public void setIpAddr(String ipAddr) {
//    this.ipAddr = ipAddr;
//  }

  public Integer getRecommendationId() {
    return recommendationId;
  }

  public void setRecommendationId(Integer recommendationId) {
    this.recommendationId = recommendationId;
  }

  public Integer getHighriskCveCount() {
    return highriskCveCount;
  }

  public void setHighriskCveCount(Integer highriskCveCount) {
    this.highriskCveCount = highriskCveCount;
  }

  public String getHighriskCveList() {
    return highriskCveList;
  }

  public void setHighriskCveList(String highriskCveList) {
    this.highriskCveList = highriskCveList;
  }

  public Integer getMediumLowRiskCveCount() {
    return mediumLowRiskCveCount;
  }

  public void setMediumLowRiskCveCount(Integer mediumLowRiskCveCount) {
    this.mediumLowRiskCveCount = mediumLowRiskCveCount;
  }

  public String getMediumLowRiskCveList() {
    return mediumLowRiskCveList;
  }

  public void setMediumLowRiskCveList(String mediumLowRiskCveList) {
    this.mediumLowRiskCveList = mediumLowRiskCveList;
  }
}
