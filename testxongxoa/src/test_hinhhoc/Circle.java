package test_hinhhoc;

import java.util.Scanner;

public class Circle implements Shape
{
	int r;
	
	
	public Circle()
	{
		
	}
	
	public Circle(int r)
	{
		this.r = r;
	}
	
	public void nhap()
	{
		Scanner o = new Scanner(System.in);
		System.out.print("radius: ");
		this.r = o.nextInt();
	}
	
	public void xuat()
	{
		System.out.println("Hinh tron co ban kinh: "+this.r);
	}
	
	
	
	@Override
	public void ShowArea()
	{
		System.out.print("chuvi: "+(double)this.r*2*3.14);
	}

}
