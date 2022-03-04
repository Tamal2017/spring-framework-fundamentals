package com.joseph.training.services;

import com.joseph.training.repositories.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService, EnvironmentAware {

  @Value("${name.value: empty}")
  private String name;
  @Autowired
  private MyRepository repository;
  private Environment environment;

  public MyServiceImpl( MyRepository repository) {
    this.repository = repository;
  }

  @Override
  public void doSomething() {
    System.out.println("Doing some business logic for : " + name);
    repository.doQuery();
  }

  @Override
  public void setEnvironment(Environment environment) {
    this.environment = environment;
  }
}
