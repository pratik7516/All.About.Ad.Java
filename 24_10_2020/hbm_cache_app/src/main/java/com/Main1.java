package com;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.dto.Employee;

public class Main1 {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		ssrb.applySettings(cfg.getProperties());
		StandardServiceRegistry ssr = ssrb.build();
		SessionFactory sf = cfg.buildSessionFactory(ssr);
		Session s = sf.openSession();
		System.out.println("first session started");
		Transaction tr = s.beginTransaction();
		System.out.println("get is called");
		Employee e = (Employee)s.get(Employee.class, 1);
		System.out.println("showing record");
		System.out.println(e);
		System.out.println("get is called");
		e = (Employee)s.get(Employee.class, 1);
		System.out.println("showing record");
		System.out.println(e);
		tr.commit();
		s.close();
		System.out.println("first session is closed");
		
		s = sf.openSession();
		System.out.println("second session started");
		tr = s.beginTransaction();
		System.out.println("get is called");
		e = (Employee)s.get(Employee.class, 1);
		System.out.println("showing record");
		System.out.println(e);
		System.out.println("get is called");
		e = (Employee)s.get(Employee.class, 1);
		System.out.println("showing record");
		System.out.println(e);
		tr.commit();
		s.close();
		System.out.println("second session is closed");
		
		
		sf.close();
	}

}
