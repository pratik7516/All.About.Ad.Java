package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import dto.Student;

public class Main {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg = cfg.configure();
		
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		ssrb.applySettings(cfg.getProperties());
		
		StandardServiceRegistry ssr = ssrb.build();
		
		SessionFactory sf = cfg.buildSessionFactory(ssr);
		
		Session s = sf.openSession();
		
		Transaction tr = s.beginTransaction();
		
//		Student std = new Student(101, "shiva", 7878.50f);	
//		s.save(std);
		
		tr.commit();
		s.close();
		sf.close();
		

	}

}
