
<%@page import="java.sql.ResultSet"%>
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
			"select * from user where user_name= ? and user_pass = ?");
	s.setString(1, uname);
	s.setString(2, upass);
	ResultSet rs = s.executeQuery();
	if(rs.next()){
		int uid = rs.getInt("user_id");
		session.setAttribute("cur_user_id", uid); 
		response.sendRedirect("home.jsp");
	}else{
		response.sendRedirect("login.jsp");
	}
	con.close();
%>