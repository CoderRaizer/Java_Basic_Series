package movies;

import java.util.Scanner;

public class CompactDisc {// movie
	private String title;
	private double price;
	private int code;

	Scanner o = new Scanner(System.in);

	public CompactDisc() {
	}

	public CompactDisc(String title, double price, int code) {
		this.title = title;
		this.price = price;
		this.code = code;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public void setPrice(double Price) {
		this.price = price;
	}

	public double getPrice() {
		return this.price;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getCode() {
		return this.code;
	}

	public void nhapVCD() {
		System.out.print("nhap title: ");
		this.title = o.nextLine();

		o = new Scanner(System.in);

		System.out.print("nhap price: ");
		this.price = o.nextDouble();
		System.out.print("nhap code: ");
		this.code = o.nextInt();
	}

	public String toString() {
		return "title: " + this.title + "\tprice: " + this.price + "\tcode: " + this.code + "\n";
	}
}
