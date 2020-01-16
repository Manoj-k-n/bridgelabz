package com.bridgelabz.JDBC;
import java.math.BigInteger;
import java.sql.*;
public class setData 
{
public int setdataa(String uname,String pass,String mail,BigInteger mobile,String lname) throws ClassNotFoundException, SQLException
{
	String sql="insert into login value( ? , ? , ? , ? , ? )  ";
	String url="jdbc:mysql://localhost:3306/manoj";
	String username="manoj";
	String passe="manoj";
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection c=DriverManager.getConnection(url,username,passe);
	PreparedStatement ps=c.prepareStatement(sql);
	  ps.setString(1,uname );
	  ps.setString(2,pass);
	  ps.setString(3,mail);	
	  ps.setObject(4, mobile);
	  ps.setString(5,lname);
	  int i=ps.executeUpdate();
//ps.close();
//c.close();
	return i;
	
	
}
}
