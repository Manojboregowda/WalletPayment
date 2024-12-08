package com.synechron.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.synechron.project.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {


}
