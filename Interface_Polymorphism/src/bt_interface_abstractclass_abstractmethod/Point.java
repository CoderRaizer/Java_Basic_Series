package bt_interface_abstractclass_abstractmethod;

import java.util.Scanner;

public abstract class Point {
	int x, y;

	public Point() {
		this.x = 0;
		this.y = 0;
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void move(int dx, int dy) {
		this.x = dx;
		this.y = dy;
	}

	public void nhap() {
		Scanner sr = new Scanner(System.in);
		System.out.print("Nhap x: ");
		this.x = sr.nextInt();
		System.out.print("Nhap y: ");
		this.y = sr.nextInt();
	}

	public void dichuyen() {
		Scanner sr = new Scanner(System.in);
		System.out.println("Di chuyen: \n1. Len tren\n2. Xuong duoi\n3. Sang phai\n4. Sang trai\n");
		int u = sr.nextInt();
		if (u == 1) {
			System.out.print("bao nhieu: ");
			int move = sr.nextInt();
			this.y = move + y;
		} else {
			if (u == 2) {
				System.out.print("bao nhieu: ");
				int move = sr.nextInt();
				this.y = y - move;
			} else {
				if (u == 3) {
					System.out.print("bao nhieu: ");
					int move = sr.nextInt();
					this.x = move + x;
				} else {
					System.out.print("bao nhieu: ");
					int move = sr.nextInt();
					this.x = x - move;
				}
			}
		}
	}

	public abstract void draw();// abstract 1 ham de class con Circle override
}
