<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<form action="validate.jsp" method="post" >
		<table align="center" >
			<thead>
				<tr>
					<th colspan="2" >Login Page</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>User Name</td>
					<td><input type="text" name="userName"  /> </td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="userPass"  /> </td>
				</tr>
				<tr>
					<td><a href="reg_form.jsp" >Sign up</a> </td>
					<td><input type="submit" value="Login"  /> </td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>