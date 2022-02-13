package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the document_section_info database table.
 * 
 */
//@Multitenant
//@TenantDiscriminatorColumn(name = "customer_id", contextProperty = "user-cid")
@Entity
@Table(name = "document_section_list", schema = "raw_on_prem")
public class EDocSecInfo extends EBase {

  private static final long serialVersionUID = 1L;

  private String description;

  private String name;
  
  @Column(name = "customer_id")
  private Integer customerId;

  @Column(name = "section_num")
  private String sectionNum;

  @Column(name = "customer_input_id")
  private Integer custInputId;

  @Column(name = "parent_id")
  private Integer parentId;

  @Column(name = "is_template")
  private Boolean isTemplate;

  @Column(name = "is_editable")
  private Boolean isEditable;

  @Column(name = "notes_end_marker")
  private String notesEndMarker;

  public EDocSecInfo() {
  }
  
  public Integer getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSectionNum() {
    return this.sectionNum;
  }

  public void setSectionNum(String sectionNum) {
    this.sectionNum = sectionNum;
  }

  public Integer getCustInputId() {
    return custInputId;
  }

  public void setCustInputId(Integer custInputId) {
    this.custInputId = custInputId;
  }

  public Integer getParentId() {
    return parentId;
  }

  public void setParentId(Integer parentId) {
    this.parentId = parentId;
  }

  public Boolean getIsTemplate() {
    return isTemplate;
  }

  public void setIsTemplate(Boolean isTemplate) {
    this.isTemplate = isTemplate;
  }

  public Boolean getIsEditable() {
    return isEditable;
  }

  public void setIsEditable(Boolean isEditable) {
    this.isEditable = isEditable;
  }

  public String getNotesEndMarker() {
    return notesEndMarker;
  }

  public void setNotesEndMarker(String notesEndMarker) {
    this.notesEndMarker = notesEndMarker;
  }

}