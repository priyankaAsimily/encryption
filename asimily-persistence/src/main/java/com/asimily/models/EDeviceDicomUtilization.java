package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "device_dicom_utilization", schema = "portal")
public class EDeviceDicomUtilization extends ETenantBase {
  @Column(name = "device_info_id")
  private Integer deviceInfoId;

  @Column(name = "study_description")
  private String studyDescription;

  @Column(name = "series_description")
  private String seriesDescription;

  @Column(name = "body_part_examined")
  private String bodyPartExamined;
  
  @Column(name = "study_timestamp")
  private Timestamp studyTimestamp;

  @Column(name = "series_timestamp")
  private Timestamp seriesTimestamp;

  @Column(name = "network_timestamp")
  private Timestamp networkTimestamp;

  public Timestamp getNetworkTimestamp() {
    return networkTimestamp;
  }

  public void setNetworkTimestamp(Timestamp networkTimestamp) {
    this.networkTimestamp = networkTimestamp;
  }

  public Timestamp getSeriesTimestamp() {
    return seriesTimestamp;
  }

  public void setSeriesTimestamp(Timestamp seriesTimestamp) {
    this.seriesTimestamp = seriesTimestamp;
  }

  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
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

  public Timestamp getStudyTimestamp() {
    return studyTimestamp;
  }

  public void setStudyTimestamp(Timestamp studyTimestamp) {
    this.studyTimestamp = studyTimestamp;
  }
}
