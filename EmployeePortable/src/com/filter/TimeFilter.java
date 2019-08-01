package com.filter;

import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDateTime;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebFilter("/HomePage.jsp")
public class TimeFilter implements Filter {
	


public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("i m init");
	}

    
	public void destroy() {
		System.out.println("I m destroy");
		
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest)request;
		HttpServletResponse res=(HttpServletResponse)response;
		LocalDateTime d=LocalDateTime.now();
		int hr=d.getHour();
		DayOfWeek
		hr1=d.getDayOfWeek();
		System.out.println("Hour :"+hr);
		System.out.println("Day :"+hr1);
		if((hr>=9 && hr<=17 )) {
		System.out.println("welcome");
		chain.doFilter(request, response);
		}
		else
		{
			res.sendRedirect("MyErrorPage.jsp");
		}
	}
}
	
	


