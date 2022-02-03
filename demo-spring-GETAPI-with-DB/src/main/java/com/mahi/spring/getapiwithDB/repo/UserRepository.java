package com.mahi.spring.getapiwithDB.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mahi.spring.getapiwithDB.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
