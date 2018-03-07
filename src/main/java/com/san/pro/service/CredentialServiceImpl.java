package com.san.pro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.san.pro.dao.CredentialDAO;
import com.san.pro.model.Credential;

public class CredentialServiceImpl implements CredentialService{
	
	@Autowired
	private CredentialDAO credentialDAO;
	
	@Override
	public void addCredential(Credential credential) {
		credentialDAO.create(credential);
		
	}

	@Override
	public List<Credential> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
