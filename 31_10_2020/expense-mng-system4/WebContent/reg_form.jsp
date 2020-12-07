<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
	<spr:form action="reg.htm" method="post" commandName="user" >
	<table align="center" >
		<tr>
			<td>
				User Name:
			</td>
			<td>
				<spr:input path="userName"/>
			</td>
		</tr>
		<tr>
			<td>
				User Name:
			</td>
			<td>
				<spr:password path="userPass"/>
			</td>
		</tr>
		<tr>
			<td>
				<a href="index.jsp" >Back</a>
			</td>
			<td>
				<input type="submit"  value="Register" >
			</td>
		</tr>
	</table>
	</spr:form>
</body>
</html>