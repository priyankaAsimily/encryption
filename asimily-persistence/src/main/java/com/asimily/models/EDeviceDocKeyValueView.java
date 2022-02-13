package com.asimily.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "device_doc_key_value_view", schema = "portal")
public class EDeviceDocKeyValueView extends EBase implements Serializable {
  private static final long serialVersionUID = 1L;

  @Column(name = "device_info_id")
  protected Integer deviceInfoId;

  @Column(name = "key_id")
  private String keyId;

  @Column(name = "key_text")
  private String keyText;

  @Column(name = "key_value")
  private String keyValue;
  
  @Column(name = "key_notes")
  private String keyNotes;
  
  @Column(name = "key_score")
  private Integer keyScore;

  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
  }

  public String getKeyId() {
    return keyId;
  }

  public void setKeyId(String keyId) {
    this.keyId = keyId;
  }

  public String getKeyText() {
    return keyText;
  }

  public void setKeyText(String keyText) {
    this.keyText = keyText;
  }

  public String getKeyValue() {
    return keyValue;
  }

  public void setKeyValue(String keyValue) {
    this.keyValue = keyValue;
  }

  public String getKeyNotes() {
    return keyNotes;
  }

  public void setKeyNotes(String keyNotes) {
    this.keyNotes = keyNotes;
  }

  public Integer getKeyScore() {
    return keyScore;
  }

  public void setKeyScore(Integer keyScore) {
    this.keyScore = keyScore;
  }

}
