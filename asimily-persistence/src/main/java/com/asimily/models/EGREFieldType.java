package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "gre_field_type", schema = "raw_on_prem")
public class EGREFieldType extends ETenantBase {
  private static final long serialVersionUID = 1L;


  @Column(name = "field_type")
  private String fieldType;

	public String getFieldType() {
		return this.fieldType;
	}

	public void setFieldType(String fieldType) {
		this.fieldType = fieldType;
	}






  
}
