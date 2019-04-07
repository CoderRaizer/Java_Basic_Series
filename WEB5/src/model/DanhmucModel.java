package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import controller.MyConnect;
import entities.Danhmuc;

public class DanhmucModel
{
	Danhmuc danhmuc;
	
	public DanhmucModel()
	{
		// TODO Auto-generated constructor stub
	}
	
	
	public DanhmucModel(Danhmuc danhmuc)
	{
		this.danhmuc = danhmuc;
	}
	
	
	public ArrayList<Danhmuc> getList()
	{
		ArrayList<Danhmuc> list = new ArrayList<>();
		Connection cn = new MyConnect().getcn();
		if(cn==null)
			return null;
		
		try
		{
			String sql = "select * From DANHMUC";
			PreparedStatement ps = cn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				Danhmuc temp = new Danhmuc(rs.getInt(1),rs.getString(2));
				list.add(temp);
			}
			ps.close();
			cn.close();
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		return list;
	}
	
	
}
