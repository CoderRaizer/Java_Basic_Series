package TestConnection;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
//import java.sql.*;//dong nay la lay toan bo cac goi co trong java.sql,co dong nay cac dong tren khong can


public class InsertValues
{
	public static void main(String[] args)
	{
		Scanner o = new Scanner(System.in);
		
		
		
		MyConnect cn = new MyConnect();
		
		Connection con = cn.getcn();
		
		String IDCusInput = null;
		String UsernameInput=null;
		String PasswordInput=null;
		String EmailInput=null;
		String RoleInput=null;
		
		System.out.print("Insert IDCus: ");
		IDCusInput = o.nextLine();
		System.out.print("Insert Username: ");
		UsernameInput = o.nextLine();
		System.out.print("Insert Password: ");
		PasswordInput = o.nextLine();
		System.out.print("Insert Email: ");
		EmailInput = o.nextLine();
		System.out.print("Insert Role: ");
		RoleInput = o.nextLine();
		
		
		String sql="INSERT Customer VALUES(?,?,?,?,?)";
		
		//Kiem tra Username trung lap
		String kt="select Username from Customer where Username=?";//kt la kiem tra
		
		try
		{
			
			PreparedStatement ps2 = con.prepareStatement(kt);
			ps2.setString(1,UsernameInput);
			ResultSet rs = ps2.executeQuery();
			
			if(rs.next())
			{
				System.out.println("Username TRUNG LAP");
			}
			
			else
			{
				PreparedStatement ps3 = con.prepareStatement(sql);
				
				ps3.setString(1,IDCusInput);//dua vao gia tri theo thu tu trung khop voi cac dau hoi
				ps3.setString(2,UsernameInput);
				ps3.setString(3,PasswordInput);
				ps3.setString(4,EmailInput);
				ps3.setString(5,RoleInput);
				
				
				int kq = ps3.executeUpdate();//executeUpdate() tra ve kieu int --dung cho Insert,update,delete
				if(kq!=0)
				{
					System.out.println("INSERT SUCCESS");
				}
				else
				{
					System.out.println("INSERT FAIL");
				}
			}
			
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
}
