package com.asimily.models;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the application_info database table.
 * 
 */
@Entity
@Table(name = "protocol_service", schema = "raw_cloud")
// @Converter(name="uuidConverter",converterClass=UUIDConverter.class)
public class EProtocolService extends EBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "service_name")
  private String serviceName;

  @Column(name = "service_table_name")
  private String serviceTableName;

  // @Convert("uuidConverter")
  @Column(name = "uuid")
  private String globalId;

  @Column(name = "direct_alias")
  private Integer directAlias;

  @Column(name = "final_alias")
  private Integer finalAlias;

  @Column(name = "insert_src")
  private String insertSrc;

  public EProtocolService() {
  }

  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public String getServiceTableName() {
    return serviceTableName;
  }

  public void setServiceTableName(String serviceTableName) {
    this.serviceTableName = serviceTableName;
  }

  public Integer getDirectAlias() {
    return directAlias;
  }

  public void setDirectAlias(Integer directAlias) {
    this.directAlias = directAlias;
  }

  public Integer getFinalAlias() {
    return finalAlias;
  }

  public void setFinalAlias(Integer finalAlias) {
    this.finalAlias = finalAlias;
  }

  public String getInsertSrc() {
    return insertSrc;
  }

  public void setInsertSrc(String insertSrc) {
    this.insertSrc = insertSrc;
  }

  public String getGlobalId() {
    return globalId;
  }

  public void setGlobalId(String globalId) {
    this.globalId = globalId;
  }

  @Override
  public String toString() {
    return "EProtocolService{" + "serviceName='" + serviceName + '\'' + ", serviceTableName='" + serviceTableName + '\''
        + ", directAlias=" + directAlias + ", finalAlias=" + finalAlias + ", id=" + id + '}';
  }
}