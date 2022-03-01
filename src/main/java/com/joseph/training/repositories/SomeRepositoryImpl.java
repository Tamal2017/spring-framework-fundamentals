package com.joseph.training.repositories;

import org.springframework.stereotype.Repository;

@Repository
public class SomeRepositoryImpl implements MyRepository {

  public void doQuery() {
    System.out.println(">>> Retrieving data in DB");
  }

}
