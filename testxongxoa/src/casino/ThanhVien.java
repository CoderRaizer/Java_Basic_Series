package casino;

import java.util.Scanner;

public class ThanhVien extends Khach
{
	int Vip;
	int tiLeThuong;

	public ThanhVien()
	{
		super();
		this.Vip = 0;
		this.tiLeThuong = 0;
	}

	public ThanhVien(int passport, String name, int betMoney, int Vip, int tiLeThuong) {
		super(passport, name, betMoney);
		this.Vip = Vip;
		this.tiLeThuong = tiLeThuong;
	}

	Scanner sr = new Scanner(System.in);
	
	
	
	@Override
	public void input()//ghi de them cac thuoc tinh cua ThanhVien
	{
		super.input();
		System.out.println("Nhap Vip : ");
		this.Vip = sr.nextInt();
		System.out.println("Nhap ti le thuong : ");
		this.tiLeThuong = sr.nextInt();
	}
	
	
	@Override
	public void output()//ghi de in ra them cac thuoc tinh cua no
	{
		System.out.println("MEMBER");
		super.output();
		System.out.println("Vip : "+this.Vip);
		System.out.println("Ti le thuong : "+this.tiLeThuong);
	}
	
	
	@Override
	public void tinhtienthang()
	{
		System.out.println("Tien thang cuoc la : "+this.tiencuoc*this.tiLeThuong);//tien thang cuoc cua thanh vien bang tien cuoc x ti le thuong
	}

}
