package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "dns", schema = "raw_on_prem")
public class EDns extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "query_name")
  private String queryName;

  public String getQueryName() {
    return queryName;
  }

  public void setQueryName(String queryName) {
    this.queryName = queryName;
  }
}
