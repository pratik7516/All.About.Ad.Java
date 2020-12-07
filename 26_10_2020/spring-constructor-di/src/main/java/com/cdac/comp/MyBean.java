package com.cdac.comp;

public class MyBean {
	private int beanNo;
	private String beanMsg;
	public MyBean() {
		System.out.println("no arg MyBean");
	}
	
//	public MyBean(int beanNo, String beanMsg) {
//		System.out.println("param int String");
//		this.beanNo = beanNo;
//		this.beanMsg = beanMsg;
//	}
//	
	public MyBean(String beanMsg, int beanNo) {
		System.out.println("param String int");
		this.beanNo = beanNo;
		this.beanMsg = beanMsg;
	}

	@Override
	public String toString() {
		return beanNo + " " + beanMsg;
	}
	
	
	
	
}
