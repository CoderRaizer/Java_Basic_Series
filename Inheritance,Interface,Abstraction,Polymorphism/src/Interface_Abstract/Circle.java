package Interface_Abstract;

import java.util.Scanner;

public class Circle extends Point implements Shape {
	double r;
	String color;

	public Circle() {

	}

	public void vehinhtron() {
		super.nhaptoado();
		Scanner o = new Scanner(System.in);
		System.out.print("r: ");
		this.r = o.nextDouble();
		o = new Scanner(System.in);
		System.out.print("color: ");
		this.color = o.nextLine();
	}

	@Override
	public void draw() {
		super.xuat();
		System.out.println("r: " + this.r);
		System.out.println("color: " + this.color);
	}

	@Override
	public void area() {
		double s;
		s = pi * Math.pow(r, 2);
		System.out.println("S: " + s + "\n");
	}

}
