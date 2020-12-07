package com.cdac.service;

import com.cdac.dto.User;

public interface UserService {
	void addUser(User user);
	boolean findUser(User user);
	String forgotPassword(String userName);
	void uploadImage(String profilePic,int userId);
}
