package test_kethua;

import java.util.Scanner;

public class main_kethua
{

	public static void main(String[] args)
	{
		StandardStudent a = new StandardStudent();
		PremiumStudent b = new PremiumStudent();
		int x ;
		Scanner o = new Scanner(System.in);
		
		do{
			System.out.println("1: nhap thong tin sinh vien a");
			System.out.println("2: nhap thong tin sinh vien b");
			System.out.println("3: xuat thong tin sinh vien a");
			System.out.println("4: xuat thong tin sinh vien b");
			System.out.println("5: thoat");
			
			x= o.nextInt();
			if(x==1)
				a.Nhap();
			else if(x==2)
				b.Nhap();
			else if(x==3)
				a.xuat();
			else if(x==4)
				b.xuat();
			else if(x==5)
				break;
			else
				System.out.println("Chon lai");
		}while(x !=5);
		
	}
}
