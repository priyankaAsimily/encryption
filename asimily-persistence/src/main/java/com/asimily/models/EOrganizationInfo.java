package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the organization_info database table.
 * 
 */
@Entity
@Table(name = "organization_info", schema = "raw_cloud")
// @Converter(name="uuidConverter",converterClass=UUIDConverter.class)
public class EOrganizationInfo extends EUUIDBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "direct_alias")
  private String directAlias;

  @Column(name = "final_alias")
  private String finalAlias;

  private String name;

  @Column(name = "org_type")
  private Integer orgType;

  @Column(name = "insert_src")
  private Integer insertSrc;

  public EOrganizationInfo() {
  }

  public String getDirectAlias() {
    return this.directAlias;
  }

  public void setDirectAlias(String directAlias) {
    this.directAlias = directAlias;
  }

  public String getFinalAlias() {
    return this.finalAlias;
  }

  public void setFinalAlias(String finalAlias) {
    this.finalAlias = finalAlias;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getOrgType() {
    return orgType;
  }

  public void setOrgType(Integer orgType) {
    this.orgType = orgType;
  }

  public Integer getInsertSrc() {
    return insertSrc;
  }

  public void setInsertSrc(Integer insertSrc) {
    this.insertSrc = insertSrc;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    String uniqueOn = this.getName();
    uuid = UUIDType5.nameUUIDFromNamespaceAndString(UUIDType5.NAMESPACE_URL, uniqueOn).toString();
  }
}