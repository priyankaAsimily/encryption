package com.asimily;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.concurrent.Executor;
import com.asimily.EncryptionService;

import javax.annotation.PostConstruct;

@SpringBootApplication
@Configuration
@EnableAsync
public class ApplicationLoader extends SpringBootServletInitializer implements CommandLineRunner {
	
  @Autowired
  EncryptionService encryptionService;
  
	@Value("${optionName}")
	private String optionName;
	
  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  public static void main(String[] args) {
    new SpringApplicationBuilder(ApplicationLoader.class)
        .build()
        .run(args);
  }

  public void run(String... arg0) throws Exception {
    logger.info("********************entered application...");
    System.out.println(optionName);
    encryptionService.serve(optionName);
  }

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    return application.sources(ApplicationLoader.class);
  }

  @Bean
  public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
    return args -> {

    };
  }
  
  @PostConstruct
  public void onApplicationStartUpEvent() {
    logger.info("********************Starting Application Start Up Activities...");
  }
 
}

