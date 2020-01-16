package com.bridgelabz.JDBC;
import java.sql.*;
public class AlterAccountJDBC 
{
	
public boolean alter(String name,String pass,Object mail) throws ClassNotFoundException, SQLException
{
	String url="jdbc:mysql://localhost:3306/manoj";
	String uname="manoj";
	String password="manoj";
	String q="update login set uname = ? where password = ? and mailid = ? ;";
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection c=DriverManager.getConnection(url,uname,password);
	PreparedStatement ps=c.prepareStatement(q);
	ps.setString(1,name);
	ps.setString(2,pass);
	ps.setObject(3, mail);
	boolean b=ps.execute();
//	ps.close();
//	c.close();
	
	return b;
	
	
}
}
