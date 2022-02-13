package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "master_report_name", schema = "raw_cloud")
public class EMasterReportName extends EBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "report_name")
  private String reportName;

  @Column(name = "report_rules")
  private String reportRules;

  @Column(name = "description")
  private String description;

  @Column(name = "report_format")
  private String reportFormat;

  @Column(name = "report_id")
  private Integer reportId;

  public String getReportName() {
    return reportName;
  }

  public void setReportName(String reportName) {
    this.reportName = reportName;
  }

  public String getReportRules() {
    return reportRules;
  }

  public void setReportRules(String reportRules) {
    this.reportRules = reportRules;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getReportFormat() {
    return reportFormat;
  }

  public void setReportFormat(String reportFormat) {
    this.reportFormat = reportFormat;
  }

  public Integer getReportId() {
    return reportId;
  }

  public void setReportId(Integer reportId) {
    this.reportId = reportId;
  }

}
