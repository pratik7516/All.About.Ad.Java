<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index Page</title>
</head>
<body>
<%@ include file="header.jsp"  %>
	<form action="divide.jsp">
		Num 1 :<input type="text" name="num1"><br>
		Num 2 :<input type="text" name="num2"><br>
		<input type="submit" value="Divide"><br>				
	</form>
</body>
</html>