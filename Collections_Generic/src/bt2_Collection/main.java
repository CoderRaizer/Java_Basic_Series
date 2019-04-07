package bt2_Collection;

import java.util.Scanner;

public class main {

	public static void main() {
		MobileControl m = new MobileControl();

		int choice;
		Scanner o = new Scanner(System.in);
		do {

			System.out.println("--menu--");
			System.out.println("1.them 1 dien thoai");
			System.out.println("2.xoa mot dien thoai");
			System.out.println("3.ShowAll");
			System.out.println("4.Exit");
			System.out.print("choice: ");
			choice = o.nextInt();

			switch (choice) {
			case 1:
				m.AddMobiles();
				break;

			case 2: {
				o = new Scanner(System.in);
				String idxoa;
				System.out.println("moi ban nhap ma so dt can xoa: ");
				idxoa = o.nextLine();
				m.deleteMobile(idxoa);
			}
				break;

			case 3:
				m.displayAll();
				break;

			case 4:
				System.out.println("--KET THUC--");
				break;
			}

		} while (choice > 0 && choice < 4);
	}

}
