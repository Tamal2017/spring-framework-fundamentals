package com.joseph.training;

public class MyService {

  private MyRepository repository;

  public void doSomething() {
    System.out.println("Doing some business logic !");
    repository.doQuery();
  }

  public void setRepository(MyRepository repository) {
    this.repository = repository;
  }
}
