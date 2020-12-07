package com.cdac.comp;

import org.springframework.stereotype.Repository;

@Repository
public class MyDao {
	
	public MyDao() {
		System.out.println("MyDao()");
	}

	public void insert() {
		System.out.println("insert() called ======= ");
	}
}
