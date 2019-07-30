package com.portal.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.portal.daos.EmployeeDao;
import com.portal.daosimpl.EmployeeDaosImpl;
import com.portal.entities.Employee;

@WebServlet("/RegistrationController")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("empname");
		String gender=request.getParameter("gender");
		String email=request.getParameter("email");
		String contactNo=request.getParameter("contactNo");
		String qualification=request.getParameter("Qualification");
		String pass=request.getParameter("pass");
	
		
		Employee emp=new Employee();
		emp.setContactNo(contactNo);
		emp.setEmailAddress(email);
		emp.setEmployeeName(name);
		emp.setGender(gender);
		emp.setQualification(qualification);
		emp.setPassword(pass);
		EmployeeDao daoObj=new EmployeeDaosImpl();
		boolean r=daoObj.register(emp);
		if(r){
			HttpSession session=request.getSession();
			session.setAttribute("userObj",r);
			
			if(r){
				request.setAttribute("msg","User Registered Succesfully...");
				RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
				rd.forward(request, response);
			}
			else {
				request.setAttribute("msg","Problem in doing registration . Try again...");
				
				RequestDispatcher rd=request.getRequestDispatcher("RegistrationForm.jsp");
				rd.forward(request, response);
			}

			
		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("failure.jsp");
			rd.forward(request, response);
		}
		
	}

}
