package bt6_Collection_Generic;

import java.util.Scanner;

public class MainBook
{

	public static void main(String[] args)
	{
Scanner q = new Scanner(System.in);
		
		BookManager<String, Book> mn_book = new BookManager<>();
		
		int choice;
		do
		{
			System.out.println("1.Nhap 1 quyen sach");
			System.out.println("2.Xuat danh sach cac quyen sach");
			System.out.println("3.Dem so sach dang co");
			System.out.println("choice: ");choice = q.nextInt();
			
			switch(choice)
			{
			case 1:
			{
				Book newbook = new Book();
				newbook.nhap();
				mn_book.add(newbook.getBookID(),newbook);
			}break;
			
			case 2:
			{
				mn_book.displayAll();
			}break;
			
			case 3:
			{
				System.out.println("tong so sach co trong booklist: "+mn_book.dem);
			}break;
			
			case 4: return;
			}
		}while(true);
	}

}
