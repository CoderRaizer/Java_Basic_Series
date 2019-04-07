package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import controller.MyConnect;
import entities.Chitiethoadon;

public class ChitiethoadonModel
{
	Chitiethoadon cthd;
	
	public ChitiethoadonModel()
	{
		
	}
	
	public ChitiethoadonModel(Chitiethoadon cthd)
	{
		this.cthd = cthd;
	}
	
	public int insertChiTietHoaDon()
	{
		int kq=0;
		Connection cn = new MyConnect().getcn();
		if(cn==null)
			return 0;
		
		try
		{
			String sql = "Insert into CHITIETHOADON values(?,?,?)";
			PreparedStatement ps = cn.prepareStatement(sql);
			ps.setInt(1,cthd.getMahd());
			ps.setString(2,cthd.getMasp());
			ps.setInt(3,cthd.getSoluong());
			
			kq = ps.executeUpdate();
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		return kq;
	}
}
