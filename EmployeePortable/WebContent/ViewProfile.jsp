<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:include page="Header.jsp"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="neon">
<div align="center">
<fieldset>
<legend>Login Form</legend>

<table>
<tr>
	<td>Employee Id :</td>
	<td>${userObj.employeeId}</td>
</tr>
<tr>
	<td>Employee Name :</td>
	<td>${userObj.employeeName}</td>
</tr>
<tr>
	<td>Gender :</td>
	<td>${userObj.gender}</td>
</tr>
<tr>
	<td>email :</td>
	<td>${userObj.emailAddress}</td>
</tr>
<tr>
	<td>Contact Number  : </td>
	<td>${userObj.contactNo}</td>
</tr>
<tr>
	<td>Qualification :</td>
	<td>${userObj.qualification}</td>
</tr>
</table>
</form>
</fieldset>
</div>
</body>
</html>