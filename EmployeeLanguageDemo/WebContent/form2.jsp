<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="myerror.jsp"  %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Name  :${requestScope.name}<br/>
Name  :${requestScope.name1}<br/>
EmployeeId  :${sessionScope.employeeId}<br/>
Designation  :${applicationScope.designation}<br/>
Text'sfield Data :${param.t1}<br/>
 Courses   :<c:forEach begin="0" end="3" var="i">
${paramValues.quali[i]}
</c:forEach>
<c:forTokens items="apple,mango,grapes,orange" delims="," var="name">
	 	<br/> <c:out value="${name}"/>		
</c:forTokens>
<br/><c:set var="salary" value="30000" scope="session"/>
	<c:choose>
		<c:when test="${salary lt 20000}">
			 Salary is low
		</c:when>
		<c:when test="${salary le 30000}">
			Salary is OK..
		</c:when>
		<c:otherwise>
			Salary is Good..
		</c:otherwise>
	</c:choose>
<%-- <c:catch var="exception"> --%>
	<%
	
		int x=30/0;
	%>
<%-- </c:catch>
 <br/>Exception is : <c:out value="${exception}"/>
 --%> <c:import url="https://www.javatpoint.com/EL-expression-in-jsp">
 </c:import>
</body>
</html>