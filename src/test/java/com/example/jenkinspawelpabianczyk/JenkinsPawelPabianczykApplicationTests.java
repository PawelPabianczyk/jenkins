package com.example.jenkinspawelpabianczyk;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class JenkinsPawelPabianczykApplicationTests {

  @Test
  void getUser() {
    RestAssured.get("http://localhost:8080/user").then().statusCode(200);
  }

  @Test
  void getUserWhenPersistTrue() {
    RestAssured.get("http://localhost:8080/user?persist=true").then().statusCode(200);
  }

  @Test
  void getUserWhenPersistFalse() {
    RestAssured.get("http://localhost:8080/user?persist=false").then().statusCode(200);
  }

  @Test
  void getUsers() {
    RestAssured.get("http://localhost:8080/users").then().statusCode(200);
  }
}
