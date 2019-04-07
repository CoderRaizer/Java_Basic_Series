package TestConnection_Khanh;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class Login
{

	public static void main(String[] args)
	{
		
		Scanner o = new Scanner(System.in);
		
		MyConnect cn = new MyConnect();
		Connection con = cn.getcn();
		
		if(con!=null)
		{
			System.out.println("KET NOI SQL-JAVA THANH CONG");
		}
		else
		{
			System.out.print("KET NOI SQL - JAVA THAT BAI");
		}
		
		
		
		int x = 0;
		do
		{
			String Tendangnhap = null;
			String Matkhau = null;
			System.out.print("::> Nhap Tendangnhap: ");
			Tendangnhap = o.nextLine();
			o = new Scanner(System.in);
			System.out.print("::> Nhap mat khau: ");
			Matkhau = o.nextLine();
			
			String sql = "SELECT * FROM ADMIN WHERE Tendangnhap = ?";
			try
			{
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1,Tendangnhap);
				ResultSet rs = ps.executeQuery();
				while(rs.next())
				{
					if(Tendangnhap.equals(rs.getString("Tendangnhap")))
					{
						if(Matkhau.equals(rs.getString("Matkhau")))
						{
							System.out.println("Login success");
							x=1;
						}
						else
						{
							System.out.println("Sai Mat Khau");
						}
					}
				}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			
		}while(x==0);
		
		
		int c;
		do
		{
			System.out.println("---CHUC NANG---");
			System.out.println("1.INSERT");
			System.out.println("2.UPDATE");
			System.out.println("3.DELETE");
			System.out.println("4.EXIT");
			System.out.println("Choice: ");c = o.nextInt();
			
			switch(c)
			{
			
			case 1:
			{
				Test_Insert a = new Test_Insert();
				a.InsertDatabase();
			}break;
			
			case 2:
			{
				Test_Update a = new Test_Update();
				a.UpdateDatabase();
			}break;
			
			case 3:
			{
				Test_Delete a = new Test_Delete();
				a.DeleteDatabase();
			}break;
			
			}//switch
			
		}while(c > 0 && c < 4);
		
		
		
	}

}
