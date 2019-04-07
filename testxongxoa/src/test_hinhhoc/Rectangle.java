package test_hinhhoc;

import java.util.Scanner;

public class Rectangle implements Shape
{
	int length;
	int width;
	
	public Rectangle()
	{
		
	}
	
	public Rectangle(int dai,int rong)
	{
		this.length = dai;
		this.width = rong;
	}
	
	
	
	
	public void nhap()
	{
		Scanner o = new Scanner(System.in);
		System.out.print("dai: ");this.length = o.nextInt();
		System.out.print("rong: ");this.width = o.nextInt();
		
	}
	
	public void xuat()
	{
		System.out.println("hinh chu nhat gom: dai-rong:"+this.length+"-"+this.width);
	}

	@Override
	public void ShowArea()
	{
		System.out.print("chuvi: "+(this.length+this.width)*2);
	}

}
