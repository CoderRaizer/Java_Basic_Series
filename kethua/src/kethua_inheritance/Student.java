package kethua_inheritance;

import java.util.Scanner;

public class Student
{
	int rollNo;
	String name;
	
	public void setRollNo(int rollNo)
	{
		this.rollNo = rollNo;
	}
	public int getRollNo()
	{
		return rollNo;
	}
	
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	
	public Student()
	{
		//phai co cai nay de class con goi len cha
	}
	
	public Student(int rollNo, String name)
	{
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public void Nhap()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap rollNo");
		this.rollNo = sc.nextInt();
		
		sc = new Scanner(System.in);
		
		System.out.println(" Nhap name");
		this.name = sc.nextLine();
	}
	
	
	public void xuat()
	{
		System.out.println("rollNo\t" + this.rollNo + "\t" + "Name" + "\t" + this.name);
	}
	
	
}
