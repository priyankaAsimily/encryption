package com.asimily.common;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionOutcome;
import org.springframework.boot.autoconfigure.condition.SpringBootCondition;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.autoconfigure.orm.jpa.JpaBaseConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DatabaseDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.AbstractJpaVendorAdapter;
import org.springframework.orm.jpa.vendor.EclipseLinkJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.jta.JtaTransactionManager;
import org.springframework.util.ClassUtils;

import com.asimily.common.PersistenceAppConstants;
import com.asimily.dao.BaseDao;

/**
 * Autoconfiguration for JPA with EclipseLink.
 *
 * @author jbellmann
 */
@Configuration
@EnableAutoConfiguration
@EnableTransactionManagement
@EnableAspectJAutoProxy(proxyTargetClass = true) 
@EnableJpaRepositories(
    basePackages = {"com.asimily.tmpdao"}, 
    entityManagerFactoryRef = "entityManagerFactorySecondary", 
    transactionManagerRef = PersistenceAppConstants.TRANSACTION_MANAGER_SEC)
public class EclipselinkJpaAutoconfigurationSecondary extends JpaBaseConfiguration {

  final static Logger logger = LoggerFactory.getLogger(EclipselinkJpaAutoconfigurationSecondary.class);

  @Autowired
  static AsimilyDataSourcePropertiesSecondary asimilyDataSourcePropertiesSecondary;

  protected EclipselinkJpaAutoconfigurationSecondary(@Qualifier("dataSourceSec") DataSource dataSource,
      JpaProperties properties, ObjectProvider<JtaTransactionManager> jtaTransactionManagerProvider) {
    super(dataSource, properties, jtaTransactionManagerProvider);
  }

  @Bean(name = "dataSourceSec")
  @ConfigurationProperties("spring.datasource.tomcat")
  public static org.apache.tomcat.jdbc.pool.DataSource dataSource(AsimilyDataSourcePropertiesSecondary properties) {
    org.apache.tomcat.jdbc.pool.DataSource dataSource = createDataSource(properties,
        org.apache.tomcat.jdbc.pool.DataSource.class);
    DatabaseDriver databaseDriver = DatabaseDriver.fromJdbcUrl(properties.determineUrl());
    String validationQuery = databaseDriver.getValidationQuery();
    if (validationQuery != null) {
      dataSource.setTestOnBorrow(true);
      dataSource.setValidationQuery(validationQuery);
    }
    return dataSource;
  }

  @SuppressWarnings("unchecked")
  protected static <T> T createDataSource(AsimilyDataSourcePropertiesSecondary properties,
      Class<? extends DataSource> type) {
    return (T) DataSourceBuilder.create(properties.getClassLoader()).type(type)
        .driverClassName(properties.determineDriverClassName()).url(properties.determineUrl())
        .username(properties.determineUsername()).password(properties.determinePassword()).build();
  }

  @Autowired
  private JpaProperties properties;

  // TODO, resolve ddl-strategy by datasource-type
  // @Autowired
  // private DataSource dataSource;

  @Override
  protected AbstractJpaVendorAdapter createJpaVendorAdapter() {
    return new EclipseLinkJpaVendorAdapter();
  }

  @Override
  protected Map<String, Object> getVendorProperties() {
    Map<String, Object> vendorProperties = new LinkedHashMap<String, Object>();
    vendorProperties.putAll(this.properties.getProperties());
    vendorProperties.put("eclipselink.weaving","false");
    vendorProperties.put("USER_CUST_ID","2");
    vendorProperties.put("ASIMILY_CUST_ID","-1");
    return vendorProperties;
  }

  @Bean(name = "entityManagerFactorySecondary")
  public LocalContainerEntityManagerFactoryBean secondaryEntityManager(
      @Qualifier("dataSourceSec") DataSource dataSource) {
    LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
    em.setDataSource(dataSource);
    em.setJpaVendorAdapter(createJpaVendorAdapter());
    em.setJpaPropertyMap(getVendorProperties());
    em.setPackagesToScan("com.asimily.tmpmodels");
    em.setPersistenceUnitName(PersistenceAppConstants.PERSISTENCE_UNITNAME_SEC);
    return em;
  }

  // /**
  // * Not quite sure, is this configured by default?
  // */
  // public static final class EclipseLinkEntityManagerFactoryBeanCallback
  // implements EntityManagerFactoryBeanCallback {
  //
  // @Override
  // public void execute(final LocalContainerEntityManagerFactoryBean factory)
  // {
  // factory.setSharedCacheMode(SharedCacheMode.ENABLE_SELECTIVE);
  // }
  // }

  @Bean(name = PersistenceAppConstants.TRANSACTION_MANAGER_SEC)
  public PlatformTransactionManager transactionManager(
      @Qualifier("entityManagerFactorySecondary") EntityManagerFactory emf, @Qualifier("dataSourceSec") DataSource dataSource) {
    final JpaTransactionManager transactionManager = new JpaTransactionManager();
    transactionManager.setEntityManagerFactory(emf);
    transactionManager.setDataSource(dataSource);
    return transactionManager;
  }

  /**
   * Same as for hibernate only changed class-names.
   */
  @Order(Ordered.HIGHEST_PRECEDENCE + 20)
  public static class EclipseLinkEntityManagerCondition extends SpringBootCondition {

    private static String[] CLASS_NAMES = { "org.eclipse.persistence.jpa.JpaEntityManager" };

    @Override
    public ConditionOutcome getMatchOutcome(final ConditionContext context, final AnnotatedTypeMetadata metadata) {
      for (String className : CLASS_NAMES) {
        if (ClassUtils.isPresent(className, context.getClassLoader())) {
          return ConditionOutcome.match("found EclipselinkEntityManager class");
        }
      }

      return ConditionOutcome.noMatch("did not find EclipselinkEntityManager class");
    }

  }
}
