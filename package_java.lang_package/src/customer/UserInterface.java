package customer;

import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		CDCreator user = new CDCreator();

		StringBuffer sb = new StringBuffer("Chao Quan Ly");
		System.out.println(sb);
		Scanner o = new Scanner(System.in);
		int chon;

		do {
			System.out.println("\n--Chon chuc nang--\n");
			System.out.println("1. Add CD");
			System.out.println("2. Add VCD");
			System.out.println("3. Show (CD)");
			System.out.println("4. Show (VCD)");
			System.out.println("5.EXIT");
			System.out.print("chon: ");
			chon = o.nextInt();
			System.out.println("\n---------------");
			switch (chon) {

			case 1: {
				user.addCD();
				break;
			}
			case 2: {
				user.addVCD();
				break;
			}
			case 3: {
				user.displayAllMusic();
				break;
			}
			case 4: {
				user.displayAllMovie();
				break;
			}
			}
		} while (chon != 5);

		System.out.print("HEN GAP LAI");
	}

}
