package com.san.pro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.san.pro.dao.UserDAO;
import com.san.pro.model.User;

@Controller
public class UserController {

	@Autowired
	private UserDAO userDAO;
	
	@RequestMapping("/{someID}")
	public void addUser(@PathVariable(value="someID") String id) {
		User user = new User();
		user.setId(Integer.parseInt(id));
		user.setUsername("sandy");
		user.setPassword("sandy");
		user.setEmail("sandy");
		userDAO.create(user);
	}
}
