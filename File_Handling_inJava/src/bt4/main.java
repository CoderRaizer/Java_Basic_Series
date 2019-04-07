package bt4;

import java.io.FileOutputStream;
import java.util.Scanner;

public class main
{
	public static void main(String[] args) throws ClassNotFoundException//Đối tượng con của class Exception (Nếu không tìm thấy file thì ném ra 1 đối tượng)
	{
		Scanner o = new Scanner(System.in);
		ManagerBook booknew = new ManagerBook();
		
		System.out.println("nhap id: ");String id = o.nextLine();
		o = new Scanner(System.in);
		System.out.println("nhap tac gia: ");String tg = o.nextLine();
		Book b = new Book(id,tg);
		booknew.ghiObject(b);
		booknew.docObject();
	}
}
