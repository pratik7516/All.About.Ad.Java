package com.cdac.comp;

public class MyBean {
	private String msg;

	public MyBean() {
		System.out.println("MyBean() constructor=======");
	}
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		System.out.println("setMsg() called++++++++++");
		this.msg = msg;
	}
	
	public void start() {
		System.out.println("start() called>>>>>>>>>>>>>>>>");
	}
	public void stop() {
		System.out.println("stop() callid<<<<<<<<<<<<<<<<<<<");
	}
	
	
}
