package com.listener;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;




@WebListener
public class MyListener implements HttpSessionListener {
	private static int counter=0;
    public void sessionCreated(HttpSessionEvent e)  { 
    	System.out.println("session created");
    	HttpSession session=e.getSession();
		ServletContext context=session.getServletContext();
		Object ob=context.getAttribute("counter");
		if(ob==null)
		{
			context.setAttribute("counter",1);
		}
		else
		{
			int c=(int) ob;
			c++;
			context.setAttribute("counter",c);
		}
       
    }
    public void sessionDestroyed(HttpSessionEvent e)  { 
    	System.out.println("session destroyed");
    	HttpSession session=e.getSession();
		ServletContext context=session.getServletContext();
		int a=(int) context.getAttribute("counter");
		a--;
		context.setAttribute("counter",a);
    }
    
    public void getCounter(HttpSessionEvent e)
    {
    	
    }
}	

    
