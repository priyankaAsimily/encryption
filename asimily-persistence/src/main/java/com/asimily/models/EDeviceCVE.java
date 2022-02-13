package com.asimily.models;

import java.sql.Timestamp;

import javax.persistence.*;

/**
 * The persistent class for the device_info database table.
 * 
 */
@Entity
@Table(name = "device_cve", schema = "portal")
public class EDeviceCVE extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "device_info_id")
  private Integer deviceInfoId;

  @Column(name = "cve_id")
  private Integer cveId;
  
  @Column(name = "nvd_cve_product_id")
  private Integer cveProductId;

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
  private Double  score;
  
  @Column(name="fix_action_taken")
  private String fixActionTaken;

  @Column(name="fixed_by")
  private Integer fixedBy;

  @Column(name="fixed_date")
  private Timestamp fixedDate;

  @Column(name="source")
  private String source;
  
  @Column(name="trigger_text")
  private String triggertext;
  
  @Column(name="exploit_vector")
  private String exploitVector;

  @Column(name="external_source")
  private Integer externalSource;
  
  @Column(name="recommendations")
  private String recommendations;

//  @Column(name="affected_app_name")
//  private String affectedAppName;
  
  public EDeviceCVE() {
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
 
  public Integer getCriticality() {
    return criticality;
  }

  public Integer getCveProductId() {
    return cveProductId;
  }

  public void setCveProductId(Integer cveProductId) {
    this.cveProductId = cveProductId;
  }

  public void setCriticality(Integer criticality) {
    this.criticality = criticality;
  }

  public Double getScore() {
    return score;
  }

  public void setScore(Double score) {
    this.score = score;
  }

  public Integer getIsFixed() {
    return isFixed;
  }

  public void setIsFixed(Integer isFixed) {
    this.isFixed = isFixed;
  }
  
  public Integer getFixed() {
    return isFixed;
  }

  public void setFixed(Integer fixed) {
    isFixed = fixed;
  }
  public String getFixActionTaken() {
    return fixActionTaken;
  }

  public void setFixActionTaken(String fixActionTaken) {
    this.fixActionTaken = fixActionTaken;
  }

  public Integer getFixedBy() {
    return fixedBy;
  }

  public void setFixedBy(Integer fixedBy) {
    this.fixedBy = fixedBy;
  }

  public Integer getExternalSource() {
    return externalSource;
  }

  public void setExternalSource(Integer externalSource) {
    this.externalSource = externalSource;
  }

  public Timestamp getFixedDate() {
    return fixedDate;
  }

  public void setFixedDate(Timestamp fixedDate) {
    this.fixedDate = fixedDate;
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

  public String getRemediationLevel() {
    return remediationLevel;
  }

  public void setRemediationLevel(String remediationLevel) {
    this.remediationLevel = remediationLevel;
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

  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
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
  
}
