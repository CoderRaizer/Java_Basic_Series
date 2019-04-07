package Test_Swing1;

import java.sql.*;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class KetNoi_Insertdatabase//class nay chua ham main de thuc hien ktra ket noi va dua du lieu vao database
{
	
	String hoten = null;
	String email = null;
	
	
	public void sethoten(String txthoten)
	{
		this.hoten = txthoten;
	}
	public void setemail(String txtemail)
	{
		this.email = txtemail;
	}
	
	
	public void xacnhandangky()
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
		
		
		//Sau khi ket noi JDBC (Java - SQL Server) thi tien hanh insert du lieu nguoi dung nhap tu form dang ky vao database
		
		String sql = "INSERT table_thongtin VALUES (?,?)";
		//Kiem tra email trung lap
		String kt="select email from table_thongtin where email=?";//kt la kiem tra
		
		try
		{
			PreparedStatement ps = con.prepareStatement(kt);
			ps.setString(1,email);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				System.out.println("Email trung lap");
			}
			else
			{
				PreparedStatement ps1 = con.prepareStatement(sql);
				ps1.setString(1,hoten);
				ps1.setString(2,email);
				
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
	}//public void xacnhandangky
	
	
	
	
	
}

