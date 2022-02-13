package com.asimily.models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "vulnerabilities_application_device_view", schema = "portal")
public class EVulnerabilitiesApplicationDeviceView extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "device_info_id")
  private Integer deviceInfoId;
  
  @Column(name = "cve_id")
  private Integer cveId;
  
  @Column(name = "nvd_cve_product_id")
  private Integer cveProductId;

  @Column(name = "cve")
  private String cveName;

  @Column(name = "cve_title")
  private String cveTitle;

  @Column(name = "vulnerability_score")
  private Double score;

  @Column(name = "assigned_user")
  private Integer userId;

  @Column(name = "due_date")
  private Timestamp dueDate;

  @Column(name = "affected_app_name")
  private String affectedAppName;
  
  @Column(name = "affected_app_type")
  private String affectedAppType;

  @Column(name="source")
  private String source;

  @Column(name = "is_fixed")
  private Integer isFixed;

  public Integer getCveId() {
    return cveId;
  }

  public void setCveId(Integer cveId) {
    this.cveId = cveId;
  }

  public String getCveName() {
    return cveName;
  }

  public void setCveName(String cveName) {
    this.cveName = cveName;
  }

  public String getCveTitle() {
    return cveTitle;
  }

  public void setCveTitle(String cveTitle) {
    this.cveTitle = cveTitle;
  }

  public Double getScore() {
    return score;
  }

  public void setScore(Double score) {
    this.score = score;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public Timestamp getDueDate() {
    return dueDate;
  }

  public void setDueDate(Timestamp dueDate) {
    this.dueDate = dueDate;
  }

  public String getAffectedAppName() {
    return affectedAppName;
  }

  public void setAffectedAppName(String affectedAppName) {
    this.affectedAppName = affectedAppName;
  }

  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
  }

  public String getAffectedAppType() {
    return affectedAppType;
  }

  public void setAffectedAppType(String affectedAppType) {
    this.affectedAppType = affectedAppType;
  }

  public Integer getCveProductId() {
    return cveProductId;
  }

  public void setCveProductId(Integer cveProductId) {
    this.cveProductId = cveProductId;
  }

  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public Integer getIsFixed() {
    return isFixed;
  }

  public void setIsFixed(Integer isFixed) {
    this.isFixed = isFixed;
  }
}
