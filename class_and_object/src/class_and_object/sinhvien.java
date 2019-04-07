package class_and_object;

import java.util.Scanner;

public class sinhvien {
	String ID;
	String hoten;
	int diemtoan;
	int diemvan;

	Scanner o = new Scanner(System.in);

	// khong khoi tao constructor
	public sinhvien() {
		// No code
	}

	public void nhapSV() {

		System.out.printf("ID : ");
		this.ID = o.nextLine();
		System.out.printf("ho ten : ");
		this.hoten = o.nextLine();
		System.out.printf("diem toan : ");
		this.diemtoan = o.nextInt();
		System.out.printf("diem van : ");
		this.diemvan = o.nextInt();
	}

	public void xuatSV() {
		System.out.println("ID : " + this.ID);
		System.out.println("Ho & Ten : " + this.hoten);
		System.out.println("diem toan : " + this.diemtoan);
		System.out.println("diem van : " + this.diemvan);
	}

	public float diemtb(int d_toan, int d_van)// co bien dua vao tu ben ngoai
	{
		float diemtb;
		diemtb = (float) (d_toan + d_van) / 2;
		return diemtb;
	}

	public float diemtb2()// tinh toan ben trong
	{
		float diemtb2;
		diemtb2 = (this.diemtoan + this.diemvan) / 2;
		return diemtb2;
	}

}
