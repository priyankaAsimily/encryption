package com.asimily.models;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;

/**
 * The persistent class for the device_classification database table.
 * 
 */
@Entity
@Table(name = "device_classification", schema = "raw_cloud")
// @Converter(name="uuidConverter",converterClass=UUIDConverter.class)
public class EDeviceClassification extends EBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "device_type")
  private String deviceType;

  @Column(name = "display_icon")
  private Integer displayIcon;

  private String description;

  @Column(name = "fda_device_class")
  private Integer fdaDeviceClass;

  @Column(name = "lifetime_cost")
  private String lifetimeCost;

  @Column(name = "insert_src")
  private Integer insertSrc;

  // @Convert("uuidConverter")
  @Column(name = "uuid")
  private String globalId;

  @Column(name = "handle_ephi")
  private Boolean handleEphi;

  public EDeviceClassification() {
  }

  public String getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }

  public Integer getDisplayIcon() {
    return displayIcon;
  }

  public void setDisplayIcon(Integer displayIcon) {
    this.displayIcon = displayIcon;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Integer getFdaDeviceClass() {
    return fdaDeviceClass;
  }

  public void setFdaDeviceClass(Integer fdaDeviceClass) {
    this.fdaDeviceClass = fdaDeviceClass;
  }

  public String getLifetimeCost() {
    return lifetimeCost;
  }

  public void setLifetimeCost(String lifetimeCost) {
    this.lifetimeCost = lifetimeCost;
  }

  public String getGlobalId() {
    return globalId;
  }

  public void setGlobalId(String globalId) {
    this.globalId = globalId;
  }

  public Integer getInsertSrc() {
    return insertSrc;
  }

  public void setInsertSrc(Integer insertSrc) {
    this.insertSrc = insertSrc;
  }

  public Boolean getHandleEphi() {
    return handleEphi;
  }

  public void setHandleEphi(Boolean handleEphi) {
    this.handleEphi = handleEphi;
  }

//  @Override
//  public void onCreate() {
//    super.onCreate();
//    String uniqueOn = this.getDeviceType();
//    globalId = UUIDType5.nameUUIDFromNamespaceAndString(UUIDType5.NAMESPACE_URL, uniqueOn).toString();
//  }

}
