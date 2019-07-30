/*<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>*/
<jsp:include page="Header.jsp"/>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Form</title>
</head>
<body>
<h4 style="color:red">
	</h4>
	<div align="center">
	<fieldset>
		<legend>Login Form</legend>
		<form action="ValidateController" method="post">	
			<table>
				<tr>
					<td>Employee Id : </td>
					<td>
						<input type="number" name="empid" placeholder="Enter your id" required/>
					</td>
				</tr>
				<tr>
					<td>Password : </td>
					<td>
						<input type="password" name="emppass" placeholder="Enter your password" required/>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="Login"/>
 					</td>
				</tr>
			</table>
		</form>
	</fieldset>
	
	</div>
</body>
</html>