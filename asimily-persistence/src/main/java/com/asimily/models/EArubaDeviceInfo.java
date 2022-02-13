package com.asimily.models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "aruba_device_info", schema = "raw_third_party")
public class EArubaDeviceInfo extends EMacIpAssociationExternalDeviceInfoBase {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "is_online")
	private Boolean isOnline;
	
	@Column(name = "device_name")
	private String deviceName;
	
	@Column(name = "device_category")
	private String deviceCategory;
	
	@Column(name = "device_family")
	private String deviceFamily;
	
	@Column(name = "other_name")
	private String otherName;
	
	@Column(name = "other_category")
	private String otherCategory;
	
	@Column(name = "user_name")
	private String userName;
	
	@Column(name = "updated_at")
	private String updatedAt;
	
	@Column(name = "system_posture_token")
	private String systemPostureToken;

	@Column(name = "status")
	private String status;

	@Column(name = "attributes")
	private String attributes;

	@Column(name = "is_conflict")
	private Boolean isConflict;

	@Column(name = "description")
	private String description;

	
	public Boolean getIsOnline() {
		return isOnline;
	}

	public void setIsOnline(Boolean isOnline) {
		this.isOnline = isOnline;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getDeviceCategory() {
		return deviceCategory;
	}

	public void setDeviceCategory(String deviceCategory) {
		this.deviceCategory = deviceCategory;
	}

	public String getDeviceFamily() {
		return deviceFamily;
	}

	public void setDeviceFamily(String deviceFamily) {
		this.deviceFamily = deviceFamily;
	}

	public String getOtherName() {
		return otherName;
	}

	public void setOtherName(String otherName) {
		this.otherName = otherName;
	}

	public String getOtherCategory() {
		return otherCategory;
	}

	public void setOtherCategory(String otherCategory) {
		this.otherCategory = otherCategory;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getSystemPostureToken() {
		return systemPostureToken;
	}

	public void setSystemPostureToken(String systemPostureToken) {
		this.systemPostureToken = systemPostureToken;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAttributes() {
		return attributes;
	}

	public void setAttributes(String attributes) {
		this.attributes = attributes;
	}

	public Boolean getIsConflict() {
		return isConflict;
	}

	public void setIsConflict(Boolean isConflict) {
		this.isConflict = isConflict;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}

