package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "mds2_document_details_view", schema = "portal")
public class EMDS2DocumentDetailsView extends EBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "document_name")
  private String documentName;

  @Column(name = "doc_manufacturer")
  private String docManufacturer;

  @Column(name = "doc_device_model")
  private String docDeviceModel;

  @Column(name = "doc_software_version")
  private String docSoftwareVersion;

  @Column(name = "device_model_to_redirect")
  private String deviceModelToRedirect;

  @Column(name = "device_count")
  private Integer deviceCount;

  public String getDocumentName() {
    return documentName;
  }

  public void setDocumentName(String documentName) {
    this.documentName = documentName;
  }

  public String getDocManufacturer() {
    return docManufacturer;
  }

  public void setDocManufacturer(String docManufacturer) {
    this.docManufacturer = docManufacturer;
  }

  public String getDocDeviceModel() {
    return docDeviceModel;
  }

  public void setDocDeviceModel(String docDeviceModel) {
    this.docDeviceModel = docDeviceModel;
  }

  public String getDocSoftwareVersion() {
    return docSoftwareVersion;
  }

  public void setDocSoftwareVersion(String docSoftwareVersion) {
    this.docSoftwareVersion = docSoftwareVersion;
  }

  public String getDeviceModelToRedirect() {
    return deviceModelToRedirect;
  }

  public void setDeviceModelToRedirect(String deviceModelToRedirect) {
    this.deviceModelToRedirect = deviceModelToRedirect;
  }

  public Integer getDeviceCount() {
    return deviceCount;
  }

  public void setDeviceCount(Integer deviceCount) {
    this.deviceCount = deviceCount;
  }

}
