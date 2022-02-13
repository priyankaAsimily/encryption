package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "recommendation_view", schema = "portal")
public class ERecommendationView extends EBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "recommendation")
  private String recommendation;

  @Column(name = "recommendation_type")
  private Integer recommendationType;

  @Column(name = "recommendation_id")
  private Integer recommendationId;

  @Column(name = "cve_count")
  private Integer cveCount;

  @Column(name = "device_count")
  private Integer deviceCount;

  @Column(name = "cve_id")
  private Integer cveId;


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

  public Integer getRecommendationId() {
    return recommendationId;
  }

  public void setRecommendationId(Integer recommendationId) {
    this.recommendationId = recommendationId;
  }

  public Integer getCveCount() {
    return cveCount;
  }

  public void setCveCount(Integer cveCount) {
    this.cveCount = cveCount;
  }

  public Integer getDeviceCount() {
    return deviceCount;
  }

  public void setDeviceCount(Integer deviceCount) {
    this.deviceCount = deviceCount;
  }

  public Integer getCveId() {
    return cveId;
  }

  public void setCveId(Integer cveId) {
    this.cveId = cveId;
  }
}
