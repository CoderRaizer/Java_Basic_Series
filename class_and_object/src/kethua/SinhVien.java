package kethua;

import java.util.Scanner;

public class SinhVien {
	int rollNo;
	String name;

	public SinhVien() {
		this.rollNo = 0;
		this.name = "";
	}

	public SinhVien(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	public void nhapthongtin() {
		Scanner o = new Scanner(System.in);
		System.out.print("rollno: ");
		this.rollNo = o.nextInt();
		o = new Scanner(System.in);
		System.out.print("name: ");
		this.name = o.nextLine();
		o = new Scanner(System.in);
	}

	public void xuatthongtin() {
		System.out.print(this.rollNo);
		System.out.print(this.name);
	}

}
