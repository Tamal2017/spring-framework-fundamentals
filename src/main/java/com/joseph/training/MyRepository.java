package com.joseph.training;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {

  public void doQuery() {
    System.out.println(">>> Doing query in DB");
  }

}
