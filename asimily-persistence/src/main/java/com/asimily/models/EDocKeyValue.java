package com.asimily.models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the document_key_values database table.
 * 
 */
@Entity
@Table(name = "document_key_values", schema = "raw_on_prem")
public class EDocKeyValue extends EBase {
  private static final long serialVersionUID = 1L;
  
  @Column(name = "customer_id")
  private Integer customerId;
  
  @Column(name = "key_notes")
  private String keyNotes;

  @Column(name = "key_value")
  private String keyValue;
  
  @Column(name = "key_score")
  private Integer keyScore;

  @Column(name = "last_update_user_id")
  private Integer lastUpdateUserId;
  
  @Column(name = "key_info_id")
  private Integer keysInfoId;

  @Column(name = "document_id")
  private Integer documentId;

  @Column(name = "is_template")
  private Boolean isTemplate;
  
  @Column(name = "key_device_software")
  private String keyDeviceSoftware;

  @Column(name = "key_device_firmware")
  private String  keyDeviceFirmware;

  @Column(name = "key_security_addons")
  private String  keySecurityAddOns;

  public EDocKeyValue() {
  }

  public String getKeyNotes() {
    return this.keyNotes;
  }

  public void setKeyNotes(String keyNotes) {
    this.keyNotes = keyNotes;
  }

  public String getKeyValue() {
    return this.keyValue;
  }

  public void setKeyValue(String keyValue) {
    this.keyValue = keyValue;
  }

  public Integer getLastUpdateUserId() {
    return this.lastUpdateUserId;
  }

  public void setLastUpdateUserId(Integer lastUpdateUserId) {
    this.lastUpdateUserId = lastUpdateUserId;
  }

  public Integer getKeysInfoId() {
    return keysInfoId;
  }

  public void setKeysInfoId(Integer keysInfoId) {
    this.keysInfoId = keysInfoId;
  }

  public Integer getDocumentId() {
    return documentId;
  }

  public void setDocumentId(Integer documentId) {
    this.documentId = documentId;
  }

  public Boolean getIsTemplate() {
    return isTemplate;
  }

  public void setIsTemplate(Boolean isTemplate) {
    this.isTemplate = isTemplate;
  }


  public Integer getKeyScore() {
	  return keyScore;
  }

  public void setKeyScore(Integer keyScore) {
	  this.keyScore = keyScore;
  }

  public Integer getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }

  public String getKeyDeviceSoftware() {
	return keyDeviceSoftware;
  }

  public void setKeyDeviceSoftware(String keyDeviceSoftware) {
	this.keyDeviceSoftware = keyDeviceSoftware;
  }

  public String getKeyDeviceFirmware() {
	return keyDeviceFirmware;
  }

  public void setKeyDeviceFirmware(String keyDeviceFirmware) {
	this.keyDeviceFirmware = keyDeviceFirmware;
  }

  public String getKeySecurityAddOns() {
	return keySecurityAddOns;
  }

  public void setKeySecurityAddOns(String keySecurityAddOns) {
	this.keySecurityAddOns = keySecurityAddOns;
  }

}
