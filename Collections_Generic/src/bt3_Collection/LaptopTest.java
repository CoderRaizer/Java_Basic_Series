package bt3_Collection;

import java.util.Scanner;

public class LaptopTest
{

	public static void main(String[] args)
	{
		Laptop a=new Laptop();
		LaptopManagement manalaptop = new LaptopManagement();
		
		int choice;
		Scanner o = new Scanner(System.in);
		do
		{
			System.out.println("--menu--");
			System.out.println("1.them Laptop");
			System.out.println("2.Tim thong tin theo id");
			System.out.println("3.Xuat laptop tang dan theo id");
			System.out.println("4.EXit");
			System.out.print("choice: ");choice = o.nextInt();
			
			switch(choice)
			{
			case 1:
				{
					manalaptop.add();break;
				}
			case 2:
			{
				String id;
				o = new Scanner(System.in);
				System.out.println("please enter id you need: ");id = o.nextLine();
				manalaptop.search(id);

			}break;
			
			case 3:manalaptop.displaytangdan();break;
			case 4: return;
			}
		}while(choice > 0 && choice < 4);
		
		
	}

}
