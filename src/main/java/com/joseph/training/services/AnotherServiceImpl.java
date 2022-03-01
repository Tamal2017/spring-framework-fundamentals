package com.joseph.training.services;

import com.joseph.training.repositories.MyRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class AnotherServiceImpl implements MyService {

  private MyRepository repository;

  public AnotherServiceImpl(@Qualifier("someRepositoryImpl") MyRepository repository) {
    this.repository = repository;
  }

  @Override
  public void doSomething() {
    System.out.println(">>> Doing business logic differently !");
    repository.doQuery();
  }

}
