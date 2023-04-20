package com.page.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.page.entity.UserEntity;


public interface UserRepository extends JpaRepository<UserEntity, String> {
}