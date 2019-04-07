package Test_Swing4_database_bt3;

import java.sql.*;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class KetNoi_Insertdatabasez
{
	String namesp = null;
	String danhmuc = null;
	String price = null;
	
	
	public void setnamesp(String namesanpham)
	{
		this.namesp = namesanpham;
	}
	public void setdanhmucsp(String danhmucsp)
	{
		this.danhmuc = danhmucsp;
	}
	public void setpricesp(String pricesp)
	{
		this.price = pricesp;
	}
	
	
	
	public void xacnhanthongtin()
	{
		Scanner o = new Scanner(System.in);
		
		
		MyConnect cn=new MyConnect();
		Connection con=null;
		
		con=cn.getcn();
		if(con!=null)//Ket noi voi SQL thanh cong
		{
			System.out.println("KET NOI SQL THANH CONG");
		}
		else
		{
			System.out.println("KET NOI SQL THAT BAI");
		}
		
		
		
		//Sau khi ket noi JDBC (Java - SQL Server) thi tien hanh insert
		
		String sql = "INSERT quanlykhohang VALUES (?,?,?)";
		//Kiem tra ten san pham trung lap
		String kt="select NameSP from quanlykhohang where NameSP = ?";//kt la kiem tra
		
		try
		{
			PreparedStatement ps = con.prepareStatement(kt);
			ps.setString(1,namesp);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				System.out.println("Ten Sp trung lap");
			}
			else
			{
				PreparedStatement ps1 = con.prepareStatement(sql);
				ps1.setString(1,namesp);
				ps1.setString(2,danhmuc);
				ps1.setString(3,price);
				
				int kq = ps1.executeUpdate();
				if(kq == 1)
				{
					System.out.println("INSERT SUCCESS");
				}
				else
				{
					System.out.println("INSERT FAIL");
				}
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}
