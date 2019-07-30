<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<fieldset>
<legend>Login Form</legend>
<form action="UpdateController" method="post">	
<table>
<tr>
	<td>Employee Name :</td>
	<td><input type="text" name="empname" placeholder="Enter your Name" required/>
</tr>
<tr>
	<td>Gender :</td>
	<td>Male <input type="radio" name="gender" value="m" checked/>
	Female <input type="radio" name="gender" value="f" /></td>
</tr>
<tr>
	<td>email :</td>
	<td><input type="email" name="email" placeholder="Enter your email" required/>
</tr>
<tr>
	<td>Contact Number  : </td>
	<td><input type="number" name="contactNo" placeholder="Enter your Contact No" required/>
	</td>
</tr>
<tr>
	<td>Qualification :</td>
	<td><input type="text" name="Qualification" placeholder="Enter your qualification" required/>
</tr>
<tr>
		<td>Password : </td>
		<td><input type="password" name="pass" placeholder="Enter your password" required/>
		</td>
</tr>
<tr>
		<td colspan="2">
		<input type="submit" value="Register"/>
		</td>
</tr>								
</table>
</div>
</body>
</html>