package bt_interface_abstractclass_abstractmethod;

import java.util.Scanner;

public class Circle extends Point implements Shape {
	double r;
	String color;

	public Circle() {
		super();
		this.r = 0;
		this.color = "chua co";
	}

	public Circle(int dx, int dy, int dr, String color) {
		super(dx, dy);
		this.r = dr;
		this.color = color;

	}

	@Override
	public void area()// ghi de lai phuong thuc cua Shape
	{
		double S;
		S = pi * Math.pow(r, 2);
		System.out.println("dien tich: " + S);
	}


	public void xuat() {
		System.out.println("tam: " + "(" + this.x + "," + this.y + ")");
		System.out.println("ban kinh: " + this.r);
		System.out.println("mau sac: " + this.color);
	}
	
	
	@Override//lai ham ben class cha no la Point
	public void draw()// ghi de lai phuong thuc cua Point
	{
		Scanner sr = new Scanner(System.in);
		
		super.nhap();// goi ham nhap x,y co san trong class cha la Point
		System.out.print("Nhap ban kinh: ");
		r = sr.nextDouble();
		sr = new Scanner(System.in);
		System.out.print("Nhap color: ");
		color = sr.nextLine();
	}

}