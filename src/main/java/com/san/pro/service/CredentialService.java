package com.san.pro.service;

import java.util.List;

import com.san.pro.model.Credential;

public interface CredentialService {
	public void addCredential(Credential credential);
	public List<Credential> list();
}
