package com.bridgelabz.JDBC;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Logindao
{
	public boolean check(String name,String pass) throws ClassNotFoundException, SQLException
	{
		
		String sql="select * from login where uname = ? and password = ? ";
		String url="jdbc:mysql://localhost:3306/manoj";
		String username="manoj";
		String passe="manoj";
	
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection(url,username,passe);
			PreparedStatement ps=c.prepareStatement(sql);
			ps.setString(1,name);
			ps.setString(2,pass);
			ResultSet   rs=ps.executeQuery();
			  if(rs.next())
			  {
//				  ps.close();
//				  c.close(); 
			  return true;
			  }
			  else
			  {
//				  ps.close();
//				  c.close();
		       return false;
			  }	
	}
	
	}

