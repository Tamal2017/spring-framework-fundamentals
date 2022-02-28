package com.joseph.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

  public static void main(String[] args) {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
    var service = ctx.getBean(MyService.class);
    service.doSomething();
  }

}
