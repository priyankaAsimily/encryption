package com.asimily.models;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;

/**
 * The persistent class for the application_version database table.
 * 
 */
@Entity
@Table(name = "application_version", schema = "raw_cloud")
public class EApplicationVersion extends EUUIDBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "application_id")
  private String applicationId;

  @Column(name = "build_number")
  private String buildNumber;

  private Boolean discoverable;

  @Column(name = "version")
  private String version;

  @Column(name = "major_version")
  private String majorVersion;

  @Column(name = "minor_version")
  private String minorVersion;

  @Column(name = "revision_number")
  private String revisionNumber;

  @Column(name = "insert_src")
  private Integer insertSrc;
  
  @Column(name = "cve_version")
  private String cveVersion;

  public EApplicationVersion() {
  }

  public String getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }

  public String getBuildNumber() {
    return this.buildNumber;
  }

  public void setBuildNumber(String buildNumber) {
    this.buildNumber = buildNumber;
  }

  public Boolean getDiscoverable() {
    return this.discoverable;
  }

  public void setDiscoverable(Boolean discoverable) {
    this.discoverable = discoverable;
  }

  public String getMajorVersion() {
    return this.majorVersion;
  }

  public void setMajorVersion(String majorVersion) {
    this.majorVersion = majorVersion;
  }

  public String getMinorVersion() {
    return this.minorVersion;
  }

  public void setMinorVersion(String minorVersion) {
    this.minorVersion = minorVersion;
  }

  public String getRevisionNumber() {
    return this.revisionNumber;
  }

  public void setRevisionNumber(String revisionNumber) {
    this.revisionNumber = revisionNumber;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public Integer getInsertSrc() {
    return insertSrc;
  }

  public void setInsertSrc(Integer insertSrc) {
    this.insertSrc = insertSrc;
  }
  
  public String getCveVersion() {
    return cveVersion;
  }

  public void setCveVersion(String cveVersion) {
    this.cveVersion = cveVersion;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    String uniqueOn = this.getApplicationId() + this.getVersion();
    uuid = UUIDType5.nameUUIDFromNamespaceAndString(UUIDType5.NAMESPACE_URL, uniqueOn).toString();
  }

  @Override
  public String toString() {
    return "EApplicationVersion [applicationId=" + applicationId + ", buildNumber=" + buildNumber + ", discoverable="
        + discoverable + ", version=" + version + ", majorVersion=" + majorVersion + ", minorVersion=" + minorVersion
        + ", revisionNumber=" + revisionNumber + "]";
  }

}
