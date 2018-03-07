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
	@Transactional
	public List<User> list() {
		String query = "FROM User";
		List<User> listUser = entityManager.createQuery(query).getResultList();
		return listUser;
	}

	

}
