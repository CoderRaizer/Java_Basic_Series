package Generic_Demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		int select;
		// Manage<String,Doctor> m = new Manage<>();
		Manage<Integer, Student> m = new Manage<>();
		Scanner sr = new Scanner(System.in);
		do {
			try {
				sr = new Scanner(System.in);
				System.out.println("1. Them SV.");
				System.out.println("2. Tim thong tin SV.");
				System.out.println("3. Xuat thong tin SV.");
				System.out.println("4. Thoat.");
				System.out.println("choice: ");
				select = sr.nextInt();
				if (select >= 1 && select <= 4) {
					switch (select) {
					case 1:
						Student a = new Student();
						a.input();
						m.addDoc(a.getMasv(), a);
						break;

					case 2:
						sr = new Scanner(System.in);
						System.out.println("Nhap ID can tim");
						Integer ID = sr.nextInt();
						m.SearchbyID(ID);
						break;
					case 3:
						m.displayAll();
						break;
					case 4:
						return;
					}
				} else {
					throw new Loi("Lua chon khong ton tai.");
				}
			} catch (InputMismatchException e) {
				System.out.println("Lua chon phai bang so.");
			} catch (Loi e) {
				System.out.println(e.getMessage());
			}
		} while (true);
	}

}
