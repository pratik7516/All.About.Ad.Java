package com.cdac.comp;

public class MyService {
	private MyDao myDao;

	public MyService() {
		System.out.println("no arg MyService");
	}

	public MyService(MyDao myDao) {
		System.out.println("parameterized MyService");
		this.myDao = myDao;
	}

	public void add() {
		System.out.println("add called============");
		myDao.insert();
	}
	
}
