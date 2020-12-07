package com.cdac.comp;

public class MyBeanFactory {
	public MyBean getInstance() {
		System.out.println("getInstance() called ==========");
		MyBean m = new MyBean();
		m.setMsg("from different Factory Class"); 
		return m;
	}
	
}
