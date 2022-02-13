package com.asimily.models;
/**
 * Base JPA class with id, versionNumber and other common attributes
 */

import com.asimily.common.AsimilySoftDeleteRedirector;
import com.asimily.listeners.JPABeanCallbacks;
import org.eclipse.persistence.annotations.QueryRedirectors;
import org.eclipse.persistence.annotations.TypeConverter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@EntityListeners(JPABeanCallbacks.class)
@QueryRedirectors(
    delete=AsimilySoftDeleteRedirector.class
)
@Entity
@Table(name = "test_base", schema = "raw_cloud")
public class ETestBase extends Object implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.TABLE)
  @Column(name = "uuid")
  protected UUID uuid;

  protected String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }
}
