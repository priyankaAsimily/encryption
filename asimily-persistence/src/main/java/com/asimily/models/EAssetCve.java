package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "asset_cve", schema = "raw_third_party")
public class EAssetCve extends ETenantBase {

  private static final long serialVersionUID = 1L;

  @Column(name = "cve_id")
  private String cveId;

  @Column(name = "asset_id")
  private String assetId;

  @Column(name = "source_type")
  private Integer sourceType;

  @Column(name = "device_info_id")
  private Integer deviceInfoId;

  @Column(name = "nvd_cve_product_id")
  private Integer nvdCveProductId;

  @Column(name = "is_fixed")
  private Integer isFixed;

  @Column(name = "criticality")
  private Integer  criticality;

  @Column(name = "cve_cr")
  private String  cveCR;

  @Column(name = "cve_ar")
  private String  cveAR;

  @Column(name = "cve_ir")
  private String  cveIR;

  @Column(name = "ir_multiplication_factor")
  private String  irMultiplicationFactor;

  @Column(name = "ar_multiplication_factor")
  private String  arMultiplicationFactor;

  @Column(name = "cr_multiplication_factor")
  private String  crMultiplicationFactor;

  @Column(name = "attack_vector")
  private String  attackVector;

  @Column(name = "attack_complexity")
  private String  attackComplexity;

  @Column(name = "user_interaction")
  private String userInteraction;

  @Column(name = "privileges_required")
  private String  privilegesRequired;

  @Column(name = "remediation_level")
  private String remediationLevel;

  @Column(name = "score")
  private Double score;
  
  @Column(name="fix_action_taken")
  private String fixActionTaken;
  
  @Column(name="trigger_text")
  private String triggertext;
  
  @Column(name="exploit_vector")
  private String exploitVector;
  
  @Column(name="recommendations")
  private String recommendations;

  @Column(name="cve_name")
  private String cveName;
  
  public String getCveId() {
    return cveId;
  }

  public void setCveId(String cveId) {
    this.cveId = cveId;
  }

  public String getAssetId() {
    return assetId;
  }

  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  public Integer getSourceType() {
    return sourceType;
  }

  public void setSourceType(Integer sourceType) {
    this.sourceType = sourceType;
  }

  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
  }

  public Integer getNvdCveProductId() {
    return nvdCveProductId;
  }

  public void setNvdCveProductId(Integer nvdCveProductId) {
    this.nvdCveProductId = nvdCveProductId;
  }

  public Integer getIsFixed() {
    return isFixed;
  }

  public void setIsFixed(Integer isFixed) {
    this.isFixed = isFixed;
  }

  public Integer getCriticality() {
    return criticality;
  }

  public void setCriticality(Integer criticality) {
    this.criticality = criticality;
  }

  public String getCveCR() {
    return cveCR;
  }

  public void setCveCR(String cveCR) {
    this.cveCR = cveCR;
  }

  public String getCveAR() {
    return cveAR;
  }

  public void setCveAR(String cveAR) {
    this.cveAR = cveAR;
  }

  public String getCveIR() {
    return cveIR;
  }

  public void setCveIR(String cveIR) {
    this.cveIR = cveIR;
  }

  public String getIrMultiplicationFactor() {
    return irMultiplicationFactor;
  }

  public void setIrMultiplicationFactor(String irMultiplicationFactor) {
    this.irMultiplicationFactor = irMultiplicationFactor;
  }

  public String getArMultiplicationFactor() {
    return arMultiplicationFactor;
  }

  public void setArMultiplicationFactor(String arMultiplicationFactor) {
    this.arMultiplicationFactor = arMultiplicationFactor;
  }

  public String getCrMultiplicationFactor() {
    return crMultiplicationFactor;
  }

  public void setCrMultiplicationFactor(String crMultiplicationFactor) {
    this.crMultiplicationFactor = crMultiplicationFactor;
  }

  public String getAttackVector() {
    return attackVector;
  }

  public void setAttackVector(String attackVector) {
    this.attackVector = attackVector;
  }

  public String getAttackComplexity() {
    return attackComplexity;
  }

  public void setAttackComplexity(String attackComplexity) {
    this.attackComplexity = attackComplexity;
  }

  public String getUserInteraction() {
    return userInteraction;
  }

  public void setUserInteraction(String userInteraction) {
    this.userInteraction = userInteraction;
  }

  public String getPrivilegesRequired() {
    return privilegesRequired;
  }

  public void setPrivilegesRequired(String privilegesRequired) {
    this.privilegesRequired = privilegesRequired;
  }

  public String getRemediationLevel() {
    return remediationLevel;
  }

  public void setRemediationLevel(String remediationLevel) {
    this.remediationLevel = remediationLevel;
  }

  public Double getScore() {
    return score;
  }

  public void setScore(Double score) {
    this.score = score;
  }

  public String getFixActionTaken() {
    return fixActionTaken;
  }

  public void setFixActionTaken(String fixActionTaken) {
    this.fixActionTaken = fixActionTaken;
  }

  public String getTriggertext() {
    return triggertext;
  }

  public void setTriggertext(String triggertext) {
    this.triggertext = triggertext;
  }

  public String getExploitVector() {
    return exploitVector;
  }

  public void setExploitVector(String exploitVector) {
    this.exploitVector = exploitVector;
  }

  public String getRecommendations() {
    return recommendations;
  }

  public void setRecommendations(String recommendations) {
    this.recommendations = recommendations;
  }

  public String getCveName() {
    return cveName;
  }

  public void setCveName(String cveName) {
    this.cveName = cveName;
  }
}
