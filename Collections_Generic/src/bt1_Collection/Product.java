package bt1_Collection;

import java.util.Scanner;

public class Product {
	String id;
	String name;
	int unitPrice;

	public Product() {
	}

	public Product(String id, String name, int unitPrice) {
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
	}

	public void input() {
		Scanner o = new Scanner(System.in);

		System.out.println("nhap id: ");
		this.id = o.nextLine();
		o = new Scanner(System.in);
		System.out.println("nhap ten Sp: ");
		this.name = o.nextLine();
		System.out.println("nhap price: ");
		this.unitPrice = o.nextInt();
	}

	@Override//override phương thức của class Println
	public String toString() {
		return "id: " + this.id + "\tname: " + this.name + "\tunitprice: " + this.unitPrice;
	}
}
