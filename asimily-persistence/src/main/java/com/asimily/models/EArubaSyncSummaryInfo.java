package com.asimily.models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "aruba_sync_summary_info", schema = "raw_third_party")
public class EArubaSyncSummaryInfo extends ETenantBase {

	private static final long serialVersionUID = 1L;

	@Column(name = "sync_id")
	private int syncId;

	@Column(name = "endpoint_count")
	private int endpointCount;

	@Column(name = "start_time")
	private Timestamp startTime;

	@Column(name = "end_time")
	private Timestamp endTime;

	@Column(name = "status")
	private String status;

	@Column(name = "sync_start_time")
	private Timestamp syncStartTime;

	@Column(name = "sync_end_time")
	private Timestamp syncEndTime;

	public int getSyncId() {
		return syncId;
	}

	public void setSyncId(int syncId) {
		this.syncId = syncId;
	}

	public int getEndpointCount() {
		return endpointCount;
	}

	public void setEndpointCount(int endpointCount) {
		this.endpointCount = endpointCount;
	}

	public Timestamp getStartTime() {
		return startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	public Timestamp getEndTime() {
		return endTime;
	}

	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Timestamp getSyncStartTime() {
		return syncStartTime;
	}

	public void setSyncStartTime(Timestamp syncStartTime) {
		this.syncStartTime = syncStartTime;
	}

	public Timestamp getSyncEndTime() {
		return syncEndTime;
	}

	public void setSyncEndTime(Timestamp syncEndTime) {
		this.syncEndTime = syncEndTime;
	}	
}
