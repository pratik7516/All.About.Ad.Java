package com;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.dto.Employee;

public class Main {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		ssrb.applySettings(cfg.getProperties());
		StandardServiceRegistry ssr = ssrb.build();
		SessionFactory sf = cfg.buildSessionFactory(ssr);
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		Employee e = new Employee(103, "rama", 89999.50f, "it", new Date());
		
		s.save(e);
		System.out.println(e);
		e.setDept("CS");
		System.out.println(e); 
		
		tr.commit();
		s.close();
		e.setDept("ACC");
		System.out.println(e); 
		sf.close();
	}

}
