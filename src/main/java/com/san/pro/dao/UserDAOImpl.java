package com.san.pro.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.san.pro.model.User;

@Repository
@Transactional
public class UserDAOImpl implements UserDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void create(User user) {
		if(user != null) {
			entityManager.persist(user);
		}
	}
	
	@Override
	public List<User> list() {
		String query = "SELECT u from user u";
		List<User> listUser = entityManager.createQuery(query, User.class).getResultList();
		return listUser;
	}

	

}
