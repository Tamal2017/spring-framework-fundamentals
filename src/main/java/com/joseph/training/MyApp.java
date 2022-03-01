package com.joseph.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

  public static void main(String[] args) {
    ApplicationContext ctx = new AnnotationConfigApplicationContext("com.joseph.training");
    var service = ctx.getBean(MyService.class);
    service.doSomething();
  }

}
