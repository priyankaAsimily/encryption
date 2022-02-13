package com.asimily.models;
/**
 * Base JPA class with id, versionNumber and other common attributes
 */

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Transient;

import org.eclipse.persistence.annotations.AdditionalCriteria;
import org.eclipse.persistence.annotations.QueryRedirectors;

import com.asimily.common.AsimilySoftDeleteRedirector;
import com.asimily.listeners.JPABeanCallbacks;

@EntityListeners(JPABeanCallbacks.class)
@MappedSuperclass
@QueryRedirectors(
    delete=AsimilySoftDeleteRedirector.class
)
@AdditionalCriteria("this.softDelete = false OR this.softDelete is NULL")
public class EBase extends Object implements Serializable {

  private static final long serialVersionUID = 1L;

  public static final int CLASS_TYPE_NONE = 0;

  /**
   * Id for the object
   * <ul>
   * <li>This attribute is the <b>Primary Key</b> for this class<br>
   * .
   * </ul>
   *
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  protected Integer id;

  @Column(name = "soft_delete")
  private Boolean softDelete;

  @Column(name = "last_updated_time")
  private Timestamp lastUpdatedTime;

  @Column(name = "create_time")
  private Timestamp createTime;
  
  @Transient
  private Timestamp pktTime;

  @PrePersist
  protected void onCreate() {
    if (pktTime != null) {
      createTime = pktTime;
      lastUpdatedTime = pktTime;
    } else {
      createTime = new Timestamp(System.currentTimeMillis());
      lastUpdatedTime = createTime;
    }
    softDelete = false;
  }

  @PreUpdate
  protected void onUpdate() {
    if (pktTime != null) {
      lastUpdatedTime = pktTime;
    } else {
      lastUpdatedTime = new Timestamp(System.currentTimeMillis());
    }
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
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

  public int getMyClassType() {
    return this.CLASS_TYPE_NONE;
  }

  public Timestamp getCreateTime() { return createTime; }

  public void setCreateTime(Timestamp createTime) { this.createTime = createTime; }

  public Timestamp getPktTime() {
    return pktTime;
  }

  public void setPktTime(Timestamp pktTime) {
    this.pktTime = pktTime;
  }
  
  
}
