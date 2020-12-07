package com;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

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
//		Query q = s.getNamedQuery("selAll");
		Query q = s.getNamedQuery("selAll1");
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
		Query q = s.createQuery("from Employee order by empName");
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
		Query q = s.createQuery("from Employee where dept = ?");
		q.setString(0, "cs"); 
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
		Query q = s.createQuery("from Employee where dept = ? and basicSalary >= ?");
		q.setString(0, "cs");
		q.setFloat(1, 80000.50f);
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
		Query q = s.createQuery("select empName from Employee");
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
		Query q = s.createQuery("select empName, basicSalary from Employee");
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
		Query q = s.createQuery("select distinct(dept) from Employee");
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
		Query q = s.createQuery("select empName from Employee where empName like ?");
		q.setString(0, "r%"); 
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
		Query q = s.createQuery("select sum(basicSalary) from Employee");
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
		Query q = s.createQuery("select dept,sum(basicSalary) from Employee group by dept");
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
		Query q = s.createQuery("select empName, basicSalary from Employee where basicSalary >= (select avg(basicSalary) from Employee)");
		List<Object[]> li = q.list();
		for(Object[] e : li) {
			System.out.println(e[0]+" "+e[1]);
		}
		tr.commit();
		s.close();
	}

}
