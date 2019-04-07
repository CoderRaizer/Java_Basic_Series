package Runtime_demo;

import java.util.Scanner;

public class RuntimeDemo {

	public static void main(String[] args)
	{
		Scanner o = new Scanner(System.in);
		Runtime r = Runtime.getRuntime();
		Process p = null;
		
		int choice;
		do
		{
			System.out.println("1.calculator");
			System.out.println("2.notepad");
			System.out.println("3.mspaint");
			System.out.println("4.exit");
			System.out.print("choice: ");
			choice=o.nextInt();
			
		}while( choice !=1 && choice != 2 && choice != 3 && choice != 4);
		
		
		switch (choice)
			{
				case 1:
				{
					try
					{
						p = r.exec("calc.exe");
					}
					catch(Exception e)
					{
						System.out.println("Error executing calculator");
					}break;
				}
		
				case 2:
				{
					try
					{
						p = r.exec("notepad.exe");
					}
					catch(Exception e)
					{
						System.out.println("Error executing calculator");
					}break;
				}
		
		
				case 3:
				{
					try
					{
						p = r.exec("mspaint.exe");
					}
					catch(Exception e)
					{
						System.out.println("Error executing calculator");
					}break;
				}
		
				case 4:
				{
					System.out.println("CHUONG TRINH KET THUC");
				}break;
			}
	}
}
