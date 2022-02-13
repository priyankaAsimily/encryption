package com.asimily.models;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Timestamp;

import java.sql.Timestamp;

@Entity
@Table(name = "org_score", schema = "portal")
public class EOrgScore extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "org_risk_score")
  private Double orgRiskScore;

  @Column(name = "org_risk_score_type")
  private Integer orgRiskScoreType;

  @Column(name = "org_denominator")
  private Double orgDenominator;

  @Column(name = "sum_risk_anomaly")
  private Double sumRiskAnomaly;

  @Column(name = "sum_risk_likelihood")
  private Double sumRiskLikelihood;

  @Column(name = "num_high_risk_high_impact")
  private Integer numHighRiskHighImpact;

  @Column(name = "num_high_risk_medium_impact")
  private Integer numHighRiskMediumImpact;

  @Column(name = "num_high_risk_low_impact")
  private Integer numHighRiskLowImpact;

  @Column(name = "num_medium_risk_high_impact")
  private Integer numMediumRiskHighImpact;

  @Column(name = "num_medium_risk_medium_impact")
  private Integer numMediumRiskMediumImpact;

  @Column(name = "num_medium_risk_low_impact")
  private Integer numMediumRiskLowImpact;

  @Column(name = "num_low_risk_high_impact")
  private Integer numLowRiskHighImpact;

  @Column(name = "num_low_risk_medium_impact")
  private Integer numLowRiskMediumImpact;

  @Column(name = "num_low_risk_low_impact")
  private Integer numLowRiskLowImpact;

  @Column(name = "num_high_risk_anomalies")
  private Integer numHighRiskAnomalies;

  @Column(name = "num_medium_risk_anomalies")
  private Integer numMediumRiskAnomalies;

  @Column(name = "num_low_risk_anomalies")
  private Integer numLowRiskAnomalies;

  @Column(name = "computed_time")
  private Timestamp computedTime;

  
  public Double getOrgRiskScore () {
    return orgRiskScore;
  }

  public Integer getOrgRiskScoreType () {
    return orgRiskScoreType;
  }

  public Double getOrgDenominator () {
    return orgDenominator;
  }

  public Double getSumRiskAnomaly () {
    return sumRiskAnomaly;
  }

  public Double getSumRiskLikelihood () {
    return sumRiskLikelihood;
  }

  public Integer getNumHighRiskHighImpact () {
    return numHighRiskHighImpact;
  }

  public Integer getNumHighRiskMediumImpact () {
    return numHighRiskMediumImpact;
  }

  public Integer getNumHighRiskLowImpact () {
    return numHighRiskLowImpact;
  }

  public Integer getNumMediumRiskHighImpact () {
    return numMediumRiskHighImpact;
  }

  public Integer getNumMediumRiskMediumImpact () {
    return numMediumRiskMediumImpact;
  }

  public Integer getNumMediumRiskLowImpact () {
    return numMediumRiskLowImpact;
  }

  public Integer getNumLowRiskHighImpact () {
    return numLowRiskHighImpact;
  }

  public Integer getNumLowRiskMediumImpact () {
    return numLowRiskMediumImpact;
  }

  public Integer getNumLowRiskLowImpact () {
    return numLowRiskLowImpact;
  }

  public Integer getNumHighRiskAnomalies () {
    return numHighRiskAnomalies;
  }

  public Integer getNumMediumRiskAnomalies () {
    return numMediumRiskAnomalies;
  }

  public Integer getNumLowRiskAnomalies () {
    return numLowRiskAnomalies;
  }

  public Timestamp getComputedTime () {
    return computedTime;
  }

  public void setOrgRiskScore(Double orgRiskScore) {
    this.orgRiskScore = orgRiskScore;
  }

  public void setOrgRiskScoreType(Integer orgRiskScoreType) {
    this.orgRiskScoreType = orgRiskScoreType;
  }

  public void setOrgDenominator(Double orgDenominator) {
    this.orgDenominator = orgDenominator;
  }

  public void setSumRiskAnomaly(Double sumRiskAnomaly) {
    this.sumRiskAnomaly = sumRiskAnomaly;
  }

  public void setSumRiskLikelihood(Double sumRiskLikelihood) {
    this.sumRiskLikelihood = sumRiskLikelihood;
  }

  public void setNumHighRiskHighImpact(Integer numHighRiskHighImpact) {
    this.numHighRiskHighImpact = numHighRiskHighImpact;
  }

  public void setNumHighRiskMediumImpact(Integer numHighRiskMediumImpact) {
    this.numHighRiskMediumImpact = numHighRiskMediumImpact;
  }

  public void setNumHighRiskLowImpact(Integer numHighRiskLowImpact) {
    this.numHighRiskLowImpact = numHighRiskLowImpact;
  }

  public void setNumMediumRiskHighImpact(Integer numMediumRiskHighImpact) {
    this.numMediumRiskHighImpact = numMediumRiskHighImpact;
  }

  public void setNumMediumRiskMediumImpact(Integer numMediumRiskMediumImpact) {
    this.numMediumRiskMediumImpact = numMediumRiskMediumImpact;
  }

  public void setNumMediumRiskLowImpact(Integer numMediumRiskLowImpact) {
    this.numMediumRiskLowImpact = numMediumRiskLowImpact;
  }

  public void setNumLowRiskHighImpact(Integer numLowRiskHighImpact) {
    this.numLowRiskHighImpact = numLowRiskHighImpact;
  }

  public void setNumLowRiskMediumImpact(Integer numLowRiskMediumImpact) {
    this.numLowRiskMediumImpact = numLowRiskMediumImpact;
  }

  public void setNumLowRiskLowImpact(Integer numLowRiskLowImpact) {
    this.numLowRiskLowImpact = numLowRiskLowImpact;
  }

  public void setNumHighRiskAnomalies(Integer numHighRiskAnomalies) {
    this.numHighRiskAnomalies = numHighRiskAnomalies;
  }

  public void setNumMediumRiskAnomalies(Integer numMediumRiskAnomalies) {
    this.numMediumRiskAnomalies = numMediumRiskAnomalies;
  }

  public void setNumLowRiskAnomalies(Integer numLowRiskAnomalies) {
    this.numLowRiskAnomalies = numLowRiskAnomalies;
  }

  public void setComputedTime(Timestamp computedTime) {
    this.computedTime = computedTime;
  }

}
