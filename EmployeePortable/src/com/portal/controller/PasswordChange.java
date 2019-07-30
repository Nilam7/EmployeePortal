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

@WebServlet("/PasswordChange")
public class PasswordChange extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pass1=request.getParameter("pass1");
		String pass2=request.getParameter("pass2");
		
		HttpSession session=request.getSession();
		Employee eObj=(Employee)session.getAttribute("userObj");
		int eId=eObj.getEmployeeId();
		
		
		
		if(pass1.equals(pass2)) {
		
		EmployeeDao daoObj=new EmployeeDaosImpl();
		boolean r=daoObj.Password(eId,pass2);
		if(r){
				request.setAttribute("msg","password change successfully");
				RequestDispatcher rd=request.getRequestDispatcher("PasswordChange.jsp");
				rd.forward(request,response);
			}
		
			else
			{
				RequestDispatcher rd=request.getRequestDispatcher("failure.jsp");
					rd.forward(request,response);
			}
	
		}
		
		else {
			request.setAttribute("msg", "Password And Confirm password must be same");
			
			RequestDispatcher rd=request.getRequestDispatcher("PasswordChange.jsp");
			rd.forward(request,response);
		}
		
	}

}
