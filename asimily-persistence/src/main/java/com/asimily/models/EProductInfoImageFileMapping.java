package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "product_info_image_file_mapping", schema = "raw_cloud")
public class EProductInfoImageFileMapping extends EBase {

  private static final long serialVersionUID = 1L;

  @Column(name = "product_info_id")
  private String productInfoId;

  @Column(name = "device_type_id")
  private String deviceTypeId;

  @Column(name = "image_file_name")
  private String imageFileName;

  @Column(name = "insert_src")
  private String insertSrc;

  public String getProductInfoId() {
    return productInfoId;
  }

  public void setProductInfoId(String productInfoId) {
    this.productInfoId = productInfoId;
  }

  public String getDeviceTypeId() {
    return deviceTypeId;
  }

  public void setDeviceTypeId(String deviceTypeId) {
    this.deviceTypeId = deviceTypeId;
  }

  public String getImageFileName() {
    return imageFileName;
  }

  public void setImageFileName(String imageFileName) {
    this.imageFileName = imageFileName;
  }

  public String getInsertSrc() {
    return insertSrc;
  }

  public void setInsertSrc(String insertSrc) {
    this.insertSrc = insertSrc;
  }

}
