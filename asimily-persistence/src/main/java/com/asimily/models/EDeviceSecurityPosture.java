
package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "device_security_posture", schema = "portal")
public class EDeviceSecurityPosture extends ETenantBase {

  private static final long serialVersionUID = 1L;

  @Column(name = "device_info_id")
  private Integer deviceInfoId;

  @Column(name = "sec_key_id")
  private Integer secKeyId;

  @Column(name = "key_notes")
  private String keyNotes;

  @Column(name = "key_value")
  private String keyValue;

  @Column(name = "key_score")
  private Integer keyScore;


  public EDeviceSecurityPosture() {
  }

  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
  }

  public Integer getSecKeyId() {
    return secKeyId;
  }

  public void setSecKeyId(Integer secKeyId) {
    this.secKeyId = secKeyId;
  }

  public String getKeyNotes() {
    return keyNotes;
  }

  public void setKeyNotes(String keyNotes) {
    this.keyNotes = keyNotes;
  }

  public String getKeyValue() {
    return keyValue;
  }

  public void setKeyValue(String keyValue) {
    this.keyValue = keyValue;
  }

  public Integer getKeyScore() {
    return keyScore;
  }

  public void setKeyScore(Integer keyScore) {
    this.keyScore = keyScore;
  }
}
