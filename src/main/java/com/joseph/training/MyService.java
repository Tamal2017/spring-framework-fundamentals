package com.joseph.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

  @Autowired
  private MyRepository repository;

  public void doSomething() {
    System.out.println("Doing some business logic !");
    repository.doQuery();
  }

  public void setRepository(MyRepository repository) {
    this.repository = repository;
  }
}
