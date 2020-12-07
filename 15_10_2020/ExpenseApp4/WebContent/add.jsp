
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%
	String itm = request.getParameter("item");
	String pr = request.getParameter("price");
	String pdate = request.getParameter("pdate");
	
	int uid = (Integer)session.getAttribute("cur_user_id");
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/cdac","root","root");
	PreparedStatement s = con.prepareStatement(
			"insert into expense(item_name,price,pur_date,user_id) values(?,?,?,?)");
	s.setString(1, itm);
	s.setFloat(2, Float.parseFloat(pr)); 
	s.setString(3, pdate);
	s.setInt(4, uid);
	int i = s.executeUpdate();
	con.close();
	response.sendRedirect("home.jsp");
%>