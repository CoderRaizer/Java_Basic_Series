package test_kethua;

import java.util.Scanner;

public class PremiumStudent extends Student
{
	int mathMark;
	public PremiumStudent()
	{
		super();//goi len class cha
	}
	
	public PremiumStudent(int rollNo, String name, int mathMark)
	{
		super(rollNo, name);
		this.mathMark = mathMark;
	}
	@Override//xac nhan viec ghi de len class cha
	public void Nhap()
	{
		super.Nhap();//goi len ham cha de thuc hien viec nhap rollNo va name
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap mathMark");
		this.mathMark = sc.nextInt();
	}
	@Override
	public void xuat()
	{
		System.out.println("rollNo\t" + this.rollNo + "\t" + "Name" + "\t" + this.name + "\tmathMark\t" + this.mathMark);
	}
}
