<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>add</title>
</head>
<body>
	<form action="add.jsp" method="post" >
		<table align="center" >
			<thead>
				<tr>
					<th colspan="2" >Add Expenses</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>Item Name:</td>
					<td><input type="text" name="item"  /> </td>
				</tr>
				<tr>
					<td>Price:</td>
					<td><input type="text" name="price"  /> </td>
				</tr>
				<tr>
					<td>Purchase Date:</td>
					<td><input type="text" name="pdate"  /> </td>
				</tr>
				<tr>
					<td><a href="home.jsp" >Back</a> </td>
					<td><input type="submit" value="Add"  /> </td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>