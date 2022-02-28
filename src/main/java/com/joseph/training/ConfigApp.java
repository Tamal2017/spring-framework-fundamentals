package com.joseph.training;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.joseph.training")
public class ConfigApp {

  @Bean
  public MyService getService() {
    return new MyService();
  }
}


