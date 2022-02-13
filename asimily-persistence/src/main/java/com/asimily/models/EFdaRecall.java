package com.asimily.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "fda_recall", schema = "raw_cloud")
public class EFdaRecall extends EBase {

  private static final long serialVersionUID = 1L;
  @Column(name = "url_id")
  private Integer urlId;

  @Column(name = "name")
  private String name;

  @Column(name = "date_initiated")
  private Date dateInitiated;

  @Column(name = "date_created")
  private Date dateCreated;

  @Column(name = "recall_status")
  private String recallStatus;

  @Column(name = "recall_number")
  private String recallNumber;

  @Column(name = "recall_event_id")
  private String recallEventNumber;

  @Column(name = "five10k_number")
  private String five10kNumber;

  @Column(name = "product_class")
  private String productClass;

  @Column(name = "product_code")
  private String productCode;

  @Column(name = "code_info")
  private String codeInfo;

  @Column(name = "manufacturer")
  private String manufacturer;

  @Column(name = "manufacturer_addr")
  private String manufacturerAddr;

  @Column(name = "contact_phone")
  private String contactPhone;

  @Column(name = "recall_reason")
  private String recallReason;

  @Column(name = "fda_cause")
  private String fdaCause;

  @Column(name = "action")
  private String action;

  @Column(name = "commerce_quantity")
  private String commerceQuantity;

  @Column(name = "distribution")
  private String distribution;

  @Column(name = "insert_src")
  private String insertSrc;

  public Integer getUrlId() {
    return urlId;
  }

  public void setUrlId(Integer urlId) {
    this.urlId = urlId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getDateInitiated() {
    return dateInitiated;
  }

  public void setDateInitiated(Date dateInitiated) {
    this.dateInitiated = dateInitiated;
  }

  public Date getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  public String getRecallStatus() {
    return recallStatus;
  }

  public void setRecallStatus(String recallStatus) {
    this.recallStatus = recallStatus;
  }

  public String getRecallNumber() {
    return recallNumber;
  }

  public void setRecallNumber(String recallNumber) {
    this.recallNumber = recallNumber;
  }

  public String getRecallEventNumber() {
    return recallEventNumber;
  }

  public void setRecallEventNumber(String recallEventNumber) {
    this.recallEventNumber = recallEventNumber;
  }

  public String getFive10kNumber() {
    return five10kNumber;
  }

  public void setFive10kNumber(String five10kNumber) {
    this.five10kNumber = five10kNumber;
  }

  public String getProductClass() {
    return productClass;
  }

  public void setProductClass(String productClass) {
    this.productClass = productClass;
  }

  public String getProductCode() {
    return productCode;
  }

  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }

  public String getCodeInfo() {
    return codeInfo;
  }

  public void setCodeInfo(String codeInfo) {
    this.codeInfo = codeInfo;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public String getManufacturerAddr() {
    return manufacturerAddr;
  }

  public void setManufacturerAddr(String manufacturerAddr) {
    this.manufacturerAddr = manufacturerAddr;
  }

  public String getContactPhone() {
    return contactPhone;
  }

  public void setContactPhone(String contactPhone) {
    this.contactPhone = contactPhone;
  }

  public String getRecallReason() {
    return recallReason;
  }

  public void setRecallReason(String recallReason) {
    this.recallReason = recallReason;
  }

  public String getFdaCause() {
    return fdaCause;
  }

  public void setFdaCause(String fdaCause) {
    this.fdaCause = fdaCause;
  }

  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public String getCommerceQuantity() {
    return commerceQuantity;
  }

  public void setCommerceQuantity(String commerceQuantity) {
    this.commerceQuantity = commerceQuantity;
  }

  public String getDistribution() {
    return distribution;
  }

  public void setDistribution(String distribution) {
    this.distribution = distribution;
  }

  public String getInsertSrc() {
    return insertSrc;
  }

  public void setInsertSrc(String insertSrc) {
    this.insertSrc = insertSrc;
  }

}
