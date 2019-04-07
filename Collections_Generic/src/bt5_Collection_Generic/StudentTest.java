package bt5_Collection_Generic;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		StudentImplement<String, Student> control = new StudentImplement<>();

		Scanner z = new Scanner(System.in);
		int c;
		do {
			System.out.println("-NENU-");
			System.out.println("1.Dang Ky hoc sinh");
			System.out.println("2. Hien danh sach hoc sinh");
			System.out.println("3. Find");
			System.out.println("4.Exit");
			System.out.println("choice: ");
			c = z.nextInt();

			switch (c) {
			case 1: {
				Student a = new Student();
				a.nhap();
				boolean x = control.Add(a.getStuID(), a);
				if(x == true) {
					System.out.println("Tao Thanh Cong");
				}else {
					System.out.println("Tao Khong Thanh Cong");
				}
			}
				break;

			case 2: {
				control.displayAll();
			}
				break;

			case 3: {
				z = new Scanner(System.in);
				System.out.println("nhap ID can tim: ");
				String ID = z.nextLine();
				control.find(ID);
			}
				break;

			case 4:
				return;
			}
		} while (true);
	}

}
