package com.san.pro.service;

import java.util.List;

import com.san.pro.model.User;

public interface UserService {
	public void addUser(User user);
	public List<User> list();
}
