<%@page import="com.service.UserServiceImple"%>
<%@page import="com.service.UserService"%>
<jsp:useBean id="user" class="com.dto.User" scope="page" ></jsp:useBean>
<jsp:setProperty property="*" name="user"/>
<%
	UserService userService = new UserServiceImple();
	userService.registerUser(user);
	response.sendRedirect("login.jsp");
%>