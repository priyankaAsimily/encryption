package com.asimily.models;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "users_view", schema = "admin")
@Cacheable(false)
public class EUserView extends EBase {
	private static final long serialVersionUID = 1L;
	
	  @Column(name = "customer_id")
	  private Integer customerId;

	  @Column(name = "email")
	  private String email;

	  @Column(name = "first_name")
	  private String firstName;

	  @Column(name = "status")
	  private Integer status;

	  @Column(name = "last_name")
	  private String lastName;

	  private String password;

	  protected String username;

	  @Temporal(TemporalType.DATE)
	  @Column(name = "registration_date")
	  private Date registrationDate;

	  private Integer source;

	  @Column(name = "feature_disabled_ids")
	  private String featureDisabledIds;

	  @Column(name = "filter_map")
	  private String filterMap;

	  @Column(name = "evaluate_password_strength")
	  private Boolean evaluatePasswordStrength;
	  
	  @Column(name="source_ip")
	  private String sourceIP;
	  
	  @Column(name="start_time")
	  private Timestamp startTime;
	  
	  public EUserView() {
	  }

	  public String getEmail() {
	    return this.email;
	  }

	  public void setEmail(String email) {
	    this.email = email;
	  }

	  public String getFirstName() {
	    return this.firstName;
	  }

	  public void setFirstName(String firstName) {
	    this.firstName = firstName;
	  }

	  public Integer getStatus() {
	    return this.status;
	  }

	  public void setStatus(Integer status) {
	    this.status = status;
	  }

	  public String getLastName() {
	    return this.lastName;
	  }

	  public void setLastName(String lastName) {
	    this.lastName = lastName;
	  }

	  public String getPassword() {
	    return this.password;
	  }

	  public void setPassword(String password) {
	    this.password = password;
	  }

	  public Date getRegistrationDate() {
	    return this.registrationDate;
	  }

	  public void setRegistrationDate(Date registrationDate) {
	    this.registrationDate = registrationDate;
	  }

	  public String getUsername() {
	    return username;
	  }

	  public void setUsername(String username) {
	    this.username = username;
	  }

	  public Integer getCustomerId() {
	    return customerId;
	  }

	  public void setCustomerId(Integer customerId) {
	    this.customerId = customerId;
	  }

	  public Integer getSource() {
	    return source;
	  }

	  public void setSource(Integer source) {
	    this.source = source;
	  }

	  public String getFeatureDisabledIds() {
	    return featureDisabledIds;
	  }

	  public void setFeatureDisabledIds(String featureDisabledIds) {
	    this.featureDisabledIds = featureDisabledIds;
	  }

	  public String getFilterMap() {
	    return filterMap;
	  }

	  public void setFilterMap(String filterMap) {
	    this.filterMap = filterMap;
	  }

	  public Boolean getEvaluatePasswordStrength() {
		  return evaluatePasswordStrength;
	  }

	  public void setEvaluatePasswordStrength(Boolean evaluatePasswordStrength) {
		  this.evaluatePasswordStrength = evaluatePasswordStrength;
	  }
	  
	  public String getSourceIP() {
		  return sourceIP;
	  }
	  
	  public void setSourceIP(String sourceIP) {
		  this.sourceIP = sourceIP;
	  }
	  
	  public Timestamp getStartTime() {
		  return startTime;
	  }
	  
	  public void setStartTime(Timestamp startTime) {
		  this.startTime = startTime;
	  }
}
