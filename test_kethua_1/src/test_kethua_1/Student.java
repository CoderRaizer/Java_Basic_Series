package test_kethua_1;

import java.util.Scanner;

public class Student
{
	int rollNo;
	String name;
	
	public Student()
	{
		
	}
	
	public Student(int rollNo,String name)
	{
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public void nhapSV()
	{
		Scanner o = new Scanner(System.in);
		System.out.print("Nhap RollNo: ");
		this.rollNo = o.nextInt();
		System.out.print("nhap name: ");
		this.name = o.nextLine();
	}
	
	
	public void xuatSV()
	{
		System.out.print("rollNo: "+this.rollNo);
		System.out.print("name: "+this.name);
	}
	
	
	
	
}
