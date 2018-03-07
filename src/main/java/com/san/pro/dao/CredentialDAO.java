package com.san.pro.dao;

import java.util.List;

import com.san.pro.model.Credential;

public interface CredentialDAO {
	public void create(Credential credential);
	public List<Credential> list();
}
