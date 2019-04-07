package bt5;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner o = new Scanner(System.in);

		Manager v = new Manager();

		int choice;

		do {
			System.out.println("--MENU--");
			System.out.println("1.Them Sinh Vien");
			System.out.println("2.Tim Sinh Vien");
			System.out.println("3.So luong Sinh Vien");
			System.out.println("4.Xoa 1 Sinh Vien");
			System.out.println("5.Xuat theo lop hoc");
			System.out.println("6.displayAll");
			System.out.println("7.Sua thong tin");
			System.out.println("8.EXIT");
			System.out.println("choice: ");
			choice = o.nextInt();

			switch (choice) {
			case 1: {
				v.add();
			}
				break;

			case 2: {
				v.find();
			}
				break;

			case 3: {
				System.out.println("so luong sinh vien: " + v.list.size());
			}
				break;

			case 4: {
				v.xoa();
			}
				break;

			case 5: {
				v.displaylophoc();
			}
				break;

			case 6:
				v.displayAll();
				break;

			case 7: {
				v.suathongtin();
			}
				break;

			case 8:
				return;
			}

		} while (true);
	}

}
