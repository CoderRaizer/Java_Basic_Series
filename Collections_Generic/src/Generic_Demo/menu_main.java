package Generic_Demo;
//khanh
import java.util.Scanner;

public class menu_main {

	public static void main(String[] args)
	{
		
		Scanner o = new Scanner(System.in);
		
		Manager<String,Doctor> bs = new Manager<>();
		Manager<Integer , Student> hs = new Manager<>();
		//Như vậy ta có thể thêm các đối tượng có thuộc tính khác nhau vài hash- treeMap đưa vào Generic trong class manager
		
		int select;
		do
		{
			int choice;
			System.out.println("CHON KIEU DOI TUONG TRIEN KHAI");
			System.out.println("1.STUDENT");
			System.out.println("2.DOCTOR"); 
			System.out.println("3.EXIT ALL");
			System.out.println("choice: ");select = o.nextInt();
			
			if(select == 1)
			{
				do
				{
					System.out.println("1.add-sv");
					System.out.println("2.find-sv");
					System.out.println("3.show-sv");
					System.out.println("4.exit");
					System.out.println("choice: ");choice = o.nextInt();
					
					switch(choice)
					{
					
					case 1:
					{
						Student a = new Student();
						a.input();
						hs.Addlist(a.getMasv(),a);
					}break;
					
					case 2:
					{
						System.out.println("nhap id can tim: ");
						o = new Scanner(System.in);
						int ma= o.nextInt();
						hs.find(ma);
					}break;
					
					case 3:
					{
						hs.showAll();
					}
					}
					}while(choice < 4);
				}//student
			
			
			if(select == 2)
			{
				do
				{
					System.out.println("1.add-doctor");
					System.out.println("2.find-doctor");
					System.out.println("3.show-doctor");
					System.out.println("4.exit");
					System.out.println("choice: ");choice = o.nextInt();
					
					switch(choice)
					{
					
					case 1:
					{
						Doctor a = new Doctor();
						a.nhap();
						bs.Addlist(a.getId(),a);
					}break;
					
					case 2:
					{
						System.out.println("nhap id can tim: ");
						o = new Scanner(System.in);
						String ma= o.nextLine();
						bs.find(ma);
					}break;
					
					case 3:
					{
						bs.showAll();
					}
					}
			}while(choice < 4);
		}
			
			
		}while(select==1||select==2);


	}

}


//System.out.println("1.add");
//System.out.println("2.find");
//System.out.println("3.show");
//System.out.println("4.exit");
//System.out.println("choice: ");choice = o.nextInt();
//
//switch(choice)
//{
//
//case 1:
//{
//	Student a = new Student();
//	a.input();
//	hs.Addlist(a.getMasv(),a);
//}break;
//
//case 2:
//{
//	System.out.println("nhap id can tim: ");
//	o = new Scanner(System.in);
//	int ma= o.nextInt();
//	hs.find(ma);
//}break;
//
//case 3:
//{
//	hs.showAll();
//}
//}
//}while(true);