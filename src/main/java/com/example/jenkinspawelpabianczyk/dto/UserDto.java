package com.example.jenkinspawelpabianczyk.dto;

public class UserDto {
  private Long id;
  private String name;
  private String email;
  private String gender;
  private String status;

  public UserDto(Long id, String name, String email, String gender, String status) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.gender = gender;
    this.status = status;
  }

  public UserDto() {}

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public String getGender() {
    return gender;
  }

  public String getStatus() {
    return status;
  }
}
