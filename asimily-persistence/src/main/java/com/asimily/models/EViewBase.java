package com.asimily.models;
/**
 * Base JPA class with id, versionNumber and other common attributes
 */

import com.asimily.common.AsimilySoftDeleteRedirector;
import com.asimily.listeners.JPABeanCallbacks;
import org.eclipse.persistence.annotations.AdditionalCriteria;
import org.eclipse.persistence.annotations.QueryRedirectors;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@EntityListeners(JPABeanCallbacks.class)
@MappedSuperclass
public class EViewBase extends Object implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "id")
  protected Integer id;

  protected String uuid;

  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

}
