package com.synechron.project.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.synechron.project.entity.User;
import com.synechron.project.repository.UserRepository;

@Repository
public class UserDAO {

	@Autowired
	UserRepository urepo;
	
	public User addUser(User user) {
		return urepo.save(user);
	}
}
