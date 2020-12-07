package com.cdac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.comp.MyBean;

public class Main {

	public static void main(String[] args) {
		ApplicationContext appCntx = 
				new ClassPathXmlApplicationContext("cfg.xml");
		MyBean mb = (MyBean)appCntx.getBean("myb");
		System.out.println(mb.getBeanNo());
		System.out.println(mb.getBeanMsg()); 

	}

}
