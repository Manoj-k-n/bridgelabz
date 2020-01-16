package com.bridgelabz.log;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgelabz.JDBC.Logindao;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	
	Logindao ld=new Logindao();
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException 
	{
	String name=request.getParameter("uname");
	String pass=request.getParameter("pass");
	try {
		if(ld.check(name, pass))
		{
			HttpSession s=request.getSession();
			s.setAttribute("name",name);
			response.sendRedirect("welcome.jsp");
		}
		else
		{
			
			response.sendRedirect("index.jsp");
			System.out.println("invalid");
			PrintWriter out=response.getWriter();
			out.print("Invalid User");
		}
	} catch (Exception e) 
	{
	System.out.println(e);	
	}
		
	}
}

