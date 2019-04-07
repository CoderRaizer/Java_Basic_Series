package model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.Part;

import controller.MyConnect;
import entities.Product;

public class ProductModel
{
	Product sanpham;
	Part file;//line 3
	
	public ProductModel()
	{
		
	}
	
	public ProductModel(Product sanpham)
	{
		this.sanpham = sanpham;
	}
	
	public ProductModel(Part file)
	{
		this.file = file;
	}
	
	public ArrayList<Product> getList()
	{
		ArrayList<Product> list = new ArrayList<>();
		Connection cn = new MyConnect().getcn();
		if(cn==null)
		{
			return null;
		}
		
		try
		{
			String sql = "Select * From SANPHAM";
			PreparedStatement ps = cn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				Product temp = new Product(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getInt(5));
				list.add(temp);
			}
			ps.close();
			rs.close();
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		return list;
	}
	
	
	
	public Product getProductByMasp(String masp)
	{
		Connection cn = new MyConnect().getcn();
		Product pro = null;
		
		if(cn==null)
		{
			return null;
		}
		
		try
		{
			String sql = "Select * From SANPHAM where masp=?";
			PreparedStatement ps = cn.prepareStatement(sql);
			ps.setString(1,masp);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
			{
				pro = new Product(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getInt(5));
			}
			ps.close();
			cn.close();
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		return pro;
	}
	
	
	public String getFileName(Part filepart)
	{
		String filename="";
		String header = filepart.getHeader("Content-Disposition");
		//System.out.println("header: "+header);
		int beginIndex = header.lastIndexOf("=");
		filename = header.substring(beginIndex+1);
		
		//remove "" qoute 2 dau cuoi
		Pattern p = Pattern.compile("\"([^\"]*)\"");
		Matcher m = p.matcher(filename);
		while(m.find())
			filename = m.group(1);
		
		//danh cho IE
		beginIndex = filename.lastIndexOf("\\");
		filename = filename.substring(beginIndex+1);
		//System.out.println("filename: "+filename);
		
		return filename;
	}
	
	
	public void uploadFile(String uploadRootPath)
	{
		try
		{
			InputStream fis = file.getInputStream();
			byte[] data = new byte[fis.available()];
			fis.read(data);
			
			FileOutputStream out = new FileOutputStream(new File(uploadRootPath + "\\"+getFileName(file)));
			out.write(data);
			out.close();
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
			System.out.println("THAT BAI");
		}
		System.out.println("THANH CONG");
	}
	
	
	
	public int insertProduct(String masp,String tensp,int gia,String hinh,int madm)
	{
		int kq = 0;
		Connection cn = new MyConnect().getcn();
		if(cn==null)
			return 0;
		
		try
		{
			String sql = "Insert into SANPHAM values(?,?,?,?,?)";
			PreparedStatement ps = cn.prepareStatement(sql);
			ps.setString(1,masp);
			ps.setString(2,tensp);
			ps.setInt(3,gia);
			ps.setString(4,hinh);
			ps.setInt(5,madm);
			kq = ps.executeUpdate();
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		return kq;
	}
	
	

	public Boolean checkcontain(String masp)
	{
		Boolean flag=false;
		Connection cn = new MyConnect().getcn();
		if(cn==null)
		{
			return false;
		}
		try
		{
			String sql = "select * from SANPHAM where MASP like ?";
			PreparedStatement ps = cn.prepareStatement(sql);
			ps.setString(1, masp);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				flag=true;
			}else
			{
				flag=false;
			}
		}catch(SQLException ex )
		{
			System.out.println(ex.getMessage());
		}
		return flag;
	}
	
	
	public int updateProduct(String masp,String tensp,int gia,String hinh,int madm)
	{
		int kq=0;
		Connection cn = new MyConnect().getcn();
		if(cn==null)
		{
			return 0;
		}
		try
		{
			String sql= "update SANPHAM set TENSP = ?,GIA = ?,HINH = ?,MADM= ? WHERE MASP = ?";
			PreparedStatement ps = cn.prepareStatement(sql);
			ps.setString(1,tensp);
			ps.setInt(2, gia);
			ps.setString(3, hinh);
			ps.setInt(4, madm);
			ps.setString(5, masp);
			kq=ps.executeUpdate();
		}
		catch(SQLException ex)
		{
			System.out.println(ex.getMessage());
		}
		return kq;
	}
	
	
	
	
	public void findFile(String name,File file)
    {
        File[] list = file.listFiles();
        if(list!=null)
        for (File fil : list)
        {
            if (fil.isDirectory())
            {
                findFile(name,fil);
            }
            else if (name.equalsIgnoreCase(fil.getName()))
            {
                System.out.println(fil.getParentFile());
            }
        }
    }
	
}
