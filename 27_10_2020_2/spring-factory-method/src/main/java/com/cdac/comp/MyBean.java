package com.cdac.comp;

public class MyBean {
	private String msg;

	public MyBean() {
	
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public static MyBean getInstance() {
		System.out.println("getInstance() called ==========");
		MyBean m = new MyBean();
		m.msg = "crated by dev";
		return m;
	}
	
}
