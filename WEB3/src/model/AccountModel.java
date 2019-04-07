package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import controller.MyConnect;
import entities.Account;

public class AccountModel
{
	Account acc;
	
	public AccountModel()
	{
		
	}
	
	
	
	public AccountModel(Account acc)
	{
		this.acc = acc;
	}
	
	
	public ArrayList getList()
	{
		ArrayList<Account> list = new ArrayList<>();
		Connection cn = new MyConnect().getcn();
		if(cn==null)
			return null;
		
		
		try
		{
			String sql = "select * From admin";
			PreparedStatement ps = cn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				Account temp = new Account(rs.getString(1),rs.getString(2));
				list.add(temp);
			}
			ps.close();
			rs.close();
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		return list;
	}
	
}
