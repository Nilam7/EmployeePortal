<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List,com.portal.entities.Employee" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="Header.jsp"/>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="orange">
	<table>
		<tr>
			<th>Emp Id</th>
			<th>Emp Name</th>
			<th>Gender</th>
			<th>Contact No</th>
			<th>Qualification</th>
			<th>Email</th>
		</tr>
		<c:forEach items="${eList}" var="e">
			<tr>
				<td>${e.employeeId}</td>
				<td>${e.employeeName}</td>
				<td>${e.gender}</td>
				<td>${e.contactNo}</td>
				<td>${e.qualification}</td>
				<td>${e.emailAddress}</td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>

</body>
</html>