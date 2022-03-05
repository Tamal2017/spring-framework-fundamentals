package com.joseph.training;

import com.joseph.training.config.DevelopmentConfig;
import com.joseph.training.config.ProductionConfig;
import com.joseph.training.services.MyServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

  public static void main(String[] args) {
    System.setProperty("spring.profiles.active", "prod");
    ApplicationContext ctx = new AnnotationConfigApplicationContext(DevelopmentConfig.class,
        ProductionConfig.class);
    var service = ctx.getBean(MyServiceImpl.class);
    service.doSomething();
  }

}
