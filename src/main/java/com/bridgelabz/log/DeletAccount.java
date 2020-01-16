package com.bridgelabz.log;

import java.io.IOException;

import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgelabz.JDBC.DeletAccountInJDBC;

/**
 * Servlet implementation class DeletAccount
 */
public class DeletAccount extends HttpServlet {
	
  DeletAccountInJDBC dj=new DeletAccountInJDBC();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	String name=request.getParameter("name");
	String pass=request.getParameter("pass");
	try 
	{
	
		
		if(dj.delet(name,pass))
		{
		System.out.println("not deleted");	
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
