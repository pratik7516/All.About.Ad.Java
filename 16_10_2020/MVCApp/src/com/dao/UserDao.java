package com.dao;

import com.dto.User;

public interface UserDao {
	int insertUser(User user);
	boolean login(User user);
}
