package Interface_Abstract;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {

		Circle p = new Circle();
		int choice;
		Scanner o = new Scanner(System.in);
		do {
			System.out.println("cac chuc nang");
			System.out.println("1.tao hinh tron");
			System.out.println("2.di chuyen hinh tron");
			System.out.println("3.ve hinh tron");
			System.out.println("4.dien tich hinh tron");
			System.out.println("5.exit");
			System.out.println("choice: ");
			choice = o.nextInt();

			switch (choice) {
			case 1:
				p.vehinhtron();
				break;

			case 2: {
				int u;
				do {
					System.out.println("1.len");
					System.out.println("2.xuong");
					System.out.println("3.trai");
					System.out.println("4.phai");
					System.out.print("u: ");
					u = o.nextInt();
					if (u == 1) {
						int i;
						System.out.println("i : ");
						i = o.nextInt();
						p.move(0, i);// do Circle ke thua tu ham point nen goi ham move duoc
					}
					if (u == 2) {
						int i;
						System.out.println("i : ");
						i = o.nextInt();
						p.move(0, i);// do Circle ke thua tu ham point nen goi ham move duoc
					}
					if (u == 3) {
						int i;
						System.out.println("i : ");
						i = o.nextInt();// nhap so am tuong uong
						p.move(i, 0);// do Circle ke thua tu ham point nen goi ham move duoc
					}
					if (u == 4) {
						int i;
						System.out.println("i : ");
						i = o.nextInt();// nhap so am tuong uong
						p.move(i, 0);// do Circle ke thua tu ham point nen goi ham move duoc
					}

				} while (u > 0 && u < 5);
				break;
			}

			case 3:
				p.draw();
				break;

			case 4:
				p.area();

			}
		} while (choice > 0 && choice < 5);

		System.out.println("--CLOSE PROGRAM--");
	}

}
