package com.bridgelabz.JDBC;
import java.sql.*;
public class DeletAccountInJDBC 
{
	public boolean delet(String name,String pass) throws ClassNotFoundException, SQLException
	{
		String sql="delete from login where uname = ? and password = ? ";
		String url="jdbc:mysql://localhost:3306/manoj";
		String username="manoj";
		String passe="manoj";
	
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection(url,username,passe);
			PreparedStatement ps=c.prepareStatement(sql);
			ps.setString(1,name);
			ps.setString(2,pass);
			boolean b=ps.execute();
//			
//			ps.close();
//			c.close();
			return b;
			
			
 }
}
