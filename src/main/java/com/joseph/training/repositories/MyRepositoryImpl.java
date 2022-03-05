package com.joseph.training.repositories;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepositoryImpl implements MyRepository {

  public void doQuery(String url) {
    System.out.println("Retrieving data server url : " + url);
  }

}
