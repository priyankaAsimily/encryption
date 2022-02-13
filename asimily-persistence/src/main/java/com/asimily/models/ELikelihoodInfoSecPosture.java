package com.asimily.models;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the likelihood_info_secpos database table.
 * 
 */
@Entity
@Table(name = "device_likelihood_info_secpos", schema = "portal")
public class ELikelihoodInfoSecPosture extends ETenantBase implements Serializable {
  private static final long serialVersionUID = 1L;

  @Column(name = "device_info_id")
  private Integer deviceInfoId;

  private String category;

  private String question;

  private String criticality;

  private BigDecimal score;
  @Column(name = "status")
  private String yesOrNo;

  public ELikelihoodInfoSecPosture() {
  }

  public String getCategory() {
    return this.category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getQuestion() {
    return this.question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }

  public BigDecimal getScore() {
    return this.score;
  }

  public void setScore(BigDecimal score) {
    this.score = score;
  }

  public String getYesOrNo() {
    return yesOrNo;
  }

  public void setYesOrNo(String yesOrNo) {
    this.yesOrNo = yesOrNo;
  }

  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
  }

  public String getCriticality() {
    return criticality;
  }

  public void setCriticality(String criticality) {
    this.criticality = criticality;
  }

}