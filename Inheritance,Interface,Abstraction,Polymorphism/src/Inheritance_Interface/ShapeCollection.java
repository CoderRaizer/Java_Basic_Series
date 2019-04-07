package Inheritance_Interface;

import java.util.Scanner;

public class ShapeCollection {
	private int dem;
	Shape []listshape;

	public ShapeCollection() {
		listshape = new Shape[SetQuantityShape()];//Mảng này thể hiện tính đa hình: chứa được các phần tử có bản chất khác nhau - Nhưng lại được kế thừa từ interface Shape -> Khai báo kiểu dữ liệu là Shape
		dem = 0;
	}
	
	private int SetQuantityShape() {
		Scanner o = new Scanner(System.in);
		System.out.println("Nhap So Luong Co The Luu Tru: ");
		return o.nextInt();
	}

	public void AddCricle() {
		if (this.dem < 5) {
			Circle temp = new Circle();
			temp.nhap();
			listshape[this.dem] = temp;
			dem++;
		} else {
			System.out.println("full");
		}
	}

	public void AddRectangle() {
		if (this.dem < 5) {
			Rectangle temp = new Rectangle();
			temp.nhap();
			listshape[this.dem] = temp;
			dem++;
		} else {
			System.out.println("full");
		}
	}

	public int getDem() {
		return dem;
	}

	public void setDem(int dem) {
		this.dem = dem;
	}
	
	
	
	
}
