package customer;

import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args)
	{
		CDCreator user = new CDCreator();
		
		Scanner o = new Scanner(System.in);
		int chon;
		
		do
		{
			System.out.println("\n--Chon chuc nang--\n");
			System.out.println("1. Show (CD)");
			System.out.println("2. Show (VCD)");
			System.out.println("3. Add CD");
			System.out.println("4. Add VCD");
			System.out.println("5.EXIT");
			System.out.print("chon: ");
			chon = o.nextInt();
			System.out.println("\n---------------");
			switch(chon)
			{
			case 1:
			{
				user.displayAllMusic();break;
			}
			case 2:
			{
				user.displayAllMovie();break;
			}
			case 3:
			{
				user.addCD();break;
			}
			case 4:
			{
				user.addVCD();break;
			}
			
			case 5:break;
			}
		}while(chon != 5);
		
		
		
		System.out.print("HEN GAP LAI");
	}

}
