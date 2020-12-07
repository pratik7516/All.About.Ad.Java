<%@page import="com.dto.Employee"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.Query"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="org.hibernate.boot.registry.StandardServiceRegistry"%>
<%@page import="org.hibernate.boot.registry.StandardServiceRegistryBuilder"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<%@page import="org.hibernate.Transaction"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
    Configuration cfg = new Configuration().configure();
	StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
	ssrb.applySettings(cfg.getProperties());
	StandardServiceRegistry ssr = ssrb.build();
	SessionFactory sf = cfg.buildSessionFactory(ssr);
	Session s = sf.openSession();
	Transaction tr = s.beginTransaction();
	Query q = s.createQuery("from Employee");
	List<Employee> li = q.list();
	System.out.println(li); 
	tr.commit();
	s.close();
	sf.close();
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>hbm web</title>
</head>
<body>
	<table align="center" >
		
			
	
	<%
		for(Employee e : li){
	%>
	<tr>
		<td>
			<%=e%>
		</td>
	</tr>
	<%
		}
	%>
	</table>
</body>
</html>