package com.cdac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.comp.Rectangle;

public class Main {

	public static void main(String[] args) {
		ApplicationContext appCntx = new ClassPathXmlApplicationContext("cfg.xml");
		Rectangle r = (Rectangle)appCntx.getBean("rect");
		System.out.println(r.getLength());
		System.out.println(r.getBreadth());
		System.out.println(r.getArea());
		
		r = (Rectangle)appCntx.getBean("rect1");
		System.out.println(r.getLength());
		System.out.println(r.getBreadth());
		System.out.println(r.getArea());
		
	}

}
