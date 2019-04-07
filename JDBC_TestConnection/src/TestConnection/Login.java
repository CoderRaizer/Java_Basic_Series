package TestConnection;

import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Login
{

	public static void main(String[] args)
	{
		Scanner o = new Scanner(System.in);
		
		//Connection
		MyConnect cn=new MyConnect();//tao mot doi tuong tu class MyConnect
		Connection con=null;
//		Statement stmt = null;
//		//ResultSet rs = null; neu co dong nay thi ben duoc chi can: rs = ps.executeQuery();
		
		con=cn.getcn();//bien con hung gia tri cua ham getcn tra ve
		if(con!=null)//Ket noi voi SQL thanh cong
		{
			System.out.println("KET NOI SQL THANH CONG");
		}
		else
		{
			System.out.println("KET NOI SQL THAT BAI");
		}
		
		
		//Sau khi ket noi JDBC (Java - SQL Server) thi tien hanh Connect vao User va Pass de su dung Database
		String Username = null;//trong database Table Customer
		String Password = null;//trong database Table Customer
		
		
		System.out.println("NHAP Username: ");
		Username = o.nextLine();
		o = new Scanner(System.in);
		System.out.println("NHAP Password: ");
		Password = o.nextLine();
		
		
		
		String sql="SELECT * FROM Customer WHERE Username= ?";//Cau lenh Dua vao SQL 
		try
		{
			
			PreparedStatement ps = con.prepareStatement(sql);//PreparedStatement thuc thi cac truy van da duoc tham so hoa vao SQL
			
			ps.setString(1,Username);//tuong ung voi "?" tren kia,dau hoi la de dua 1 cai gi do vao,co 1 dau hoi duy nhat nen chi so gia tri la 1
			ResultSet rs = ps.executeQuery();
			int kq = 1;
			while(rs.next())
			{
					if(Username.equals(rs.getString("Username")))
					{
						if(Password.equals(rs.getString("Password")))
						{
							System.out.println("LOGIN SUCCESS");
						}
						else
						{
							System.out.println("SAI MAT KHAU");
						}
					}
					else
					{
						System.out.println("KHONG TON TAI NGUOI DUNG");
					}//DONG NAY KHONG CO HIEU LUC LA SAO??
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
			
	}

}
