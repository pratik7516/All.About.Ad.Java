<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
</head>
<body>
	<spr:form action="login.htm" method="post" commandName="user" >
	<table align="center" >
		<tr>
			<td>
				User Name:
			</td>
			<td>
				<spr:input path="userName"/>
				<font color="red" ><spr:errors path="userName" ></spr:errors></font>
			</td>
		</tr>
		<tr>
			<td>
				Password:
			</td>
			<td>
				<spr:password path="userPass"/>
				<font color="red" ><spr:errors path="userPass" ></spr:errors></font>
			</td>
		</tr>
		<tr>
			<td>
				<a href="index.jsp" >Back</a>
			</td>
			<td>
				<input type="submit"  value="Login" >
			</td>
		</tr>
	</table>
	</spr:form>
</body>
</html>