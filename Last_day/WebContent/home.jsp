<%@page import="com.cdac.dto.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%
	User user = (User)session.getAttribute("user");
	String userName = "", profilePic = "";
	if(user!=null){
		userName = user.getUserName();
		profilePic = user.getProfilePic();
	}
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<table align="center" >
		<tr>
		<td>
		<img alt="no pic" src="<%="images/"+profilePic%>" height="150" width="150" > 
		&nbsp;&nbsp;
		</td></tr>
		<tr>
			<td> Welcome <%=userName%> </td>
		</tr>
		<tr>
			<td> <a href="prep_expense_add_form.htm" >Add Expense</a> </td>
		</tr>
		<tr>
			<td> <a href="expense_list.htm" >Expense List</a> </td>
		</tr>
		<tr>
			<td> <a href="file_upload_form.html" >File Upload</a> </td>
		</tr>
		<tr>
			<td> <a href="index.html" >Logout</a> </td>
		</tr>
	</table>
</body>
</html>