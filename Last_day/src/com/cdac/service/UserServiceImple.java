package com.cdac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.UserDao;
import com.cdac.dto.User;

@Service
public class UserServiceImple implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public void addUser(User user) {
		userDao.insertUser(user);
	}

	@Override
	public boolean findUser(User user) {
		return userDao.checkUser(user);
	}

	@Override
	public String forgotPassword(String userName) {
		return userDao.forgotPassword(userName);
	}

	@Override
	public void uploadImage(String profilePic, int userId) {
		userDao.uploadImage(profilePic, userId);
	}
	
}
