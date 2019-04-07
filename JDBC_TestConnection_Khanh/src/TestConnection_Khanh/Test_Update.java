package TestConnection_Khanh;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Test_Update
{
	Scanner o = new Scanner(System.in);
	
	MyConnect cn = new MyConnect();
	
	Connection con = cn.getcn();
	
	String user = null;
	String pass = null;
	
	
	public void UpdateDatabase()
	{
		
		System.out.print("Nhap Tendangnhap : ");user = o.nextLine();
		System.out.println("Nhap Matkhau moi: ");pass = o.nextLine();
		
		String kiemtra = "SELECT Tendangnhap FROM ADMIN WHERE Tendangnhap = ?";
		String sql = "UPDATE ADMIN SET Matkhau = ? WHERE Tendangnhap = ?";
		
		try
		{
			PreparedStatement ps = con.prepareStatement(kiemtra);
			ps.setString(1,user);
			ResultSet rs = ps.executeQuery();
			if(!rs.next())
			{
				System.out.println("Khong ton tai Ten dang nhap");
			}
			
			else
			{
				PreparedStatement ps1 = con.prepareStatement(sql);
				ps1.setString(1,pass);
				ps1.setString(2,user);
				int kq=ps1.executeUpdate();
				if(kq == 1)
				{
					System.out.println("UPDATE SUCCESS");
				}
			}
		}
		catch(SQLException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}
