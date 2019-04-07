 package kethua_inheritance;

import java.util.Scanner;

public class StandardStudent extends Student
{
	int EngMark;
	public StandardStudent()
	{
		super();//goi len class cha
	}
	
	
	public StandardStudent(int rollNo, String name, int EngMark)
	{
		super(rollNo, name);//goi class cha cung cap thong tin cho no
		this.EngMark = EngMark;
	}
	
	
	@Override//xac nhan viec ghi de len class cha
	public void Nhap()
	{
		super.Nhap();//goi len ham cha de thuc hien nhap rollNo va name
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap EngMark");
		this.EngMark = sc.nextInt();
	}
	@Override
	public void xuat()
	{
		System.out.println("rollNo\t" + this.rollNo + "\t" + "Name" + "\t" + this.name + "\tEngMark \t" + this.EngMark);
	}
}
