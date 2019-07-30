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

@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int empid=Integer.parseInt(request.getParameter("empid"));
		EmployeeDao daoObj=new EmployeeDaosImpl();
		Employee r=daoObj.getEmployeeById(empid);
		if(r!=null){
			HttpSession session=request.getSession();
			session.setAttribute("userObj",r);
			System.out.println("I m in if servlet");
			
			request.setAttribute("msg","employee Id is correct");
			RequestDispatcher rd=request.getRequestDispatcher("ViewProfile.jsp");
			rd.forward(request,response);
			}
		else
		{
			request.setAttribute("msg","employee Id is incorrect");
			RequestDispatcher rd=request.getRequestDispatcher("SearchEmployeeById.jsp");
				rd.forward(request,response);
		}
	}

}
