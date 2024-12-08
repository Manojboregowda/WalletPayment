package com.synechron.project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.synechron.project.dao.UserDAO;
import com.synechron.project.entity.User;

@Service
public class UserService {

	@Autowired
	UserDAO dao;
	
	public User addUser(User user) {
		return dao.addUser(user);
	}
}
