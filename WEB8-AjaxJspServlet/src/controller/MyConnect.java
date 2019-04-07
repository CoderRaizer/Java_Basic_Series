package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnect
{
	String servername;//ten server cua SQL da cai dat
	String port;
	String db_user;
	String db_pass;
	String db_name;
	
	
	public MyConnect()
	{
		servername="127.0.0.1";//cong ket noi voi SQL server
		port="3306";
		db_name="startmysql";//ten database trong SQL server
		db_user="root";//user connect vao SQL
		db_pass="123456";//pass connect vao SQL
	}
	
	
	
	public MyConnect(String servername,String port,String db_name,String db_user,String db_pass)
	{
		this.servername = servername;
		this.port = port;
		this.db_user = db_user;
		this.db_pass = db_pass;
		this.db_name = db_name;
	}
	
	
	
	public Connection getcn()//day la ham thuc hien viec ket noi JDBC (Java-SQL Server) va tra ve 1 gia tri null hay != null
	{
		Connection cn = null;
		try
		{
		String db_url = "jdbc:mysql://" + servername + ":" + port +"/" + db_name;
		System.out.println(db_url);
		Class.forName("com.mysql.jdbc.Driver");
		cn = DriverManager.getConnection(db_url, db_user, db_pass);
		}
		catch (ClassNotFoundException | SQLException ex)
		{
		System.out.println(ex.getMessage());
		}
		return cn;
		}
}

