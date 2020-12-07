package com.cdac.comp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MyService {
	
	@Autowired
	private MyDao myDao;
	@Value(value = "hello")
	private String msg;

	public MyService() {
		System.out.println("MyService()");
	}

	public MyDao getMyDao() {
		return myDao;
	}

	public void setMyDao(MyDao myDao) {
		this.myDao = myDao;
	}
	
	public void add() {
		System.out.println("add called============");
		myDao.insert();
	}
	
}
