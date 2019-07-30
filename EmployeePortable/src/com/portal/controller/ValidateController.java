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

@WebServlet("/ValidateController")
public class ValidateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int empid=Integer.parseInt(request.getParameter("empid"));
		String pass=request.getParameter("emppass");
		EmployeeDao daoObj=new EmployeeDaosImpl();
		Employee r=daoObj.validate(empid,pass);
		if(r!=null){
			HttpSession session=request.getSession();
			session.setAttribute("userObj",r);
			if(r.getRole().equals("admin")){
				RequestDispatcher rd=request.getRequestDispatcher("AdminSuccess.jsp");
				rd.forward(request, response);
			}
			else {
				RequestDispatcher rd=request.getRequestDispatcher("EmployeeSuccess.jsp");
				rd.forward(request, response);
			}

			
		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("failure.jsp");
			rd.forward(request, response);
		}
	}
}

