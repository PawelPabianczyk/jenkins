package com.example.jenkinspawelpabianczyk.mapper;

import com.example.jenkinspawelpabianczyk.entity.UserEntity;
import com.example.jenkinspawelpabianczyk.dto.UserDto;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

  public UserDto toDto(UserEntity user) {
    return new UserDto(
        user.getId(), user.getName(), user.getEmail(), user.getGender(), user.getStatus());
  }

  public UserEntity toEntity(UserDto user) {
    return new UserEntity(
        user.getId(), user.getName(), user.getEmail(), user.getGender(), user.getStatus());
  }
}
