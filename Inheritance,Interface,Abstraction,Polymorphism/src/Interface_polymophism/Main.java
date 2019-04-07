package Interface_polymophism;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Manager x = new Manager();
		int choice;
		Scanner o = new Scanner(System.in);
		do {
			System.out.println("--CHUC NANG--");
			System.out.println("1.AddThanhvien");
			System.out.println("2.AddVangLai");
			System.out.println("3.xuat toan bo danh sach");
			System.out.println("4.exit");

			System.out.print("choice: ");
			choice = o.nextInt();

			switch (choice) {
			case 1:
				x.AddThanhVien();
				break;
			case 2:
				x.AddVangLai();
				break;
			case 3:
				x.output();
				break;
			}
		} while (choice > 0 && choice < 4);
	}

}
