package com.cdac.comp;

import org.springframework.stereotype.Component;

@Component
public class MyDao {
	
	public MyDao() {
		System.out.println("MyDao()");
	}

	public void insert() {
		System.out.println("insert() called ======= ");
	}
}
