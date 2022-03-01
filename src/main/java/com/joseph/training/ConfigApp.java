package com.joseph.training;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.joseph.training")
public class ConfigApp {

  @Bean
  public MyService getService() {
    return new MyService(getRepository());
  }

  public MyRepository getRepository() {
    return new MyRepository();
  }

}
