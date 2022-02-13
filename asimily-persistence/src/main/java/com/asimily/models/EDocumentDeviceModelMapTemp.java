package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "document_device_model_map_temp", schema = "raw_on_prem")
public class EDocumentDeviceModelMapTemp extends EBase {

  private static final long serialVersionUID = 1L;

  @Column(name = "procurement_id")
  private String procurementId;

  @Column(name = "document_id")
  private Integer documentId;

  @Column(name = "device_model")
  private String deviceModel;

  @Column(name = "filename")
  private String filename;

  @Column(name = "status")
  private Integer status;

  public String getProcurementId() {
    return procurementId;
  }

  public void setProcurementId(String procurementId) {
    this.procurementId = procurementId;
  }

  public Integer getDocumentId() {
    return documentId;
  }

  public void setDocumentId(Integer documentId) {
    this.documentId = documentId;
  }

  public String getDeviceModel() {
    return deviceModel;
  }

  public void setDeviceModel(String deviceModel) {
    this.deviceModel = deviceModel;
  }

  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }
}
