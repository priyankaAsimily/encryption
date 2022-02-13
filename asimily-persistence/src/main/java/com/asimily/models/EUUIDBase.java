package com.asimily.models;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import com.asimily.common.AsimilySoftDeleteRedirector;
import com.asimily.listeners.JPABeanCallbacks;
import org.eclipse.persistence.annotations.AdditionalCriteria;
import org.eclipse.persistence.annotations.QueryRedirectors;

@EntityListeners(JPABeanCallbacks.class)
@MappedSuperclass
@QueryRedirectors(
  delete=AsimilySoftDeleteRedirector.class
)
@AdditionalCriteria("this.softDelete = false OR this.softDelete is NULL")
public abstract class EUUIDBase extends Object implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "uuid")
  protected String uuid;

  @Column(name = "soft_delete")
  private Boolean softDelete;

  @Column(name = "last_updated_time")
  private Timestamp lastUpdatedTime;

  @Column(name = "create_time")
  private Timestamp createTime;

  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public Boolean getSoftDelete() {
    return softDelete;
  }

  public void setSoftDelete(Boolean softDelete) {
    this.softDelete = softDelete;
  }

  public Timestamp getLastUpdatedTime() {
    return lastUpdatedTime;
  }

  public void setLastUpdatedTime(Timestamp lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
  }

  @PrePersist
  protected void onCreate() {
    createTime = new Timestamp(System.currentTimeMillis());
    lastUpdatedTime = createTime;
    softDelete = false;
  }

  @PreUpdate
  protected void onUpdate() {
      lastUpdatedTime = new Timestamp(System.currentTimeMillis());
  }
}
