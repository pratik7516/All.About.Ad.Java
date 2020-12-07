
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%
	String uname = request.getParameter("userName");
	String upass = request.getParameter("userPass");
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/cdac","root","root");
	PreparedStatement s = con.prepareStatement(
			"insert into user(user_name,user_pass) values(?,?)");
	s.setString(1, uname);
	s.setString(2, upass);
	int i = s.executeUpdate();
	con.close();
	response.sendRedirect("login.jsp");
%>