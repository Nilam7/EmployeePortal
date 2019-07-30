<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="Header.jsp"/>
<h4 style="color:red">
		<c:if test="${msg ne null}">
			${msg}
		</c:if>
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
		<form action="PasswordChange" method="post">	
		<table>
	<tr>
		<td>New Password</td>
		<td><input type="password" name="pass1" placeholder="enter your oldpassword" required></td>
	</tr>
	<tr>
		<td>Re-enter New Password</td>
		<td><input type="password" name="pass2" placeholder="enter your newpassword" required></td>
	</tr>
	<tr>
	<td><input type="submit" value="submit"></td>
	</tr>
</table>
</form>
</div>
</body>
</html>