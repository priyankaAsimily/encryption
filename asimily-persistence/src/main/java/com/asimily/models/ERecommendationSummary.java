package com.asimily.models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "recommendation_summary", schema = "portal")
public class ERecommendationSummary extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "recommendation_Id")
  private Integer recommendationId;

  @Column(name = "recommendation")
  private String recommendation;

  @Column(name = "recommendation_type")
  private Integer recommendationType;

  @Column(name = "high_risk_cve_count")
  private Long highRiskCveCount;

  @Column(name = "high_risk_device_count")
  private Long highRiskDeviceCount;

  @Column(name = "high_risk_fixed_cve_count")
  private Long highRiskFixedCveCount;

  @Column(name = "high_risk_fixed_device_count")
  private Long highRiskFixedDeviceCount;

  @Column(name = "medium_low_risk_cve_count")
  private Long mediumLowRiskCveCount;

  @Column(name = "medium_low_risk_device_count")
  private Long mediumLowRiskDeviceCount;

  @Column(name = "total_device_count")
  private Long totalDeviceCount;

  @Column(name = "total_cve_count")
  private Long totalCveCount;

  @Column(name = "acl")
  private String acl;

  @Column(name="fix_action_taken")
  private String fixActionTaken;

  @Column(name="fixed_by")
  private String fixedBy;

  @Column(name="fixed_date")
  private Timestamp fixedDate;

  @Column(name = "is_fixed")
  private Boolean isFixed;

  public Integer getRecommendationId() {
    return recommendationId;
  }

  public void setRecommendationId(Integer recommendationId) {
    this.recommendationId = recommendationId;
  }

  public String getRecommendation() {
    return recommendation;
  }

  public void setRecommendation(String recommendation) {
    this.recommendation = recommendation;
  }

  public Integer getRecommendationType() {
    return recommendationType;
  }

  public void setRecommendationType(Integer recommendationType) {
    this.recommendationType = recommendationType;
  }

  public Long getHighRiskCveCount() {
    return highRiskCveCount;
  }

  public void setHighRiskCveCount(Long highRiskCveCount) {
    this.highRiskCveCount = highRiskCveCount;
  }

  public Long getHighRiskDeviceCount() {
    return highRiskDeviceCount;
  }

  public void setHighRiskDeviceCount(Long highRiskDeviceCount) {
    this.highRiskDeviceCount = highRiskDeviceCount;
  }

  public Long getHighRiskFixedCveCount() {
    return highRiskFixedCveCount;
  }

  public void setHighRiskFixedCveCount(Long highRiskFixedCveCount) {
    this.highRiskFixedCveCount = highRiskFixedCveCount;
  }

  public Long getHighRiskFixedDeviceCount() {
    return highRiskFixedDeviceCount;
  }

  public void setHighRiskFixedDeviceCount(Long highRiskFixedDeviceCount) {
    this.highRiskFixedDeviceCount = highRiskFixedDeviceCount;
  }

  public Long getTotalDeviceCount() {
    return totalDeviceCount;
  }

  public void setTotalDeviceCount(Long totalDeviceCount) {
    this.totalDeviceCount = totalDeviceCount;
  }

  public Long getTotalCveCount() {
    return totalCveCount;
  }

  public void setTotalCveCount(Long totalCveCount) {
    this.totalCveCount = totalCveCount;
  }

  public Long getMediumLowRiskCveCount() {
    return mediumLowRiskCveCount;
  }

  public void setMediumLowRiskCveCount(Long mediumLowRiskCveCount) {
    this.mediumLowRiskCveCount = mediumLowRiskCveCount;
  }

  public Long getMediumLowRiskDeviceCount() {
    return mediumLowRiskDeviceCount;
  }

  public void setMediumLowRiskDeviceCount(Long mediumLowRiskDeviceCount) {
    this.mediumLowRiskDeviceCount = mediumLowRiskDeviceCount;
  }

  public String getAcl() {
    return acl;
  }

  public void setAcl(String acl) {
    this.acl = acl;
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

  public Boolean getIsFixed() {
    return isFixed;
  }

  public void setIsFixed(Boolean isFixed) {
    this.isFixed = isFixed;
  }

}
