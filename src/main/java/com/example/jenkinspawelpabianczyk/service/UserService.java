package com.example.jenkinspawelpabianczyk.service;

import com.example.jenkinspawelpabianczyk.dto.UserDto;
import com.example.jenkinspawelpabianczyk.mapper.UserMapper;
import com.example.jenkinspawelpabianczyk.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class UserService {

  private static final String ENDPOINT = "https://gorest.co.in/public/v2/users";

  private final RestTemplate restTemplate;
  private final UserRepository repository;
  private final UserMapper mapper;
  private final Random rand;

  public UserService(RestTemplate restTemplate, UserRepository repository, UserMapper mapper) {
    this.restTemplate = restTemplate;
    this.repository = repository;
    this.mapper = mapper;
    rand = new Random();
  }

  public UserDto getUser(boolean persist) {
    UserDto[] users = restTemplate.getForEntity(ENDPOINT, UserDto[].class).getBody();
    if (users == null) {
      return null;
    }

    UserDto user = users[rand.nextInt(users.length)];

    if (persist && repository.findById(user.getId()).isEmpty()) {
      repository.save(mapper.toEntity(user));
    }

    return user;
  }

  public List<UserDto> getUsers() {
    return repository.findAll().stream().map(mapper::toDto).collect(Collectors.toList());
  }
}
