package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "aims_work_order", schema = "raw_third_party")
public class EAIMSWorkOrder extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "device_info_id")
  private Integer deviceInfoId;

  @Column(name = "alert_id")
  private String alertId;

  @Column(name = "alert_type")
  private Integer alertType;

  @Column(name = "work_order_id")
  private Integer workOrderId;

  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
  }

  public String getAlertId() {
    return alertId;
  }

  public void setAlertId(String alertId) {
    this.alertId = alertId;
  }

  public Integer getAlertType() {
    return alertType;
  }

  public void setAlertType(Integer alertType) {
    this.alertType = alertType;
  }

  public Integer getWorkOrderId() {
    return workOrderId;
  }

  public void setWorkOrderId(Integer workOrderId) {
    this.workOrderId = workOrderId;
  }

}
