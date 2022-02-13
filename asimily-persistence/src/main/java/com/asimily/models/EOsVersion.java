package com.asimily.models;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;

/**
 * The persistent class for the os_info database table.
 * 
 */
@Entity
@Table(name = "os_version", schema = "raw_cloud")
public class EOsVersion extends EUUIDBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "os_id")
  private String osId;

  private String version;

  @Column(name = "cve_version")
  private String cveVersion;

  @Column(name = "cve_update")
  private String cveUpdate;

  @Column(name = "cve_edition")
  private String cveEdition;

  @Column(name = "major_version")
  private String majorVersion;

  @Column(name = "minor_version")
  private String minorVersion;

  @Column(name = "build_number")
  private String buildNumber;

  @Column(name = "revision_number")
  private String revisionNumber;

  @Column(name = "insert_src")
  private String insertSrc;

  public EOsVersion() {
  }

  public String getOsId() {
    return osId;
  }

  public void setOsId(String osId) {
    this.osId = osId;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public String getCveVersion() {
    return cveVersion;
  }

  public void setCveVersion(String cveVersion) {
    this.cveVersion = cveVersion;
  }

  public String getCveUpdate() {
    return cveUpdate;
  }

  public void setCveUpdate(String cveUpdate) {
    this.cveUpdate = cveUpdate;
  }

  public String getCveEdition() {
    return cveEdition;
  }

  public void setCveEdition(String cveEdition) {
    this.cveEdition = cveEdition;
  }

  public String getMajorVersion() {
    return majorVersion;
  }

  public void setMajorVersion(String majorVersion) {
    this.majorVersion = majorVersion;
  }

  public String getMinorVersion() {
    return minorVersion;
  }

  public void setMinorVersion(String minorVersion) {
    this.minorVersion = minorVersion;
  }

  public String getBuildNumber() {
    return buildNumber;
  }

  public void setBuildNumber(String buildNumber) {
    this.buildNumber = buildNumber;
  }

  public String getRevisionNumber() {
    return revisionNumber;
  }

  public void setRevisionNumber(String revisionNumber) {
    this.revisionNumber = revisionNumber;
  }

  public String getInsertSrc() {
    return insertSrc;
  }

  public void setInsertSrc(String insertSrc) {
    this.insertSrc = insertSrc;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    String uniqueOn = this.getOsId() + this.getVersion();
    uuid = UUIDType5.nameUUIDFromNamespaceAndString(UUIDType5.NAMESPACE_URL, uniqueOn).toString();
  }

}