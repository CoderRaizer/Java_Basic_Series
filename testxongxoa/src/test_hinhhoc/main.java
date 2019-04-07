package test_hinhhoc;

import java.util.Scanner;

public class main {

	public static void main(String[] args)
	{
		ShapeCollection a= new ShapeCollection();
		int choice;
		
		do
		{
			
			Scanner o = new Scanner(System.in);
			System.out.println("-MENU-");
			System.out.println("1.them hinh tron");
			System.out.println("2.them hinh chu nhat");
			System.out.println("3.xuat toan bo thong tin hinh hoc");
			System.out.println("4.thoat");
			System.out.println("choice: ");choice = o.nextInt();
			
			
			
			
			switch(choice)
			{
			case 1:a.AddCricle();break;
			
			case 2:a.AddRectangle();break;
			
			
			case 3:
			
			case 4:break;
			}
		}while(choice > 0 && choice < 5);
		
		
		
	}

}
