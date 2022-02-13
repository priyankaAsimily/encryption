package com.asimily.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "device_recall_count_view", schema = "portal")
public class EDeviceRecallCountView implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "device_info_id")
  protected Integer deviceInfoId;

  @Column(name = "no_of_fixed_recalls")
  private Integer noOfFixedRecalls;

  @Column(name = "no_of_open_recalls")
  private Integer noOfOpenRecalls;

  @Column(name = "no_of_total_recalls")
  private Integer noOfTotalRecalls;

  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
  }

  public Integer getNoOfFixedRecalls() {
    return noOfFixedRecalls;
  }

  public void setNoOfFixedRecalls(Integer noOfFixedRecalls) {
    this.noOfFixedRecalls = noOfFixedRecalls;
  }

  public Integer getNoOfOpenRecalls() {
    return noOfOpenRecalls;
  }

  public void setNoOfOpenRecalls(Integer noOfOpenRecalls) {
    this.noOfOpenRecalls = noOfOpenRecalls;
  }

  public Integer getNoOfTotalRecalls() {
    return noOfTotalRecalls;
  }

  public void setNoOfTotalRecalls(Integer noOfTotalRecalls) {
    this.noOfTotalRecalls = noOfTotalRecalls;
  }
  
}
