package class_and_object;

import java.util.Scanner;

public class hinhchunhat {
	int dai;
	int rong;

	Scanner o = new Scanner(System.in);

	public hinhchunhat()// default constructor
	{
		this.dai = 5;
		this.rong = 10;
	}

	public hinhchunhat(int d, int r)// parameterize constructor
	{
		this.dai = d;
		this.rong = r;
	}

	public void nhap() {
		System.out.print("dai: ");
		this.dai = o.nextInt();
		System.out.print("rong: ");
		this.rong = o.nextInt();
	}

	public void xuat()
	{
		System.out.println("dai: " + this.dai);
		System.out.println("rong: " + this.rong);
	}

	public void tinhCV() {
		int cv;
		cv = (this.dai + this.rong) * 2;
		System.out.println("chu vi la: " + cv);
	}

	public int tinhDt(int d, int r) {
		int dt;
		dt = d * r;
		return dt;
	}
}
