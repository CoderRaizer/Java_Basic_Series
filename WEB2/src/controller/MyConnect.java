package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnect{
	private String servername;
	private String port;
	private String db_user;
	private String db_pass;
	private String db_name;
	
	public MyConnect()
	{
		servername = "127.0.0.1";
		port = "1433";
		db_user = "sa";
		db_pass = "123456";
		db_name = "TESTWEB";//name on database
	}
	
	
	public MyConnect(String severname,String port,String db_user,String db_pass,String db_name)
	{
		servername = severname;
		this.port = port;
		this.db_user = db_user;
		this.db_pass = db_pass;
		this.db_name = db_name;
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
