package com.cdac.comp;

public class MyService {
	
	private int serviceNo;
	private MyDao myDao;

	public MyService() {
		
	}

	public int getServiceNo() {
		return serviceNo;
	}

	public void setServiceNo(int serviceNo) {
		this.serviceNo = serviceNo;
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
