package com.example.jenkinspawelpabianczyk.repository;

import com.example.jenkinspawelpabianczyk.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {}
