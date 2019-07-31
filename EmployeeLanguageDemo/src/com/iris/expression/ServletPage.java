package com.iris.expression;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ServletPage")
public class ServletPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		request.setAttribute("name","nilam");
		request.setAttribute("name1","ansu");
		HttpSession session=request.getSession();
		session.setAttribute("employeeId","3145");
		ServletContext context=getServletContext();
		context.setAttribute("designation","graduate engineer trainee");
		RequestDispatcher rd=request.getRequestDispatcher("form1.jsp");
		rd.forward(request,response);
	}
}
