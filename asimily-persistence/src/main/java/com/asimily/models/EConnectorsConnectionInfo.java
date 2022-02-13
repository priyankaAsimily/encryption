package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "connectors_connection_info", schema = "admin")
public class EConnectorsConnectionInfo extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "connector_id")
  private Integer connectorId;

  @Column(name = "connection_type_id")
  private Integer connectionTypeId;

  private String host1;

  private String host2;

  private String username;

  private String password;

  @Column(name = "certificate_password")
  private String certificatePassword;

  @Column(name = "certificate_filepath")
  private String certificateFilepath;

  @Column(name = "certificate_client_filename")
  private String certificateClientFilename;

  private Integer port;

  private Integer transport;

  @Column(name = "connector_status")
  private Boolean connectorStatus;

  private String configuration;

  public Integer getConnectorId() {
    return connectorId;
  }

  public void setConnectorId(Integer connectorId) {
    this.connectorId = connectorId;
  }

  public Integer getConnectionTypeId() {
    return connectionTypeId;
  }

  public void setConnectionTypeId(Integer connectionTypeId) {
    this.connectionTypeId = connectionTypeId;
  }

  public String getHost1() {
    return host1;
  }

  public void setHost1(String host1) {
    this.host1 = host1;
  }

  public String getHost2() {
    return host2;
  }

  public void setHost2(String host2) {
    this.host2 = host2;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getCertificatePassword() {
    return certificatePassword;
  }

  public void setCertificatePassword(String certificatePassword) {
    this.certificatePassword = certificatePassword;
  }

  public String getCertificateFilepath() {
    return certificateFilepath;
  }

  public void setCertificateFilepath(String certificateFilepath) {
    this.certificateFilepath = certificateFilepath;
  }

  public String getCertificateClientFilename() {
    return certificateClientFilename;
  }

  public void setCertificateClientFilename(String certificateClientFilename) {
    this.certificateClientFilename = certificateClientFilename;
  }

  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public Integer getTransport() {
    return transport;
  }

  public void setTransport(Integer transport) {
    this.transport = transport;
  }

  public Boolean getConnectorStatus() {
    return connectorStatus;
  }

  public void setConnectorStatus(Boolean connectorStatus) {
    this.connectorStatus = connectorStatus;
  }

  public String getConfiguration() {
    return configuration;
  }

  public void setConfiguration(String configuration) {
    this.configuration = configuration;
  }

}
