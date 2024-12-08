package com.synechron.project.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.synechron.project.entity.Account;
import com.synechron.project.entity.BankAccount;
import com.synechron.project.repository.AccountRepository;
import com.synechron.project.services.AccountService;
import com.synechron.project.services.BankService;

@RestController
@RequestMapping("/acc")
public class AccountController {
	
	@Autowired
	BankService bservice;

	@Autowired
	AccountRepository arepo;
	

	@PostMapping("/addaccount/{phone}/{email}")
	public Account getUserByPhoneAndEmail(@PathVariable Long phone, @PathVariable String email) {
		BankAccount bacc = bservice.getBankUserdeatils(phone, email);
		Account acc= new Account();
		BeanUtils.copyProperties(bacc, acc);
		System.out.println(acc);
		return arepo.save(acc);
	}
}
