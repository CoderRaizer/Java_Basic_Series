package music;

import java.util.Scanner;

public class CompactDisc
{
	private String title;
	private String artist;
	private double price;
	private int code;
	
	
	Scanner o = new Scanner(System.in);
	
	public CompactDisc()
	{
		
	}
	
//	public CompactDisc(String title,String artist,double price,int code)
//	{
//		this.title = title;
//		this.artist = artist;
//		this.price = price;
//		this.code = code;
//	}
	
	//neu dong nay xuat hien thi 52/CDCreator se can tham so truyen vao,nen CDCreator se tao mot ham nhap roi nen du lieu vao
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	public String getTitle()
	{
		return this.title;
	}
	
	public void setArtist(String artist)
	{
		this.artist = artist;
	}
	public String getArtist()
	{
		return this.artist;
	}
	
	public void setPrice(double Price)
	{
		this.price = price;
	}
	public double getPrice()
	{
		return this.price;
	}
	
	
	public void setCode(int code)
	{
		this.code = code;
	}
	public int getCode()
	{
		return this.code;
	}
	
	
	public void nhapCD()
	{
		System.out.print("nhap title: ");
		this.title = o.nextLine();
		
		o = new Scanner(System.in);
		
		System.out.print("nhap artist: ");
		this.artist = o.nextLine();
		
		System.out.print("nhap price: ");
		this.price = o.nextDouble();
		System.out.print("nhap code: ");
		this.code = o.nextInt();
	}
	
	public String toString()
	{
		return "title: "+this.title + "\tartist: "+this.artist+"\tprice: "+this.price+"\tcode: "+this.code;
	}
	
}
