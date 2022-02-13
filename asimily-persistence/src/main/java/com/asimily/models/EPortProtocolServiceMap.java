package com.asimily.models;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;

/**
 * The persistent class for the port_application_map database table.
 * 
 */
@Entity
@Table(name = "port_protocol_service_map", schema = "raw_cloud")
// @Converter(name="uuidConverter",converterClass=UUIDConverter.class)
public class EPortProtocolServiceMap extends EBase {
  private static final long serialVersionUID = 1L;

  private Integer port;

  @Column(name = "service_id")
  private Integer serviceId;

  @Column(name = "transport")
  private Integer transId;

  @Column(name = "description")
  private String description;

  @Column(name = "insert_src")
  private String insertSrc;

  // @Convert("uuidConverter")
  @Column(name = "uuid")
  private String globalId;

  public EPortProtocolServiceMap() {
  }

  public Integer getPort() {
    return this.port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public Integer getTransId() {
    return transId;
  }

  public void setTransId(Integer transId) {
    this.transId = transId;
  }

  public Integer getServiceId() {
    return serviceId;
  }

  public void setServiceId(Integer serviceId) {
    this.serviceId = serviceId;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
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