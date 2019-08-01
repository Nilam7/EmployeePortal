package com.filter;

import java.io.IOException;
import java.net.InetAddress;
import java.sql.PreparedStatement;
import java.time.LocalTime;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;



@WebFilter("/HomePage.jsp")
public class IpAddressFilter implements Filter {
	

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("i m init");
	}

	public void destroy() {
		System.out.println("i m destroy");
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		InetAddress IP=InetAddress.getLocalHost();
		System.out.println(IP.getHostAddress());
		LocalTime d=LocalTime.now();
		System.out.println("Time :"+d);
		//PreparedStatement ps=new 
		chain.doFilter(request, response);
	}



}
