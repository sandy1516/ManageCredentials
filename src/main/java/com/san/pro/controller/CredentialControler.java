package com.san.pro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.san.pro.model.Credential;
import com.san.pro.model.User;
import com.san.pro.service.CredentialServiceImpl;
import com.san.pro.service.UserServiceImpl;

public class CredentialControler {

	@Autowired
	private CredentialServiceImpl credentialService;
	
	@RequestMapping(value = "/newCredential", method = RequestMethod.GET)
	public String createNewCredential() {
		return "credential";
	}
	
	@RequestMapping(value = "/saveCredential", method = RequestMethod.POST)
	public String saveCredential(Credential credential) {
		credentialService.addCredential(credential);
		System.out.println("done");
		return "save";
	}
}
