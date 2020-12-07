package com.cdac.comp;

public class MyBean {
	private int beanNo;
	private String beanMsg;
	public MyBean() {
		super();
	}
	public int getBeanNo() {
		return beanNo;
	}
	public void setBeanNo(int beanNo) {
		System.out.println("setBeanNo()=============");
		this.beanNo = beanNo;
	}
	public String getBeanMsg() {
		return beanMsg;
	}
	public void setBeanMsg(String beanMsg) {
		System.out.println("setBeanMsg()===========");
		this.beanMsg = beanMsg;
	}
	
}
