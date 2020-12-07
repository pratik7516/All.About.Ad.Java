package com.cdac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.comp.MyColl;

public class Main {

	public static void main(String[] args) {
		ApplicationContext appCntx = 
				new ClassPathXmlApplicationContext("cfg.xml");
		MyColl m = (MyColl)appCntx.getBean("myColl");
		
		System.out.println(m.getMyList());
		System.out.println("========================");
		System.out.println(m.getMySet());
		System.out.println("======================");
		System.out.println(m.getMyMap());
		System.out.println("========================");
		System.out.println(m.getMyProperties());
		System.out.println("============================");
		for(String a : m.getMyArr()) {
			System.out.println(a);
		}
	}

}
