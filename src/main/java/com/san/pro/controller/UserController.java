package com.san.pro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.san.pro.model.User;
import com.san.pro.service.UserServiceImpl;

@Controller
public class UserController {

	@Autowired
	private UserServiceImpl userService;
	
	@RequestMapping(value = "/newUser", method = RequestMethod.GET)
	public String createNewUser() {
		return "home";
	}
	
	@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
	public void saveUser(User user) {
		System.out.println("done");
		userService.addUser(user);
	}
}
