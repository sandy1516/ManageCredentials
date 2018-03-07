package com.san.pro.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.san.pro.model.User;
import com.san.pro.service.CredentialServiceImpl;
import com.san.pro.service.UserServiceImpl;

@Controller
public class UserController {

	@Autowired
	private UserServiceImpl userService;
	
	@RequestMapping(value = "/newUser", method = RequestMethod.GET)
	public String createNewUser(Model model) {
		model.addAttribute("user", new User());
		return "home";
	}
	
	@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
	public String saveUser( User user) {
		userService.addUser(user);
		return "save";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String getUser(Model model) {
		List<User> lt = userService.list();
		model.addAttribute("listEmployee", lt);
		return "emplist";
		
	}
	
}
