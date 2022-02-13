package com.asimily.models;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;

/**
 * The persistent class for the organization_type database table.
 */
@Entity
@Table(name = "organization_type", schema = "raw_cloud")
// @Converter(name="uuidConverter",converterClass=UUIDConverter.class)
public class EOrganizationType extends EBase {
  private static final long serialVersionUID = 1L;

  private String name;

  // @Convert("uuidConverter")
  @Column(name = "uuid")
  private String globalId;

  @Column(name = "insert_src")
  private String insertSrc;

  public EOrganizationType() {
  }

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getGlobalId() {
    return globalId;
  }

  public void setGlobalId(String globalId) {
    this.globalId = globalId;
  }

  public String getInsertSrc() {
    return insertSrc;
  }

  public void setInsertSrc(String insertSrc) {
    this.insertSrc = insertSrc;
  }

}