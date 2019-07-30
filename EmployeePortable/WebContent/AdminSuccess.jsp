<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:include page="Header.jsp"/>
<h3>Welcome ${sessionScope.userObj.employeeName}</h3>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
<div align="center">
<table>
	<tr>
	<td><a href="RegistrationForm.jsp">1.Register a new Employee</a></td>
	</tr>
	<tr>
	<td><a href="ViewEmployeeProfile">2.View All Employees</a></td>
	</tr>
	<tr>
	<td><a href="SearchEmployeeById.jsp">3. Search Employee By Id</a></td>
	</tr>
	<tr>
	<td><a href="PasswordChange.jsp">4. Change your Password</a></td>
	</tr>
</div>
</table>
</body>
</html>