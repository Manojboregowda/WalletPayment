package com.synechron.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.synechron.project.entity.BankAccount;

public interface BankRepository extends JpaRepository<BankAccount, Integer> {
	@Query("FROM BankAccount b WHERE b.mobile=:phone AND b.email=:email")
	public BankAccount getUserByPhoneAndEmail(Long phone, String email);
}
