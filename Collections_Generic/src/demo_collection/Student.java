package demo_collection;

import java.util.Scanner;

public class Student {
	private int masv;
	private String ten;
	
	
	public Student() {
	}

	public Student(int masv, String ten) {
		super();
		this.masv = masv;
		this.ten = ten;
	}

	
	public int getMasv() {
		return masv;
	}

	public void setMasv(int masv) {
		this.masv = masv;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public void input() {
		Scanner o = new Scanner(System.in);
		System.out.println("nhap ma sv: ");
		this.masv = o.nextInt();
		o = new Scanner(System.in);
		System.out.println("nhap ten: ");
		this.ten = o.nextLine();
	}

	public String toString(){
		return "\n masv: " + this.masv + "\ntensv: " + this.ten;
	}
}
