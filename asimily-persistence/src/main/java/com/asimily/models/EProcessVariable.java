package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "process_variable", schema = "raw_on_prem")
public class EProcessVariable extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "process_name")
  private String processName;

  @Column(name = "variable_name")
  private String variableName;

  @Column(name = "value")
  private String value;

  @Column(name = "description")
  private String description;


  public String getProcessName() {
    return processName;
  }

  public void setProcessName(String processName) {
    this.processName = processName;
  }

  public String getVariableName() {
    return variableName;
  }

  public void setVariableName(String variableName) {
    this.variableName = variableName;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EProcessVariable that = (EProcessVariable) o;
    return Objects.equals(processName, that.processName) &&
        Objects.equals(variableName, that.variableName) &&
        Objects.equals(value, that.value) &&
        Objects.equals(description, that.description);
  }

  @Override
  public int hashCode() {

    return Objects.hash(processName, variableName, value, description);
  }
}
