package com.asimily.models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "high_likelihood_device_cnt", schema = "portal")
public class EHighLikelihoodDeviceCnt extends ETenantBase {
	private static final long serialVersionUID = 1L;

	@Column(name = "device_cnt")
	private Integer deviceCount;

	@Column(name = "execution_time")
	private Timestamp executionTime;

	public Integer getDeviceCount() {
		return deviceCount;
	}

	public void setDeviceCount(Integer deviceCount) {
		this.deviceCount = deviceCount;
	}

	public Timestamp getExecutionTime() {
		return executionTime;
	}

	public void setExecutionTime(Timestamp executionTime) {
		this.executionTime = executionTime;
	}

}
