package Interface_Abstract;

import java.util.Scanner;

public abstract class Point {
	int x;
	int y;

	public Point() {
		this.x = 0;
		this.y = 0;
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void move(int dx, int dy) {
		this.x = x + dx;
		this.y = y + dy;
	}

	public void nhaptoado() {
		Scanner o = new Scanner(System.in);
		System.out.print("x: ");
		this.x = o.nextInt();
		System.out.print("y: ");
		this.y = o.nextInt();
	}

	public void xuat() {
		System.out.println("(" + x + "," + y + ")");
	}

	public abstract void draw();// Class Abstract thì phải có ít nhất một phương thức abstract
}
