package casino;

import java.util.Scanner;

public abstract class Khach
{
	int passport;
	String name;
	int tiencuoc;
	
	Scanner o = new Scanner(System.in);
	
	
	public Khach()
	{
		this.name = "";
		this.tiencuoc = 0;
		this.passport = 0;
	}
	
	
	public Khach(int passport, String name, int tiencuoc)
	{
		// TODO Auto-generated constructor stub
		this.tiencuoc = tiencuoc;
		this.name = name;
		this.passport = passport;
	}

	public void input()//cac ham o cac class con van can cac thuoc tinh o class nay nen cac ham do phai ghi de them cac phuong thuc khac
	{
		System.out.println("Nhap ten : ");
		this.name = o.nextLine();
		System.out.println("Nhap passport : ");
		this.passport = o.nextInt();
		System.out.println("Nhap tien cuoc : ");
		this.tiencuoc = o.nextInt();
	}
	
	
	public void output()
	{
		System.out.println("Ten : "+this.name);
		System.out.println("Passport : "+this.passport);
		System.out.println("Tiencuoc : "+this.tiencuoc);
	}
	
	
	public abstract void tinhtienthang();//ham ke thua no phai ghi de lai ham nay
}
