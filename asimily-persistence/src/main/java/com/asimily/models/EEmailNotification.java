package com.asimily.models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "email_notification", schema = "portal")
public class EEmailNotification extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "last_try_time")
  private Timestamp lastTryTime;

  @Column(name = "retry_count")
  private Integer retryCount;

  @Column(name = "next_retry_time")
  private Timestamp nextRetryTime;

  @Column(name = "job_status")
  private Integer jobStatus;

  @Column(name = "from_name")
  private String fromName;

  @Column(name = "from_addr")
  private String fromAddr;

  @Column(name = "to_id")
  private Integer toId;
  
  @Column(name = "cc_id")
  private Integer ccId;
  
  @Column(name = "subject")
  private String subject;

  @Column(name = "content")
  private String content;

  @Column(name = "email_type")
  private Integer emailType;

  @Column(name = "email_tmpl")
  private String emailTmpl;

  @Column(name = "file_path")
  private String filePath;

  @Column(name = "file_name")
  private String fileName;

  @Column(name = "file_mime_type")
  private String fileMimeType;

  @Column(name = "scheduled_date")
  private Timestamp scheduledDate;

  public Timestamp getLastTryTime() {
    return lastTryTime;
  }

  public void setLastTryTime(Timestamp lastTryTime) {
    this.lastTryTime = lastTryTime;
  }

  public Integer getRetryCount() {
    return retryCount;
  }

  public void setRetryCount(Integer retryCount) {
    this.retryCount = retryCount;
  }

  public Timestamp getNextRetryTime() {
    return nextRetryTime;
  }

  public void setNextRetryTime(Timestamp nextRetryTime) {
    this.nextRetryTime = nextRetryTime;
  }

  public Integer getJobStatus() {
    return jobStatus;
  }

  public void setJobStatus(Integer jobStatus) {
    this.jobStatus = jobStatus;
  }

  public String getFromName() {
    return fromName;
  }

  public void setFromName(String fromName) {
    this.fromName = fromName;
  }

  public String getFromAddr() {
    return fromAddr;
  }

  public void setFromAddr(String fromAddr) {
    this.fromAddr = fromAddr;
  }

  public Integer getToId() {
    return toId;
  }

  public void setToId(Integer toId) {
    this.toId = toId;
  }

  public Integer getCcId() {
    return ccId;
  }

  public void setCcId(Integer ccId) {
    this.ccId = ccId;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Integer getEmailType() {
    return emailType;
  }

  public void setEmailType(Integer emailType) {
    this.emailType = emailType;
  }

  public String getEmailTmpl() {
    return emailTmpl;
  }

  public void setEmailTmpl(String emailTmpl) {
    this.emailTmpl = emailTmpl;
  }

  public String getFilePath() {
    return filePath;
  }

  public void setFilePath(String filePath) {
    this.filePath = filePath;
  }

  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public String getFileMimeType() {
    return fileMimeType;
  }

  public void setFileMimeType(String fileMimeType) {
    this.fileMimeType = fileMimeType;
  }

  public Timestamp getScheduledDate() {
    return scheduledDate;
  }

  public void setScheduledDate(Timestamp scheduledDate) {
    this.scheduledDate = scheduledDate;
  }

}
