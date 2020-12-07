package com;


import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.dto.Category;
import com.dto.Item;


public class Main {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		ssrb.applySettings(cfg.getProperties());
		StandardServiceRegistry ssr = ssrb.build();
		SessionFactory sf = cfg.buildSessionFactory(ssr);
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		
		Item item1 = new Item(9, "asd");
		Item item2 = new Item(10, "fgh");
		Item item3 = new Item(11, "yui");
		
		Category c = new Category(40, "op");
		
		Set<Item> itms = c.getItems();
		itms.add(item1);
		itms.add(item2);
		itms.add(item3);
		
		s.save(c);
		s.save(item1);
		s.save(item2);
		s.save(item3);
		
		tr.commit();
		s.close();
		sf.close();
	}

}
