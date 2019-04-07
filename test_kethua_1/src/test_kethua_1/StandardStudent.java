package test_kethua_1;

import java.util.Scanner;

public class StandardStudent extends Student
{
	int diemtoan;
	
	Scanner o = new Scanner(System.in);
	
	public StandardStudent(int rollNo , String name ,int diemtoan)
	{
		super(rollNo,name);
		this.diemtoan = diemtoan;
	}
	
	@Override
	public void nhapSV()
	{
		super.nhapSV();
	}
}
