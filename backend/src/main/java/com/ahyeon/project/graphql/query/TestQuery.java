package com.ahyeon.project.graphql.query;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class TestQuery {

  @QueryMapping
  public String test() {
    return "test";
  }
}
