package baitap_Exceptions;

import java.util.Scanner;

public class BankTest
{

	public static void main(String[] args)
	{
		Scanner o = new Scanner(System.in);
		Bank bank = new Bank();
		
		int choice;
		do
		{
			System.out.println("---MENU---");
			System.out.println("1.Tao moi mot tai khoan");
			System.out.println("2.Gui tien");
			System.out.println("3.Rut tien");
			System.out.println("4.Show All Account");
			System.out.println("5.Exit");
			
			System.out.print("choice: ");choice = o.nextInt();
			
			switch (choice)
			{
			case 1: bank.createAccount();break;
			
			case 2: bank.deposit();break;
			
			case 3: bank.withdraw();break;
			
			case 4: bank.display();break;
			
			}
			if(choice == 5)System.out.println("--KETHUC--");
		}while(choice > 0 && choice < 5);
		
		
	}

}
