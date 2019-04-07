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
	
	
	
	
	
	public int insertAccount()
	{
		int kq=0;
		Connection cn = new MyConnect().getcn();
		if(cn==null)
		return 0;
		
		
		
		try
		{
			String sql = "insert into admin values(?,?)";
			PreparedStatement ps = cn.prepareStatement(sql);
			ps.setString(1,acc.getUsername());
			ps.setString(2,acc.getPassword());
			kq = ps.executeUpdate();//neu thanh cong ket qua luon tra ve 1
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		return kq;
	}
	
	
	
	public int updateAccount()
	{
		Connection cn = new MyConnect().getcn();
		if(cn==null)
			return 0;
		
		int kq=0;
		
		try
		{
			String sql = "update admin set password =? where username=?";
			PreparedStatement ps = cn.prepareStatement(sql);
			ps.setString(1,acc.getPassword());
			ps.setString(2,acc.getUsername());
			
			kq = ps.executeUpdate();//neu thanh cong tra ve 1
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		return kq;
	}
	
	
	
	
	public int deleteAccount()
	{
		Connection cn = new MyConnect().getcn();
		if(cn==null)
			return 0;
		
		int kq=0;
		try
		{
			String sql = "delete from admin where username=?";
			PreparedStatement ps = cn.prepareStatement(sql);
			ps.setString(1,acc.getUsername());
			
			kq = ps.executeUpdate();//neu thanh cong tra ve 1
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		return kq;
	}
	
}

