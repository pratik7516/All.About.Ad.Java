<%@page import="dto.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% 
		Student std = (Student)session.getAttribute("student");
	%>
	<%=std.getRno()%><br>
	<%=std.getStudentName()%><br>
	<%=std.getFee()%><br>
	<%=std.getCourse()%><br>
</body>
</html>