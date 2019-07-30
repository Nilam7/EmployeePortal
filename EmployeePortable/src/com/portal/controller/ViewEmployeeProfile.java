package com.portal.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.portal.daos.EmployeeDao;
import com.portal.daosimpl.EmployeeDaosImpl;
import com.portal.entities.Employee;

@WebServlet("/ViewEmployeeProfile")
public class ViewEmployeeProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeDao daoObj=new EmployeeDaosImpl();
		List<Employee> empsList=daoObj.getAllEmployee();
		
		request.setAttribute("eList", empsList);
		RequestDispatcher rd=request.getRequestDispatcher("ViewEmployee.jsp");
		rd.forward(request, response);
	}

}
