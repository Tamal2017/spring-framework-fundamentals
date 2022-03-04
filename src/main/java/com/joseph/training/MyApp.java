package com.joseph.training;

import com.joseph.training.config.ConfigApp;
import com.joseph.training.services.MyServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

  public static void main(String[] args) {
    System.setProperty("spring.profiles.active", "local");
    ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigApp.class);
    var service = ctx.getBean(MyServiceImpl.class);
    service.doSomething();
  }

}
