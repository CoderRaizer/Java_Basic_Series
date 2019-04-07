package class_and_object;

import java.util.Scanner;

public class robot {
	
	private int tocdo;
	int cao;
	int cannang;
	String mausac;
	String model;// day la cac bien default(khong co de gi truoc bien)
	// cac bien de mo ta cho cac doi tuong goi la properties (thuoc tinh)

	public robot()// ham dung rong (default constructor) la ham khong co truyen tham so
	{
		this.cao = 10;
		this.cannang = 20;
		this.mausac = "no-color";
		this.model = "no-version";
		this.xuatthongtin();//mac dinh 1 phuong thuc can thiet khi khoi dong doi tuong
	}// tu khoa this truy xuat cac bien instance ben ngoai (constructor) nhung ben
	// trong class (truy xuat tu trong ruot)
	
	public robot(int cao, int cannang, String mausac, String model)// parameterize constructor (ham dung co truyen tham
	{
		this.cao = cao;
		this.cannang = cannang;
		this.mausac = mausac;
		this.model = model;
	}// gan gia tri ben trong = ben ngoai nhap
	
	
	public void setChieucao(int tocdo) {
		this.tocdo = tocdo;
	}

	public int gettocdo()// co kieu tra ra la int va khong can bien hung gia tri
	{
		return this.tocdo;
	}
	// truy nhap duong vong (la do bien private) kha quan hon truy nhap truc tien vi
	// ham co the xet dieu kien dau vao dau ra

	// ham dung (constructor) co ten = ten class



	// method(phuong thuc)(hanh dong cua doi tuong)

	public void xuatthongtin() {
		System.out.println(this.cao);
		System.out.println(this.cannang);
		System.out.println(this.mausac);
		System.out.println(this.model);
	}// dang trong bung con robot

	public void nhapthongtin() {
		Scanner o = new Scanner(System.in);

		System.out.print("chieu cao:");
		this.cao = o.nextInt();
		System.out.print("can nang:");
		this.cannang = o.nextInt();

		o = new Scanner(System.in);

		System.out.print("mau sac:");
		this.mausac = o.nextLine();
		o = new Scanner(System.in);
		System.out.print("model:");
		this.model = o.nextLine();
	}

	public String toString()// ham cho phep class ben ngoai chuyen doi tuong robot thanh chuoi bang phuong
							// thuc System.out.(robot);
	{
		return "chieu cao:" + this.cao + "\t Cannang:" + this.cannang + "\t mau sac: " + this.mausac + "\t Version: "
				+ this.model;
	}

	public void chao()// cac ham dung can phai gan voi tu khoa public
	{
		System.out.println("hello vietnam");
	}

	public void leocauthang() {
		System.out.println("buoc chan trai");
		System.out.println("buoc chan phai\n\n");
	}
}
