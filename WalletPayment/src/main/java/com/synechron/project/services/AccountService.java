package com.synechron.project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.synechron.project.dao.AccountDAO;
import com.synechron.project.entity.Account;
import com.synechron.project.entity.BankAccount;

@Service
public class AccountService {

	@Autowired
	AccountDAO accdao;
	
	
	public Account savAccount(Account account) {
		return accdao.saveAccount(account);
	}
}
