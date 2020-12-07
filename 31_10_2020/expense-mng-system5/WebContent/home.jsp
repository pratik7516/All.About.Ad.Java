<%@page import="com.cdac.dto.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<table align="center" >
		<tr><td>&nbsp;&nbsp;</td></tr>
		<tr>
			<td> Welcome <%=(session.getAttribute("user")!=null) ? ((User)session.getAttribute("user")).getUserName() : "!!!!!!!!" %> </td>
		</tr>
		<tr>
			<td> <a href="prep_expense_add_form.htm" >Add Expense</a> </td>
		</tr>
		<tr>
			<td> <a href="expense_list.htm" >Expense List</a> </td>
		</tr>
		<tr>
			<td> <a href="index.html" >Logout</a> </td>
		</tr>
	</table>
</body>
</html>