package com.asimily.models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the nvd_impact database table.
 * 
 */
@Entity
@Table(name = "nvd_impact", schema = "raw_cloud")
public class ENvdImpact extends EBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "attack_complexity")
  private String attackComplexity;

  @Column(name = "attack_vector")
  private String attackVector;

  private String authentication;

  @Column(name = "availability_impact")
  private String availabilityImpact;

  @Column(name = "availability_requirement")
  private String availabilityRequirement;

  @Column(name = "base_score")
  private float baseScore;

  @Column(name = "base_severity")
  private String baseSeverity;

  @Column(name = "collateral_damage_potential")
  private String collateralDamagePotential;

  @Column(name = "confidentiality_impact")
  private String confidentialityImpact;

  @Column(name = "confidentiality_requirement")
  private String confidentialityRequirement;

  @Column(name = "cvss_version")
  private Integer cvssVersion;

  private String exploitability;

  @Column(name = "exploitability_score")
  private float exploitabilityScore;

  @Column(name = "impact_score")
  private float impactScore;

  @Column(name = "integrity_impact")
  private String integrityImpact;

  @Column(name = "integrity_requirement")
  private String integrityRequirement;

  @Column(name = "last_updated_time")
  private Timestamp lastUpdatedTime;

  @Column(name = "metric_type")
  private String metricType;

  @Column(name = "obtain_all_privilege")
  private Boolean obtainAllPrivilege;

  @Column(name = "obtain_other_privilege")
  private Boolean obtainOtherPrivilege;

  @Column(name = "obtain_user_privilege")
  private Boolean obtainUserPrivilege;

  @Column(name = "privileges_required")
  private String privilegesRequired;

  @Column(name = "remediation_level")
  private String remediationLevel;

  @Column(name = "report_confidence")
  private String reportConfidence;

  private String severity;

  @Column(name = "soft_delete")
  private Boolean softDelete;

  @Column(name = "target_distribution")
  private String targetDistribution;

  @Column(name = "user_interaction")
  private String userInteraction;

  @Column(name = "user_interaction_required")
  private Boolean userInteractionRequired;

  @Column(name = "vector_string")
  private String vectorString;

  @Column(name = "cve_id")
  private Integer cveId;

  @Column(name = "insert_src")
  private String insertSrc;

  public ENvdImpact() {
  }

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getAttackComplexity() {
    return this.attackComplexity;
  }

  public void setAttackComplexity(String attackComplexity) {
    this.attackComplexity = attackComplexity;
  }

  public String getAttackVector() {
    return this.attackVector;
  }

  public void setAttackVector(String attackVector) {
    this.attackVector = attackVector;
  }

  public String getAuthentication() {
    return this.authentication;
  }

  public void setAuthentication(String authentication) {
    this.authentication = authentication;
  }

  public String getAvailabilityImpact() {
    return this.availabilityImpact;
  }

  public void setAvailabilityImpact(String availabilityImpact) {
    this.availabilityImpact = availabilityImpact;
  }

  public String getAvailabilityRequirement() {
    return this.availabilityRequirement;
  }

  public void setAvailabilityRequirement(String availabilityRequirement) {
    this.availabilityRequirement = availabilityRequirement;
  }

  public float getBaseScore() {
    return this.baseScore;
  }

  public void setBaseScore(float baseScore) {
    this.baseScore = baseScore;
  }

  public String getBaseSeverity() {
    return this.baseSeverity;
  }

  public void setBaseSeverity(String baseSeverity) {
    this.baseSeverity = baseSeverity;
  }

  public String getCollateralDamagePotential() {
    return this.collateralDamagePotential;
  }

  public void setCollateralDamagePotential(String collateralDamagePotential) {
    this.collateralDamagePotential = collateralDamagePotential;
  }

  public String getConfidentialityImpact() {
    return this.confidentialityImpact;
  }

  public void setConfidentialityImpact(String confidentialityImpact) {
    this.confidentialityImpact = confidentialityImpact;
  }

  public String getConfidentialityRequirement() {
    return this.confidentialityRequirement;
  }

  public void setConfidentialityRequirement(String confidentialityRequirement) {
    this.confidentialityRequirement = confidentialityRequirement;
  }

  public Integer getCvssVersion() {
    return this.cvssVersion;
  }

  public void setCvssVersion(Integer cvssVersion) {
    this.cvssVersion = cvssVersion;
  }

  public String getExploitability() {
    return this.exploitability;
  }

  public void setExploitability(String exploitability) {
    this.exploitability = exploitability;
  }

  public float getExploitabilityScore() {
    return this.exploitabilityScore;
  }

  public void setExploitabilityScore(float exploitabilityScore) {
    this.exploitabilityScore = exploitabilityScore;
  }

  public float getImpactScore() {
    return this.impactScore;
  }

  public void setImpactScore(float impactScore) {
    this.impactScore = impactScore;
  }

  public String getIntegrityImpact() {
    return this.integrityImpact;
  }

  public void setIntegrityImpact(String integrityImpact) {
    this.integrityImpact = integrityImpact;
  }

  public String getIntegrityRequirement() {
    return this.integrityRequirement;
  }

  public void setIntegrityRequirement(String integrityRequirement) {
    this.integrityRequirement = integrityRequirement;
  }

  public Timestamp getLastUpdatedTime() {
    return this.lastUpdatedTime;
  }

  public void setLastUpdatedTime(Timestamp lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
  }

  public String getMetricType() {
    return this.metricType;
  }

  public void setMetricType(String metricType) {
    this.metricType = metricType;
  }

  public Boolean getObtainAllPrivilege() {
    return this.obtainAllPrivilege;
  }

  public void setObtainAllPrivilege(Boolean obtainAllPrivilege) {
    this.obtainAllPrivilege = obtainAllPrivilege;
  }

  public Boolean getObtainOtherPrivilege() {
    return this.obtainOtherPrivilege;
  }

  public void setObtainOtherPrivilege(Boolean obtainOtherPrivilege) {
    this.obtainOtherPrivilege = obtainOtherPrivilege;
  }

  public Boolean getObtainUserPrivilege() {
    return this.obtainUserPrivilege;
  }

  public void setObtainUserPrivilege(Boolean obtainUserPrivilege) {
    this.obtainUserPrivilege = obtainUserPrivilege;
  }

  public String getPrivilegesRequired() {
    return this.privilegesRequired;
  }

  public void setPrivilegesRequired(String privilegesRequired) {
    this.privilegesRequired = privilegesRequired;
  }

  public String getRemediationLevel() {
    return this.remediationLevel;
  }

  public void setRemediationLevel(String remediationLevel) {
    this.remediationLevel = remediationLevel;
  }

  public String getReportConfidence() {
    return this.reportConfidence;
  }

  public void setReportConfidence(String reportConfidence) {
    this.reportConfidence = reportConfidence;
  }

  public String getSeverity() {
    return this.severity;
  }

  public void setSeverity(String severity) {
    this.severity = severity;
  }

  public Boolean getSoftDelete() {
    return this.softDelete;
  }

  public void setSoftDelete(Boolean softDelete) {
    this.softDelete = softDelete;
  }

  public String getTargetDistribution() {
    return this.targetDistribution;
  }

  public void setTargetDistribution(String targetDistribution) {
    this.targetDistribution = targetDistribution;
  }

  public String getUserInteraction() {
    return this.userInteraction;
  }

  public void setUserInteraction(String userInteraction) {
    this.userInteraction = userInteraction;
  }

  public Boolean getUserInteractionRequired() {
    return this.userInteractionRequired;
  }

  public void setUserInteractionRequired(Boolean userInteractionRequired) {
    this.userInteractionRequired = userInteractionRequired;
  }

  public String getVectorString() {
    return this.vectorString;
  }

  public void setVectorString(String vectorString) {
    this.vectorString = vectorString;
  }

  public Integer getCveId() {
    return cveId;
  }

  public void setCveId(Integer cveId) {
    this.cveId = cveId;
  }

  public String getInsertSrc() {
    return insertSrc;
  }

  public void setInsertSrc(String insertSrc) {
    this.insertSrc = insertSrc;
  }

}