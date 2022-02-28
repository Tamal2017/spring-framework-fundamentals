package com.joseph.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MyApp {

  public static void main(String[] args) {
    ApplicationContext ctx = new FileSystemXmlApplicationContext("application-context.xml");
    var service = ctx.getBean(MyService.class);
    service.doSomething();
  }

}
