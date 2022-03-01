package com.joseph.training;

import com.joseph.training.services.MyServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

  public static void main(String[] args) {
    ApplicationContext ctx = new AnnotationConfigApplicationContext("com.joseph.training");
    var service = ctx.getBean(MyServiceImpl.class);
    service.doSomething();
  }

}
