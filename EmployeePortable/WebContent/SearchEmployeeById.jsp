<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <jsp:include page="Header.jsp"/>
<h4 style="color:red">
		<c:if test="${msg ne null}">
			${msg}
		</c:if>
		</h4>
<html>
<body>
<div align="center">
<fieldset>
<legend>login form</legend>
<form action="SearchServlet" method="post">
<table>
<tr>
	<td>Enter Employee Id:</td>
	<td><input type="number" name="empid" placeholder="enter your Id" required></td>
</tr>
<tr>
	<td><input type="submit" value="go"></td>
</tr>
</table>
</form>
</fieldset>
</div>
</body>
</html>