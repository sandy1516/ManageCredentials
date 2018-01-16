package com.san.pro.dao;

import java.util.List;
import com.san.pro.model.User;

public interface UserDAO {
	public void create(User user);
	public List<User> list();
}