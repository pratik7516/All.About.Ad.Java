<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Expense List</title>
</head>
<body>
<h3><a href="home.jsp" >Back</a></h3>
	<table align="center" >
	<%
	int uid = (Integer)session.getAttribute("cur_user_id");
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/cdac","root","root");
	PreparedStatement s = con.prepareStatement(
			"select * from expense where user_id = ?");
	s.setInt(1, uid);
	ResultSet rs = s.executeQuery();
	while(rs.next()){
	%>
	<tr>
		<td><%=rs.getString("item_name")%></td>
		<td><%=rs.getFloat("price") %></td>
		<td><%=rs.getString("pur_date")%></td>
		<td><a href="delete.jsp" >delete</a></td>
		<td><a href="update_form.jsp" >update</a></td>
	</tr>
	<%
	}
	con.close();
%>    	
	</table>
</body>
</html>