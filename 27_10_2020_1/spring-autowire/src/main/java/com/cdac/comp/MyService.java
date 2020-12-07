package com.cdac.comp;

public class MyService {
	
	private MyDao myDao;

	public MyService() {
		
	}
	
	

	public MyService(MyDao myDao) {
		System.out.println("param constructor is called ====== ");
		this.myDao = myDao;
	}



	public MyDao getMyDao() {
		return myDao;
	}

	public void setMyDao(MyDao myDao) {
		System.out.println("setter called");
		this.myDao = myDao;
	}
	
	public void add() {
		System.out.println("add called============");
		myDao.insert();
	}
	
}
