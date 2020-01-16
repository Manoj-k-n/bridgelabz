package com.bridgelabz.log;

import java.io.IOException;

import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgelabz.JDBC.AlterAccountJDBC;

/**
 * Servlet implementation class update
 */
public class update extends HttpServlet {
	
	AlterAccountJDBC ad=new AlterAccountJDBC();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("uname");
		String pass=request.getParameter("pass");
		Object mail=request.getParameter("mail");
		try 
		{
			if(ad.alter(name, pass,mail))
			{
				response.sendRedirect("alter.jsp");
			}
			else
			{
				response.sendRedirect("index.jsp");
			}
			
		} 
		catch (ClassNotFoundException e) 
		{
		System.out.println(e);
		}
		catch (SQLException e) 
		{
		System.out.println(e);
		}
	}

}
