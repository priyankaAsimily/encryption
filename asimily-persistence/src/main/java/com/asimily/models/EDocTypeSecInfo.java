package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the document_type_info database table.
 * 
 */
@Entity
@Table(name = "document_type_section_info", schema = "raw_on_prem")
public class EDocTypeSecInfo extends EBase {
  private static final long serialVersionUID = 1L;
  
  @Column(name = "customer_id")
  private Integer customerId;

  @Column(name = "doc_type_id")
  private Integer docTypeId;

  @Column(name = "section_id")
  private Integer sectionId;

  @Column(name = "customer_input_id")
  private Integer customerInputId;

  @Column(name = "is_template")
  private Boolean isTemplate;

  public EDocTypeSecInfo() {
  }
  
  public Integer getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }

  public Integer getDocTypeId() {
    return this.docTypeId;
  }

  public void setDocTypeId(Integer docTypeId) {
    this.docTypeId = docTypeId;
  }

  public Integer getSectionId() {
    return sectionId;
  }

  public void setSectionId(Integer sectionId) {
    this.sectionId = sectionId;
  }

  public Integer getCustomerInputId() {
    return customerInputId;
  }

  public void setCustomerInputId(Integer customerInputId) {
    this.customerInputId = customerInputId;
  }

  public Boolean getIsTemplate() {
    return isTemplate;
  }

  public void setIsTemplate(Boolean isTemplate) {
    this.isTemplate = isTemplate;
  }

}