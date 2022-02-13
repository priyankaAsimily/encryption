package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the user_notification_config database table.
 * 
 */
@Entity
@Table(name = "user_notification_config", schema = "admin")
public class EUserNotificationConfig extends ETenantBase {
	private static final long serialVersionUID = 1L;

	@Column(name = "param_id")
	private Integer paramId;

	@Column(name = "param_value")
	private Integer paramValue;

	@Column(name = "user_id")
	private Integer userId;

	@Column(name = "is_frequency_set")
	private Boolean isFrequencySet;

	public EUserNotificationConfig() {
	}

	public Integer getParamId() {
		return this.paramId;
	}

	public void setParamId(Integer paramId) {
		this.paramId = paramId;
	}

	public Integer getParamValue() {
		return this.paramValue;
	}

	public void setParamValue(Integer paramValue) {
		this.paramValue = paramValue;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Boolean getIsFrequencySet() {
		return isFrequencySet;
	}

	public void setIsFrequencySet(Boolean isFrequencySet) {
		this.isFrequencySet = isFrequencySet;
	}

}