package com.example.jenkinspawelpabianczyk.controller;

import com.example.jenkinspawelpabianczyk.dto.UserDto;
import com.example.jenkinspawelpabianczyk.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@RestController
public class UserController {

  private final UserService service;

  public UserController(UserService service) {
    this.service = service;
  }

  @GetMapping("user")
  public ResponseEntity<UserDto> getUser(@RequestParam(required = false) boolean persist) {
    return ok(service.getUser(persist));
  }

  @GetMapping("users")
  public ResponseEntity<List<UserDto>> getUsers() {
    return ok(service.getUsers());
  }
}
