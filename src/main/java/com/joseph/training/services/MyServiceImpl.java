package com.joseph.training.services;

import com.joseph.training.repositories.MyRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {

  @Value("${name.value: default}")
  private String name;
  private MyRepository repository;

  public MyServiceImpl(@Qualifier("myRepositoryImpl") MyRepository repository) {
    this.repository = repository;
  }

  @Override
  public void doSomething() {
    System.out.println("Doing some business logic for : " + name);
    repository.doQuery();
  }

}
