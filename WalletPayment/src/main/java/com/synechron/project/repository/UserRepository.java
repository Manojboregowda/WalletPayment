package com.synechron.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.synechron.project.entity.User;


public interface UserRepository extends JpaRepository<User, Integer> {

}
