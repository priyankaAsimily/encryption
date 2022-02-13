package com.asimily.models;

import java.sql.Timestamp;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Cacheable(false)
@Table(name = "user_report", schema = "admin")
public class EUserReport extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "user_id")
  private Integer userId;

  @Column(name = "report_name")
  private String reportName;

  @Column(name = "report_status")
  private Integer reportStatus;

  @Column(name = "report_id")
  private Integer reportId;

  @Column(name = "report_format")
  private String reportFormat;

  @Column(name = "report_path")
  private String reportPath;

  @Column(name = "report_rules")
  private String reportRules;

  @Column(name = "description")
  private String description;

  @Column(name = "generated_time")
  private Timestamp generatedTime;

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public String getDescription() {
    return description;
  }

  public void setdescription(String description) {
    this.description = description;
  }

  public String getReportName() {
    return reportName;
  }

  public void setReportName(String reportName) {
    this.reportName = reportName;
  }

  public Integer getReportStatus() {
    return reportStatus;
  }

  public void setReportStatus(Integer reportStatus) {
    this.reportStatus = reportStatus;
  }

  public Integer getReportId(){
          return reportId;
  }

  public void setReportId(Integer reportId) {
          this.reportId = reportId;
  }

  public String getreportFormat() {
          return reportFormat;
  }

  public void setreportFormat(String reportFormat) {
    this.reportFormat = reportFormat;
  }

  public String getReportPath() {
    return reportPath;
  }

  public void setReportPath(String reportPath) {
    this.reportPath = reportPath;
  }

  public String getReportRules() {
    return reportRules;
  }

  public void setReportRules(String reportRules) {
    this.reportRules = reportRules;
  }

  public Timestamp getGeneratedTime() {
    return generatedTime;
  }

  public void setGeneratedTime(Timestamp generatedTime) {
    this.generatedTime = generatedTime;
  }

}
