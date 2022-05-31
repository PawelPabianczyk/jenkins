package com.example.jenkinspawelpabianczyk.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserEntity {
  @Id private Long id;

  private String name;
  private String email;
  private String gender;
  private String status;

  public UserEntity(Long id, String name, String email, String gender, String status) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.gender = gender;
    this.status = status;
  }

  protected UserEntity() {}

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
