package com.cdac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.comp.MyDao;

public class Main {

	public static void main(String[] args) {
		ApplicationContext appCntx = 
				new ClassPathXmlApplicationContext("cfg.xml");
		System.out.println("getBean() call");
		MyDao m = (MyDao)appCntx.getBean("dao");
		System.out.println(m);
		System.out.println("getBean() call");
		MyDao m1 = (MyDao)appCntx.getBean("dao");
		System.out.println(m1);
	}

}
