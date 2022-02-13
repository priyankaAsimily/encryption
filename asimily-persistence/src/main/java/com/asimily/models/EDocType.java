package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the document_type database table.
 * 
 */
@Entity
@Table(name = "document_type", schema = "raw_on_prem")
public class EDocType extends EBase {
  private static final long serialVersionUID = 1L;

  private String identifier;
  
  @Column(name = "customer_id")
  private Integer customerId;

  @Column(name = "parsing_order")
  private Integer parsingOrder;

  @Column(name = "category")
  private String category;

  @Column(name = "customer_input_id")
  private Integer customerInputId;

  @Column(name = "is_template")
  private Boolean isTemplate;

  public EDocType() {
  }
  
  public Integer getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }

  public String getIdentifier() {
    return this.identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public Integer getParsingOrder() {
    return this.parsingOrder;
  }

  public void setParsingOrder(Integer parsingOrder) {
    this.parsingOrder = parsingOrder;
  }

  public Boolean getIsTemplate() {
    return isTemplate;
  }

  public void setIsTemplate(Boolean isTemplate) {
    this.isTemplate = isTemplate;
  }

  public String getCategory() {
    return this.category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public Integer getCustomerInputId() {
    return customerInputId;
  }

  public void setCustomerInputId(Integer customerInputId) {
    this.customerInputId = customerInputId;
  }

}