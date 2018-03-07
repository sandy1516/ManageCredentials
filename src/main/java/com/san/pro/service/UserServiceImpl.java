package com.san.pro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.san.pro.dao.CredentialDAO;
import com.san.pro.dao.UserDAO;
import com.san.pro.model.User;

@Repository
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO userDAO;
//	private CredentialDAO credentialDAO;
	
	@Override
	public void addUser(User user) {
		userDAO.create(user);		
	}

	@Override
	public List<User> list() {
		return userDAO.list();
	}
}
