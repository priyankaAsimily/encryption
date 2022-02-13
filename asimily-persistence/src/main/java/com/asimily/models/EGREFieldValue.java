package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "gre_field_value", schema = "raw_on_prem")
public class EGREFieldValue extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "gre_id")
  private Integer greId;

  @Column(name = "gre_field_type_id")
  private Integer greFieldTypeId;

  @Column(name = "field_value")
  private String fieldvalue;

	public Integer getGreId() {
		return this.greId;
	}

	public void setGreId(Integer greId) {
		this.greId = greId;
	}



	public String getFieldvalue() {
		return this.fieldvalue;
	}

	public void setFieldvalue(String fieldvalue) {
		this.fieldvalue = fieldvalue;
	}



  

}
