package com.cdac.comp;

public class MyService {
	private MyDao myDao;

	public MyService() {
		
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
