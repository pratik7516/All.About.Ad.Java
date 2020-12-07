package com.cdac.comp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyService {
	
	@Autowired
	private MyDao myDao;

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
