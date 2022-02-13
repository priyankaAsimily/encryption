package com.asimily.models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "session_audit", schema = "admin")
public class EUserSessionAudit extends EBase
{
	private static final long serialVersionUID = 1L;
	
	@Column(name = "session_id")
	private String sessionId;

	@Column(name = "customer_id")
	private Integer customerId;
	
	@Column(name = "user_id")
	private Integer userId;
	
	@Column(name = "username")
	private String username;

	@Column(name = "source_ip")
	private String sourceIp;
	
	@Column(name = "start_time")
	private Timestamp startTime;
	
	@Column(name = "end_time")
	private Timestamp endTime;
	
	@Column(name = "login_attempts")
	private Integer loginAttempts;
	
	@Column(name = "auth_result")
	private boolean authResult;

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getSourceIp() {
		return sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
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

	public Integer getLoginAttempts() {
		return loginAttempts;
	}

	public void setLoginAttempts(Integer loginAttempts) {
		this.loginAttempts = loginAttempts;
	}

	public boolean isAuthResult() {
		return authResult;
	}

	public void setAuthResult(boolean authResult) {
		this.authResult = authResult;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EUserSessionAudit [sessionId=");
		builder.append(sessionId);
		builder.append(", customerId=");
		builder.append(customerId);
		builder.append(", userId=");
		builder.append(userId);
		builder.append(", username=");
		builder.append(username);
		builder.append(", sourceIp=");
		builder.append(sourceIp);
		builder.append(", startTime=");
		builder.append(startTime);
		builder.append(", endTime=");
		builder.append(endTime);
		builder.append(", loginAttempts=");
		builder.append(loginAttempts);
		builder.append(", authResult=");
		builder.append(authResult);
		builder.append("]");
		return builder.toString();
	}
}
