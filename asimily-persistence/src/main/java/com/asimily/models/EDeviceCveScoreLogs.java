package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "device_cve_score_logs", schema = "portal")
public class EDeviceCveScoreLogs extends ETenantBase {

  @Column(name = "device_info_id")
  private Integer deviceInfoId;
  
  @Column(name = "cve_product_id")
  private Integer cveProductId;
  
  @Column(name = "log_txt")
  private String logText;
  
  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }
  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
  }
  public Integer getCveProductId() {
    return cveProductId;
  }
  public void setCveProductId(Integer cveProductId) {
    this.cveProductId = cveProductId;
  }
  public String getLogText() {
    return logText;
  }
  public void setLogText(String logText) {
    this.logText = logText;
  }

}
