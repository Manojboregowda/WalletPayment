package com.synechron.project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.synechron.project.entity.BankAccount;
import com.synechron.project.repository.BankRepository;

@Service
public class BankService {

	@Autowired
	BankRepository brepo;

	public BankAccount getBankUserdeatils(Long phone, String email) {
		return brepo.getUserByPhoneAndEmail(phone, email);
	}
}
