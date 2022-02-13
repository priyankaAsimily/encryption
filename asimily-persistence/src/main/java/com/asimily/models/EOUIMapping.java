package com.asimily.models;

import javax.persistence.*;

/**
 * The persistent class for the oui_mapping database table.
 *
 */
@Entity
@Table(name = "oui_mapping", schema = "raw_cloud")
public class EOUIMapping extends EBase {
  private static final long serialVersionUID = 1L;

  private String oui;

  @Column(name = "org_id")
  private String orgId;

  @Column(name = "insert_src")
  private String insertSrc;

  public EOUIMapping() {
  }

  public String getOui() {
    return this.oui;
  }

  public void setOui(String oui) {
    this.oui = oui;
  }

  public String getOrgId() {
    return orgId;
  }

  public void setOrgId(String orgId) {
    this.orgId = orgId;
  }

  public String getInsertSrc() {
    return insertSrc;
  }

  public void setInsertSrc(String insertSrc) {
    this.insertSrc = insertSrc;
  }

}