package com.service;

import com.dao.UserDao;
import com.dao.UserDaoImple;
import com.dto.User;

public class UserServiceImple implements UserService {
	
	private UserDao userDao;
	
	public UserServiceImple() {
		userDao = new UserDaoImple();
	}

	@Override
	public int registerUser(User user) {
		return userDao.insertUser(user);
	}

	@Override
	public boolean login(User user) {
		return userDao.login(user); 
	}
	
	
}
