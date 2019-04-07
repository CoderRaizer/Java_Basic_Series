package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnect
{
	String servername;
	String port;
	String db_user;
	String db_pass;
	String db_name;
	
	
	
	public MyConnect()
	{
		servername = "127.0.0.1";
		port = "1433";
		db_user = "sa";
		db_pass = "123456";
		db_name = "TESTWEB";
	}
	
	
	public MyConnect(String severname,String port,String db_user,String db_pass,String db_name)
	{
		servername = severname;
		port = port;
		db_user = db_user;
		db_pass = db_pass;
		db_name = db_name;
	}
	
	
	
	public Connection getcn()
	{
		Connection cn = null;
		try
		{
			String db_url = "jdbc:sqlserver://"+ servername +":"+ port +";databasename =" + db_name;
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			
			cn = DriverManager.getConnection(db_url,db_user,db_pass);
		}
		catch(SQLException | ClassNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
		return cn;
	}
}
