<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:include page="Header.jsp"/>
    <h3>Welcome ${userObj.employeeName}</h3>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
<h3 >no of logged in : </h3>${applicationScope.counter}
	
<div align="center">
<table>
		<tr>
			<td><a href="ViewProfile.jsp">1. View Profile</a></td>
		</tr>
		<tr>
			<td><a href="UpdateProfile.jsp">2. Update Profile</a></td>
		</tr>
		<tr>
			<td>3. Add your Address</td>
		</tr>
		<tr>
			<td><a href="PasswordChange.jsp">4. Change Password</a></td>
		</tr>
		<tr>
			<td><a href="LogOutController">5. Logout</a></td>
		</tr>
	</table>
	</div>
</body>
</html>