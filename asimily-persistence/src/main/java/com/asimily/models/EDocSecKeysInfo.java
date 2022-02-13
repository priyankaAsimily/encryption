package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the document_section_keys_info database table.
 * 
 */
@Entity
@Table(name = "document_section_key_info", schema = "raw_on_prem")
public class EDocSecKeysInfo extends EBase {
  private static final long serialVersionUID = 1L;
  
  @Column(name = "customer_id")
  private Integer customerId;

  @Column(name = "has_value")
  private Boolean hasValue;

  @Column(name = "is_template")
  private Boolean isTemplate;

  @Column(name = "key_id")
  private String keyId;

  @Column(name = "key_text")
  private String keyText;

  @Column(name = "customer_input_id")
  private Integer custInputId;

  @Column(name = "type_section_id")
  private Integer sectionId;

  @Column(name = "parent_id")
  private Integer parent;
  
  @Column(name = "expected_key_value")
  private String expectedKeyValue;
  
  @Column(name = "key_score_good")
  private Integer keyScoreGood;
  
  @Column(name = "key_score_bad")
  private Integer keyScoreBad;

  @Column(name = "is_editable")
  private Boolean isEditable;
  
  public EDocSecKeysInfo() {
  }
  
  public Integer getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }

  public Boolean getHasValue() {
    return this.hasValue;
  }

  public void setHasValue(Boolean hasValue) {
    this.hasValue = hasValue;
  }

  public String getKeyId() {
    return this.keyId;
  }

  public void setKeyId(String keyId) {
    this.keyId = keyId;
  }

  public String getKeyText() {
    return this.keyText;
  }

  public void setKeyText(String keyText) {
    this.keyText = keyText;
  }

  public Integer getCustInputId() {
    return custInputId;
  }

  public void setCustInputId(Integer custInputId) {
    this.custInputId = custInputId;
  }

  public Integer getSectionId() {
    return sectionId;
  }

  public void setSectionId(Integer sectionId) {
    this.sectionId = sectionId;
  }

  public Integer getParent() {
    return parent;
  }

  public void setParent(Integer parent) {
    this.parent = parent;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Boolean getIsTemplate() {
    return isTemplate;
  }

  public void setIsTemplate(Boolean isTemplate) {
    this.isTemplate = isTemplate;
  }

  public String getExpectedKeyValue() {
    return expectedKeyValue;
  }

  public void setExpectedKeyValue(String expectedKeyValue) {
    this.expectedKeyValue = expectedKeyValue;
  }

  public Integer getKeyScoreGood() {
    return keyScoreGood;
  }

  public void setKeyScoreGood(Integer keyScoreGood) {
    this.keyScoreGood = keyScoreGood;
  }

  public Integer getKeyScoreBad() {
    return keyScoreBad;
  }

  public void setKeyScoreBad(Integer keyScoreBad) {
    this.keyScoreBad = keyScoreBad;
  }

  public Boolean getIsEditable() {
    return isEditable;
  }

  public void setIsEditable(Boolean isEditable) {
    this.isEditable = isEditable;
  }
  
  
}