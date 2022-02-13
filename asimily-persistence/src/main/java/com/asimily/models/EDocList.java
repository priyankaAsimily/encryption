package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * The persistent class for the document_type database table.
 * 
 */
@Entity
@Table(name = "document_list", schema = "raw_on_prem")
public class EDocList extends EBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "customer_id")
  private Integer customerId;

  @Column(name = "document_name")
  private String documentName;

  @Column(name = "server_ip")
  private String serverIp;

  @Column(name = "server_path")
  private String serverPath;
  
  @Column(name = "doc_type_id")
  private Integer docTypeId;

  @Column(name = "processing_state")
  private Integer processingState;
  
  @Column(name = "processing_priority")
  private Integer processingPriority;

  @Column(name = "insert_src")
  private Integer insertSrc;

  @Transient
  private String documentAbsolutePath;

  public EDocList() {
  }

  public String getDocumentName() {
    return documentName;
  }

  public void setDocumentName(String documentName) {
    this.documentName = documentName;
  }

  public String getServerIp() {
    return serverIp;
  }

  public void setServerIp(String serverIp) {
    this.serverIp = serverIp;
  }

  public String getServerPath() {
    return serverPath;
  }

  public void setServerPath(String serverPath) {
    this.serverPath = serverPath;
  }

  public Integer getDocTypeId() {
    return docTypeId;
  }

  public void setDocTypeId(Integer docTypeId) {
    this.docTypeId = docTypeId;
  }

  public Integer getProcessingState() {
    return processingState;
  }

  public void setProcessingState(Integer processingState) {
    this.processingState = processingState;
  }

  public Integer getProcessingPriority() {
    return processingPriority;
  }

  public void setProcessingPriority(Integer processingPriority) {
    this.processingPriority = processingPriority;
  }

  public Integer getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }

  public String getDocumentAbsolutePath() {
    return documentAbsolutePath;
  }

  public void setDocumentAbsolutePath(String documentAbsolutePath) {
    this.documentAbsolutePath = documentAbsolutePath;
  }
  
  public Integer getInsertSrc(){
    return insertSrc;    
  }

  public void setInsertSrc(Integer insertSrc) {
    this.insertSrc = insertSrc;
  }

}
