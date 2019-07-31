                                       <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
		<legend>Login Form</legend>
		<form action="RegistrationController" method="post">	
			<table>
				<tr>
					<td>Employee Id : </td>
					<td>
						<input type="text" name="empid" placeholder="Enter your Id" value="${userObj.employeeId}" required/>
					</td>
				</tr>
				<tr>
					<td>Employee Name : </td>
					<td>
						<input type="text" name="empname" placeholder="Enter your Name" value="${userObj.employeeName}" required/>
					</td>
				</tr>
				<tr>
					<td>Gender : </td>
					<td>
						Male <input type="radio" name="gender" value="m" checked/>
						Female <input type="radio" name="gender" value="f" />
					</td>
				</tr>
				<tr>
					<td>Email  : </td>
					<td>
						<input type="email" name="email" placeholder="Enter your Email" value="${userObj.emailAddress}" required/>
					</td>
				</tr>
				<tr>
					<td>Contact Number  : </td>
					<td>
						<input type="text" name="contactNo" placeholder="Enter your Contact No" value="${userObj.contactNo}" required/>
					</td>
				</tr>
				<tr>
					<td>Qualification  : </td>
					<td>
						<input type="text" name="qualification" placeholder="Enter your Qualification" value="${userObj.qualification}" required/>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="Update"/>
 					</td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>