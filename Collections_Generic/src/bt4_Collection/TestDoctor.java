package bt4_Collection;

import java.util.Scanner;

public class TestDoctor
{

	public static void main(String[] args)
	{
		Scanner o =new Scanner(System.in);
		
		DoctorManager<String,Doctor> control = new DoctorManager<>();
		int x;
		do
		{
			System.out.println("--MENU--");
			System.out.println("1.Dang Ky Bac Si");
			System.out.println("2.Tim Kiem Bac Si");
			System.out.println("3.ShowAll");
			System.out.println("4.Exit");
			System.out.println("choice: ");x= o.nextInt();
			
			switch(x)
			{
				case 1: 
				{
					Doctor a=new Doctor();
					a.nhap();
					control.AddDoctor(a.getId(),a);
				}break;
			
				case 2:
				{
					o = new Scanner(System.in);
					String ID;
					System.out.println("nhap ID Doctor can tim: ");ID = o.nextLine();
					control.find(ID);
				}break;
			
				case 3: control.showAll();break;
			
				case 4:return;
			}
		}while(true);
	}
}
