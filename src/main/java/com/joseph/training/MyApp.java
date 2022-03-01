package com.joseph.training;

import com.joseph.training.services.AnotherServiceImpl;
import com.joseph.training.services.MyServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

  public static void main(String[] args) {
    ApplicationContext ctx = new AnnotationConfigApplicationContext("com.joseph.training");
    var service1 = ctx.getBean(MyServiceImpl.class);
    var service2 = ctx.getBean(AnotherServiceImpl.class);
    service1.doSomething();
    service2.doSomething();
  }

}
