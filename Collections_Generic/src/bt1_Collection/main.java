package bt1_Collection;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Manager a = new Manager();
		int x;
		Scanner o = new Scanner(System.in);

		do {
			System.out.println("--menu--");
			System.out.println("1.them san pham");
			System.out.println("2.tim kiem sp theo ma so");
			System.out.println("3.cac san pham co gia tri cao");
			System.out.println("4.Delete");
			System.out.print("choice: ");
			x = o.nextInt();

			switch (x) {
			case 1: {
				a.addProduct();
				break;
			}

			case 2: {
				o = new Scanner(System.in);
				String maso;
				System.out.println("moi ban nhap ma so sp can tim: ");
				maso = o.nextLine();

				boolean xet;
				xet = a.searchByID(maso);
				if (xet == true) {
					a.show1Product();
				} else {
					System.out.println("khong co san pham nao khop voi tim kiem");
				}
			}
				break;

			case 3:
				a.displayHighValua();
				break;

			case 4:
				a.displayAll();
				break;
			}
		} while (true);

	}

}
