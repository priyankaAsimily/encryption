package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "dicom_sessions", schema = "raw_on_prem")
public class EDicomSessions extends ETenantBase {
  @Column(name = "session_id")
  private Integer sessionId;

  @Column(name = "study_description")
  private String studyDescription;

  @Column(name = "series_description")
  private String seriesDescription;

  @Column(name = "body_part_examined")
  private String bodyPartExamined;

  @Column(name = "series_time")
  private String seriesTime;

  @Column(name = "study_time")
  private String studyTime;

  @Column(name = "study_date")
  private String studyDate;

  @Column(name = "series_date")
  private String seriesDate;

  @Column(name = "tag_json")
  private String tagJson;

  @Column(name = "is_sender")
  private Boolean isSender;

  public String getStudyDate() {
    return studyDate;
  }

  public void setStudyDate(String studyDate) {
    this.studyDate = studyDate;
  }

  public String getSeriesDate() {
    return seriesDate;
  }

  public void setSeriesDate(String seriesDate) {
    this.seriesDate = seriesDate;
  }

  public String getSeriesTime() {
    return seriesTime;
  }

  public void setSeriesTime(String seriesTime) {
    this.seriesTime = seriesTime;
  }

  public String getStudyTime() {
    return studyTime;
  }

  public void setStudyTime(String studyTime) {
    this.studyTime = studyTime;
  }

  public Integer getSessionId() {
    return sessionId;
  }

  public void setSessionId(Integer sessionId) {
    this.sessionId = sessionId;
  }

  public String getStudyDescription() {
    return studyDescription;
  }

  public void setStudyDescription(String studyDescription) {
    this.studyDescription = studyDescription;
  }

  public String getSeriesDescription() {
    return seriesDescription;
  }

  public void setSeriesDescription(String seriesDescription) {
    this.seriesDescription = seriesDescription;
  }

  public String getBodyPartExamined() {
    return bodyPartExamined;
  }

  public void setBodyPartExamined(String bodyPartExamined) {
    this.bodyPartExamined = bodyPartExamined;
  }

  public String getTagJson() {
    return tagJson;
  }

  public void setTagJson(String tagJson) {
    this.tagJson = tagJson;
  }

  public Boolean getIsSender() {
    return isSender;
  }

  public void setIsSender(Boolean isSender) {
    this.isSender = isSender;
  }

}
