package com.san.pro.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.san.pro.model.Credential;

public class CredentialDAOImpl implements CredentialDAO{

	@PersistenceContext
	private EntityManager entityManager; 
	
	@Override
	public void create(Credential credential) {
		entityManager.persist(credential);		
	}

	@Override
	public List<Credential> list() {
		return null;
	}

}
