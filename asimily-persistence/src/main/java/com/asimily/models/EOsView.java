package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * The persistent class for the os_view database view.
 *
 */
@Entity
@Table(name = "os_view", schema = "raw_cloud")
public class EOsView extends Object implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "uuid")
  protected String uuid;

  @Column(name = "name")
  private String name;

  @Column(name = "mfg")
  private String mfg;

  @Column(name = "version")
  private String version;

  @Column(name = "cve_version")
  private String cveVersion;

  @Column(name = "category")
  private String category;

  public EOsView() {
  }

  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getMfg() {
    return mfg;
  }

  public void setMfg(String mfg) {
    this.mfg = mfg;
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

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }
}

