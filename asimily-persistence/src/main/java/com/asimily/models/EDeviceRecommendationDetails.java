package com.asimily.models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "device_recommendation_details", schema = "portal")
public class EDeviceRecommendationDetails extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "recommendation_id")
  private Integer recommendationId;

  @Column(name = "recommendation")
  private String recommendation;

  @Column(name = "device_info_id")
  private Integer deviceInfoId;

  @Column(name = "cve_id")
  private Integer cveId;

  @Column(name = "cve_score")
  private Double cveScore;

  @Column(name = "recommendation_type")
  private Integer recommendationType;

  @Column(name = "cve_name")
  private String cveName;

  @Column(name = "acl")
  private String acl;

  @Column(name = "is_fixed")
  private Boolean isFixed;

  @Column(name="fix_action_taken")
  private String fixActionTaken;

  @Column(name="fixed_by")
  private String fixedBy;

  @Column(name="fixed_date")
  private Timestamp fixedDate;

  // @Column(name = "ip_addr")
  // private String ipAddr;

  public String getRecommendation() {
    return recommendation;
  }

  public void setRecommendation(String recommendation) {
    this.recommendation = recommendation;
  }

  public Integer getRecommendationId() {
    return recommendationId;
  }

  public void setRecommendationId(Integer recommendationId) {
    this.recommendationId = recommendationId;
  }

  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
  }

  public Integer getCveId() {
    return cveId;
  }

  public void setCveId(Integer cveId) {
    this.cveId = cveId;
  }

  public Double getCveScore() {
    return cveScore;
  }

  public void setCveScore(Double cveScore) {
    this.cveScore = cveScore;
  }

  public Integer getRecommendationType() {
    return recommendationType;
  }

  public void setRecommendationType(Integer recommendationType) {
    this.recommendationType = recommendationType;
  }

  public String getCveName() {
    return cveName;
  }

  public void setCveName(String cveName) {
    this.cveName = cveName;
  }

  public String getAcl() {
    return acl;
  }

  public void setAcl(String acl) {
    this.acl = acl;
  }

  public Boolean getIsFixed() {
    return isFixed;
  }

  public void setIsFixed(Boolean isFixed) {
    this.isFixed = isFixed;
  }

  public String getFixActionTaken() {
    return fixActionTaken;
  }

  public void setFixActionTaken(String fixActionTaken) {
    this.fixActionTaken = fixActionTaken;
  }

  public String getFixedBy() {
    return fixedBy;
  }

  public void setFixedBy(String fixedBy) {
    this.fixedBy = fixedBy;
  }

  public Timestamp getFixedDate() {
    return fixedDate;
  }

  public void setFixedDate(Timestamp fixedDate) {
    this.fixedDate = fixedDate;
  }

  // public String getIpAddr() {
  // return ipAddr;
  // }
  //
  // public void setIpAddr(String ipAddr) {
  // this.ipAddr = ipAddr;
  // }

}
