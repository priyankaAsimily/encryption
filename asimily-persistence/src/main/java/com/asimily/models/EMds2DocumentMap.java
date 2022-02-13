package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "mds2_document_map", schema = "customer_config")
public class EMds2DocumentMap extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "device_model")
  private String deviceModel;

  @Column(name = "document_id")
  private Integer documentId;

  public String getDeviceModel() {
    return deviceModel;
  }

  public void setDeviceModel(String deviceModel) {
    this.deviceModel = deviceModel;
  }

  public Integer getDocumentId() {
    return documentId;
  }

  public void setDocumentId(Integer documentId) {
    this.documentId = documentId;
  }

}
