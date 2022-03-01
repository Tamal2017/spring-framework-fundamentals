package com.joseph.training.repositories;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepositoryImpl implements MyRepository {

  public void doQuery() {
    System.out.println("Doing query in DB");
  }

}
