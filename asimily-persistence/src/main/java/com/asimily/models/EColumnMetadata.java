package com.asimily.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "column_metadata", schema = "raw_cloud")
public class EColumnMetadata extends EBase {

  @Column(name = "schema_name")
  private String schemaName;

  @Column(name = "table_name")
  private String tableName;

  @Column(name = "column_name")
  private String columnName;

  @Column(name = "insert_src")
  private String insertSrc;

  public String getSchemaName() {
    return schemaName;
  }

  public void setSchemaName(String schemaName) {
    this.schemaName = schemaName;
  }

  public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  public String getColumnName() {
    return columnName;
  }

  public void setColumnName(String columnName) {
    this.columnName = columnName;
  }

  public String getInsertSrc() {
    return insertSrc;
  }

  public void setInsertSrc(String insertSrc) {
    this.insertSrc = insertSrc;
  }

}
