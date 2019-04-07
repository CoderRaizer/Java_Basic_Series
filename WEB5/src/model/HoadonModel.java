package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import controller.MyConnect;
import entities.Hoadon;

public class HoadonModel
{
	Hoadon hoadon;
	
	public HoadonModel()
	{
		
	}
	
	public HoadonModel(Hoadon hoadon)
	{
		this.hoadon = hoadon;
	}
	
	public int insertHoaDon()
	{
		int kq=0;
		Connection cn = new MyConnect().getcn();
		if(cn==null)
			return 0;
		
		try
		{
			String sql = "insert into HOADON values(?)";
			PreparedStatement ps = cn.prepareStatement(sql);
			ps.setString(1,hoadon.getNgaydh());
			kq=ps.executeUpdate();
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		return kq;
	}
	
	public int getNewestIdHoadon()
	{
		Connection cn = new MyConnect().getcn();
		int MaxID = 0;
		if(cn==null)
			return 0;
		
		try
		{
			String sql = "select MAX(MAHD) From HOADON";
			PreparedStatement ps = cn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				MaxID = rs.getInt(1);
			}
			ps.close();
			cn.close();
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		return MaxID;
	}
	
}
