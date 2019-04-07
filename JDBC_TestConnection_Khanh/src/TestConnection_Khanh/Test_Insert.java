package TestConnection_Khanh;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Test_Insert
{
	
	Scanner o = new Scanner(System.in);
	
	MyConnect cn = new MyConnect();
	
	Connection con = cn.getcn();
	
	int IDInput;
	String TendangnhapInput = null;
	String MatkhauInput = null;
	String EmailInput = null;
	String RoleInput = null;
	
	
	
	
	
	public void InsertDatabase()
	{
		System.out.print("Nhap IDInput: ");this.IDInput = o.nextInt();o=new Scanner(System.in);
		System.out.print("Nhap TendangnhapInput: ");this.TendangnhapInput = o.nextLine();o=new Scanner(System.in);
		System.out.print("Nhap MatKhauInput: ");this.MatkhauInput = o.nextLine();o=new Scanner(System.in);
		System.out.print("Nhap EmailInput: ");this.EmailInput = o.nextLine();o=new Scanner(System.in);
		System.out.print("Nhap RoleInput: ");this.RoleInput = o.nextLine();o=new Scanner(System.in);
		
		
		String sql = "INSERT INTO ADMIN VALUES (?,?,?,?,?)";
		String kiemtra = "SELECT Tendangnhap FROM ADMIN WHERE Tendangnhap = ?";
		try
		{
			PreparedStatement ps = con.prepareStatement(kiemtra);
			ps.setString(1,TendangnhapInput);
			ResultSet rs = ps.executeQuery();
			if(rs.next())//Kiem tra su ton tai nen dung if
			{
				System.out.println("DA TON TAI TENDANGNHAP");
			}
			else
			{
				PreparedStatement ps1 = con.prepareStatement(sql);
				ps1.setInt(1,IDInput);
				ps1.setString(2,TendangnhapInput);
				ps1.setString(3,MatkhauInput);
				ps1.setString(4,EmailInput);
				ps1.setString(5,RoleInput);
				int kq = ps1.executeUpdate();
				if(kq!=0)
				{
					System.out.println("INSERT THANH CONG");
				}
			}
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	
}
