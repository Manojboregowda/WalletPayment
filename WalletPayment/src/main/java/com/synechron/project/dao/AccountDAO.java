package com.synechron.project.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.synechron.project.entity.Account;
import com.synechron.project.entity.BankAccount;
import com.synechron.project.repository.AccountRepository;
import com.synechron.project.repository.BankRepository;

@Repository
public class AccountDAO {

	@Autowired
	BankRepository brepo;
	@Autowired
	AccountRepository arepo;
	
	public BankAccount getUserBankDetails(Long phone, String email) {
		return brepo.getUserByPhoneAndEmail(phone, email);
	}
	
	public Account saveAccount(Account account) {
		return arepo.save(account);
	}
}
