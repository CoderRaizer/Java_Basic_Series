package demo_collection;

import java.util.Scanner;

public class main {

	public static void main() {
		ManagerStudent m = new ManagerStudent();
		int x;
		do {
			Scanner o = new Scanner(System.in);
			System.out.println("1.add student");
			System.out.println("2.show all");
			System.out.println("3.exit");

			System.out.println("x = ");
			x = o.nextInt();

			switch (x) {
			case 1:
				m.addStudent();
				break;

			case 2:
				m.showList();
				break;
			}
		} while (x > 0 && x < 3);
	}
}
