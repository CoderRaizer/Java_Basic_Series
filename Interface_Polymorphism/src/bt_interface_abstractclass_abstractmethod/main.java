package bt_interface_abstractclass_abstractmethod;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Circle a = new Circle();
		Scanner sr = new Scanner(System.in);
		int c;
		do {

			System.out.println(
					"1. Tao hinh tron\n2. Di chuyen hinh tron\n3. Ve hinh tron\n4. Tinh dien tich hinh tron\n5. Thoat");
			c = sr.nextInt();
			switch (c) {
			case 1:
				a.draw();
				break;
			case 2:
				a.dichuyen();// a goi duoc ham dichuyen la do no ke thua tu class cha no la Point
				a.area();
				break;
			case 3:
				a.xuat();
				a.area();
				break;
			case 4:
				a.xuat();
				a.area();
				break;
			case 5:
				break;
			}
		} while (c > 0 && c < 5);
	}

}
