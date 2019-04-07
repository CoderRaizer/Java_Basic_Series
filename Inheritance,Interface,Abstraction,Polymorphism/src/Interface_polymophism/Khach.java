package Interface_polymophism;

import java.util.Scanner;

public abstract class Khach {
	String name;
	int passport;
	int tiencuoc;

	Scanner o = new Scanner(System.in);

	public Khach() {
		this.name = "";
		this.tiencuoc = 0;
		this.passport = 0;
	}

	public Khach(int passport, String name, int tiencuoc) {
		this.tiencuoc = tiencuoc;
		this.name = name;
		this.passport = passport;
	}

	public void input() {
		System.out.println("Nhap ten : ");
		this.name = o.nextLine();
		System.out.println("Nhap passport : ");
		this.passport = o.nextInt();
		System.out.println("Nhap tien cuoc : ");
		this.tiencuoc = o.nextInt();
	}

	public void output() {
		System.out.println("Ten : " + this.name);
		System.out.println("Passport : " + this.passport);
		System.out.println("Tiencuoc : " + this.tiencuoc);
	}

	public abstract void tinhtienthang();// hàm kế thừa nó phải ghi đè hàm này
	
}
