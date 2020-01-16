package com.bridgelabz.log;

import java.io.IOException;

import java.math.BigInteger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgelabz.JDBC.setData;

import java.sql.*;
/**
 * Servlet implementation class Reg
 */
public class Reg extends HttpServlet 
{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	String lname=request.getParameter("lname");
	String uname=request.getParameter("uname");
	BigInteger mobile=new BigInteger(request.getParameter("mobile"));
	String mail=request.getParameter("email");
	String pass=request.getParameter("password");
	setData sd=new setData();
	try {
		int i=sd.setdataa(uname, pass, mail, mobile, lname);
		if(i==1)
		{
			response.sendRedirect("index.jsp");
		}
		System.out.println(i);
	} catch (Exception e) 
	{
	  System.out.println(e);
	}

}
}
