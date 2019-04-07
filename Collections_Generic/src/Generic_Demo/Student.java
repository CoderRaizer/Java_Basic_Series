package Generic_Demo;

import java.util.Scanner;

public class Student {
	int masv;
	String hoten;

	public Student() {
		
	}

	public Student(int masv, String hoten) {
		this.masv = masv;
		this.hoten = hoten;
	}
	
	
	public int getMasv() {
		return masv;
	}

	public void setMasv(int masv) {
		this.masv = masv;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public void input() {
		Scanner sr = new Scanner(System.in);
		System.out.println("Nhap masv:");
		this.masv = sr.nextInt();
		sr = new Scanner(System.in);
		System.out.println("Nhap tensv:");
		this.hoten = sr.nextLine();
	}

	@Override
	public String toString() {
		return "\nMasv:" + this.masv + " Tensv:" + this.hoten;
	}
}
