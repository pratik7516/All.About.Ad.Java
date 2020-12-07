package com.cdac.dao;

import com.cdac.dto.User;

public interface UserDao {
	void insertUser(User user);
	boolean checkUser(User user);
}
