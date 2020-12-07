package com;

import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;

import com.dto.Employee;

public class Main2 {
	private static SessionFactory sf;
	
	static {
		Configuration cfg = new Configuration().configure();
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		ssrb.applySettings(cfg.getProperties());
		StandardServiceRegistry ssr = ssrb.build();
		sf = cfg.buildSessionFactory(ssr);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean flag  = true;
		while(flag) {
			System.out.println("Enter 0 to exit");
			System.out.println("Enter 1 to sel all");
			System.out.println("Enter 2 to sel order");
			System.out.println("Enter 3 to sel order");
			System.out.println("Enter 4 to sel and");
			System.out.println("Enter 5 to sel names");
			System.out.println("Enter 6 to sel name salary");
			System.out.println("Enter 7 to sel distinct");
			System.out.println("Enter 8 to sel like");
			System.out.println("Enter 9 to sel sum");
			System.out.println("Enter 10 to sel sum group by dept");
			System.out.println("Enter 11 to sel sub query");
			byte choice = sc.nextByte();
			switch(choice) {
				case 0 :
					flag = false;
				break;
				case 1 :
					selectAll();
					break;
				case 2 :
					selectOrderBy();
					break;
				case 3 :
					selectWhere();
					break;
				case 4 :
					selectWhereAnd();
					break;
				case 5 :
					selectNames();
					break;
				case 6 :
					selectNameSalary();
					break;
				case 7 :
					selectDistinct();
					break;
				case 8 :
					selectLike();
					break;
				case 9 :
					selectSum();
					break;
				case 10 :
					selectGroupby();
					break;
				case 11 :
					selectSubquery();
					break;
			}
			
		}
		System.out.println("done ==================== ");
		sf.close();
	}
	
	private static void selectAll() {
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		Criteria q = s.createCriteria(Employee.class);
		List<Employee> li = q.list();
		for(Employee e : li) {
			System.out.println(e); 
		}
		tr.commit();
		s.close();
	}
	
	private static void selectOrderBy() {
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		Criteria q = s.createCriteria(Employee.class);
		q.addOrder(Order.desc("basicSalary"));
		List<Employee> li = q.list();
		for(Employee e : li) {
			System.out.println(e); 
		}
		tr.commit();
		s.close();
	}
	
	private static void selectWhere() {
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		Criteria q = s.createCriteria(Employee.class);
		q.add(Restrictions.eq("dept", "cs"));
		List<Employee> li = q.list();
		for(Employee e : li) {
			System.out.println(e); 
		}
		tr.commit();
		s.close();
	}
	
	private static void selectWhereAnd() {
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		Criteria q = s.createCriteria(Employee.class); 
		q.add(Restrictions.and(Restrictions.eq("dept", "cs"),Restrictions.ge("basicSalary", 80000.50F)));  
		List<Employee> li = q.list();
		for(Employee e : li) {
			System.out.println(e); 
		}
		tr.commit();
		s.close();
	}
	
	private static void selectNames() {
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		Criteria q = s.createCriteria(Employee.class);
		
		ProjectionList plist = Projections.projectionList();
		plist.add(Projections.property("empName")); 
		q.setProjection(plist);
		
		List<String> li = q.list();
		for(String e : li) {
			System.out.println(e); 
		}
		tr.commit();
		s.close();
	}
	
	private static void selectNameSalary() {
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		
		Criteria q = s.createCriteria(Employee.class);
		
		ProjectionList plist = Projections.projectionList();
		plist.add(Projections.property("empName")); 
		plist.add(Projections.property("basicSalary"));
		q.setProjection(plist);
		
		List<Object[]> li = q.list();
		for(Object e[] : li) {
			System.out.println(e[0]+" "+e[1]); 
		}
		tr.commit();
		s.close();
	}
	
	private static void selectDistinct() {
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		Criteria q = s.createCriteria(Employee.class);
		
		ProjectionList plist = Projections.projectionList();
		plist.add(Projections.distinct(Projections.property("dept")));   
		q.setProjection(plist);
		List<String> li = q.list();
		for(String e : li) {
			System.out.println(e); 
		}
		tr.commit();
		s.close();
	}
	
	private static void selectLike() {
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		Criteria q = s.createCriteria(Employee.class);
		
		ProjectionList plist = Projections.projectionList();
		plist.add(Projections.property("empName"));   
		q.setProjection(plist);
		
		q.add(Restrictions.like("empName", "r%"));  
		
		List<String> li = q.list();
		for(String e : li) {
			System.out.println(e); 
		}
		tr.commit();
		s.close();
	}
	
	private static void selectSum() {
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		Criteria q = s.createCriteria(Employee.class);
		
		ProjectionList plist = Projections.projectionList();
		plist.add(Projections.sum("basicSalary"));
		q.setProjection(plist);
		List<Double> li = q.list();
		for(Double e : li) {
			System.out.println(e); 
		}
		tr.commit();
		s.close();
	}
	
	private static void selectGroupby() {
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		Criteria q = s.createCriteria(Employee.class);
		
		ProjectionList plist = Projections.projectionList();
		plist.add(Projections.groupProperty("dept")); 
		plist.add(Projections.sum("basicSalary"));
		
		q.setProjection(plist);
		
		List<Object[]> li = q.list();
		for(Object[] e : li) {
			System.out.println(e[0]+" "+e[1]);
		}
		tr.commit();
		s.close();
	} 
	
	private static void selectSubquery() { 
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		
		DetachedCriteria dc = DetachedCriteria.forClass(Employee.class);
		ProjectionList pl = Projections.projectionList();
		pl.add(Projections.avg("basicSalary"));
		dc.setProjection(pl); 
		
		Criteria q = s.createCriteria(Employee.class);
		
		ProjectionList plist = Projections.projectionList();
		plist.add(Projections.property("empName"));
		plist.add(Projections.property("basicSalary"));
		q.setProjection(plist);
		
		q.add(Property.forName("basicSalary").ge(dc));
		
		List<Object[]> li = q.list();
		for(Object[] e : li) {
			System.out.println(e[0]+" "+e[1]);
		}
		tr.commit();
		s.close();
	}

}
