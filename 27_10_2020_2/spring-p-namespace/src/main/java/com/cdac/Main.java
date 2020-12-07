package com.cdac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.comp.MyService;


public class Main {

	public static void main(String[] args) {
		ApplicationContext appCntx = 
				new ClassPathXmlApplicationContext("cfg.xml");
		MyService m = (MyService)appCntx.getBean("serv");
		m.add();
		System.out.println(m.getServiceNo());

	}

}
