package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "connectors", schema = "admin")
public class EConnectors extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "connector_category")
  private String connectorCategory;

  @Column(name = "connector_name")
  private String connectorName;

  private String configuration;

  public String getConnectorCategory() {
    return connectorCategory;
  }

  public void setConnectorCategory(String connectorCategory) {
    this.connectorCategory = connectorCategory;
  }

  public String getConnectorName() {
    return connectorName;
  }

  public void setConnectorName(String connectorName) {
    this.connectorName = connectorName;
  }

  public String getConfiguration() {
    return configuration;
  }

  public void setConfiguration(String configuration) {
    this.configuration = configuration;
  }

}
