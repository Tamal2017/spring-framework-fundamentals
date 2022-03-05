package com.joseph.training.services;

import com.joseph.training.repositories.MyRepository;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService, EnvironmentAware {

  @Value("${server.url: localhost}")
  private String serverUrl;
  @Autowired
  private MyRepository repository;
  private Environment environment;

  public MyServiceImpl(MyRepository repository) {
    this.repository = repository;
  }

  @Override
  public void doSomething() {
    System.out.println("Active profiles : " + Arrays.toString(this.environment.getActiveProfiles()));
    repository.doQuery(serverUrl);
  }

  @Override
  public void setEnvironment(Environment environment) {
    this.environment = environment;
  }
}
