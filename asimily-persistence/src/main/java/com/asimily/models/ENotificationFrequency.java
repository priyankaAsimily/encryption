package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "notification_frequency", schema = "admin")
public class ENotificationFrequency extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "user_notification_id")
  private Integer userNotificationId;

  @Column(name = "day")
  private String day;

  @Column(name = "week")
  private String week;

  @Column(name = "month")
  private String month;

  @Column(name = "year")
  private String year;

  public Integer getUserNotificationId() {
    return userNotificationId;
  }

  public void setUserNotificationId(Integer userNotificationId) {
    this.userNotificationId = userNotificationId;
  }

  public String getDay() {
    return day;
  }

  public void setDay(String day) {
    this.day = day;
  }

  public String getWeek() {
    return week;
  }

  public void setWeek(String week) {
    this.week = week;
  }

  public String getMonth() {
    return month;
  }

  public void setMonth(String month) {
    this.month = month;
  }

  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }

}
