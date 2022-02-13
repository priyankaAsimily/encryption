package com.asimily.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;

import javax.sql.DataSource;

import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Order(Ordered.LOWEST_PRECEDENCE)
public class PropertiesPostProcessor implements EnvironmentPostProcessor {
  private static final String PROPERTY_SOURCE_NAME = "databaseProperties";

  @Override
  public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
    Map<String, Object> propertySource = new HashMap<>();

    try {

      // Build manually datasource to ServiceConfig
      DataSource ds = DataSourceBuilder.create()
          .username(environment.getProperty("local.config.datasource.username"))
          .password(environment.getProperty("local.config.datasource.password"))
          .url(environment.getProperty("local.config.datasource.url"))
          .driverClassName("org.postgresql.Driver").build();

      // Fetch all properties
      Connection connection = ds.getConnection();

      PreparedStatement preparedStatement = connection.prepareStatement("SELECT key, value FROM raw_cloud.application_properties where application IN (SELECT * FROM unnest(?)) ");
      Array applicationsInArray = connection.createArrayOf("text", Arrays.asList("ce","packetProcessor").toArray());
      preparedStatement.setArray(1, applicationsInArray);
      ResultSet rs = preparedStatement.executeQuery();

      // Populate all properties into the property source
      while (rs.next()) {
        propertySource.put(rs.getString("key"), rs.getString("value"));
      }
      propertySource.put("server.port", "8181");
      rs.close();
      preparedStatement.clearParameters();

      preparedStatement.close();
      connection.close();

      // Create a custom property source with the highest precedence and add it
      // to Spring Environment
      environment.getPropertySources().addFirst(new MapPropertySource(PROPERTY_SOURCE_NAME, propertySource));

    } catch (Throwable e) {
      throw new RuntimeException(e);
    }

  }
}
