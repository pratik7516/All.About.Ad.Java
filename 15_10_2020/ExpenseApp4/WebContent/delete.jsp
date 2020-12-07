
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%
	String eid = request.getParameter("exp_id");
	int expenseId = Integer.parseInt(eid);
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/cdac","root","root");
	PreparedStatement s = con.prepareStatement(
			"delete from expense where expense_id = ?");
	s.setInt(1, expenseId);
	int i = s.executeUpdate();
	con.close();
	response.sendRedirect("expense_list.jsp");
%>