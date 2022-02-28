package com.joseph.training;

public class MyService {

  private MyRepository repository;

  public MyService(MyRepository repository) {
    this.repository = repository;
  }

  public void doSomething() {
    System.out.println("Doing some business logic !");
    repository.doQuery();
  }
}
