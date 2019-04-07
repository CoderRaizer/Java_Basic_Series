package TestConnection_Khanh;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Test_Delete
{
	Scanner o = new Scanner(System.in);
	
	MyConnect cn = new MyConnect();
	
	Connection con = cn.getcn();
	
	
	String user = null;
	
	
	public void DeleteDatabase()
	{
		System.out.println("Nhap ten dang nhap ban can xoa: ");this.user = o.nextLine();
		
		String kiemtra = "SELECT Tendangnhap FROM ADMIN WHERE Tendangnhap = ?";
		String sql = "DELETE FROM ADMIN WHERE Tendangnhap = ?";
		
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
				ps1.setString(1,user);
				int kq = ps1.executeUpdate();
				if(kq == 1)
				{
					System.out.println("DELETE SUCCESS");
				}
			}
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
