package bt5_Collection_Generic;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {
	String stuID;
	String name;
	String phone;
	String diachi;

	Scanner zx = new Scanner(System.in);

	public Student() {

	}

	public Student(String stuID, String name, String phone, String diachi) {
		super();
		this.stuID = stuID;
		this.name = name;
		this.phone = phone;
		this.diachi = diachi;
	}

	public String getStuID() {
		return stuID;
	}

	public void setStuID(String stuID) {
		this.stuID = stuID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	
	public void nhap() {
		System.out.print("Nhap ID: ");
		stuID = zx.nextLine();
		zx = new Scanner(System.in);
		System.out.println("Nhap Name: ");
		name = zx.nextLine();
		zx = new Scanner(System.in);
		System.out.print("Nhap phone: ");
		phone = zx.nextLine();
		System.out.print("Nhap Dia chi: ");
		diachi = zx.nextLine();
	}
//	public void nhap() {
//		int x = 0;
//		do {
//			System.out.println("nhap ID: ");
//			stuID = zx.nextLine();
//			String mau = "[AZ]{2}{1}{1}[0-9]{1,5}$";
//			Pattern pt = Pattern.compile(mau, Pattern.CASE_INSENSITIVE);
//			Matcher mt = pt.matcher(stuID);
//			if (mt.matches()) {
//				x = 1;
//			} else {
//				System.out.println("error ID");
//				x = 0;
//			}
//		} while (x != 1);
//
//		int y = 0;
//		do {
//			zx = new Scanner(System.in);
//			System.out.println("nhap phone: ");
//			this.phone = zx.nextLine();
//			String mau1 = "^[0-9]{2}[/-]{1}[0-9]{3}[/-]{1}[0-9]{6}[/-]{1}[0-9]{2}+$";
//			Pattern pt1 = Pattern.compile(mau1, Pattern.CASE_INSENSITIVE);
//			Matcher mt1 = pt1.matcher(phone);
//			if (mt1.matches()) {
//				y = 1;
//			} else {
//				System.out.println("error phone");
//				y = 0;
//			}
//		} while (y != 1);
//
//		int z = 0;
//		do {
//			zx = new Scanner(System.in);
//			System.out.println("nhap name: ");
//			this.name = zx.nextLine();
//			String mau3 = "[^//s]";// phu dinh viec nhap khoang trang->co nhap du lieu
//			Pattern pt3 = Pattern.compile(mau3, Pattern.CASE_INSENSITIVE);
//			Matcher mt3 = pt3.matcher(name);
//
//			if (mt3.find())// tim kiem trong chuoi co mau can tim khong
//			{
//				System.out.println("co nhap du lieu");
//				z = 1;
//			}
//
//			else {
//				System.out.println("khong co nhap du lieu");
//				z = 0;
//			}
//		} while (z != 1);
//
//		zx = new Scanner(System.in);
//		System.out.println("nhap dia chi: ");
//		this.diachi = zx.nextLine();
//	}

	@Override
	public String toString() {
		return "Student [stuID: " + stuID + "\tname: " + name + "\tphone: " + phone + "\tdiachi: " + diachi + "]";
	}

}
