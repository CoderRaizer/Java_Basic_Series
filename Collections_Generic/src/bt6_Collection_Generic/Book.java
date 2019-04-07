package bt6_Collection_Generic;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Book {
	String BookID;
	String theloai;
	String tieude;
	String tacgia;
	int price;

	public Book() {

	}

	public Book(String bookID, String theloai, String tieude, String tacgia, int price) {
		super();
		BookID = bookID;
		this.theloai = theloai;
		this.tieude = tieude;
		this.tacgia = tacgia;
		this.price = price;
	}

	public String getBookID() {
		return BookID;
	}

	public void setBookID(String bookID) {
		BookID = bookID;
	}

	public String getTheloai() {
		return theloai;
	}

	public void setTheloai(String theloai) {
		this.theloai = theloai;
	}

	public String getTieude() {
		return tieude;
	}

	public void setTieude(String tieude) {
		this.tieude = tieude;
	}

	public String getTacgia() {
		return tacgia;
	}

	public void setTacgia(String tacgia) {
		this.tacgia = tacgia;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	Scanner z = new Scanner(System.in);

	public void nhap() {

		int x = 0;
		do {
			System.out.println("nhap BookID: ");
			this.BookID = z.nextLine();

			String mau = "^[B]{1}[0-9]{4}[/-]{1}[A]{1}[0-9]{2}$";
			Pattern pt = Pattern.compile(mau, Pattern.CASE_INSENSITIVE);
			Matcher mt = pt.matcher(BookID);
			if (mt.matches()) {
				x = 1;
			} else {
				x = 0;
				System.out.println("error");
			}
		} while (x != 1);

		System.out.println("nhap the loai: ");
		this.theloai = z.nextLine();

		int y = 0;
		do {
			System.out.println("nhap tieu de: ");
			this.tieude = z.nextLine();
			String mau1 = "[^//s]";// phu dinh viec nhap khoang trang
			Pattern pt1 = Pattern.compile(mau1, Pattern.CASE_INSENSITIVE);
			Matcher mt1 = pt1.matcher(BookID);
			if (mt1.find()) {
				y = 1;
			} else {
				y = 0;
				System.out.println("phai nhap du lieu");
			}
		} while (y != 1);

		int t = 0;
		do {
			System.out.println("nhap tac gia: ");
			this.tacgia = z.nextLine();
			String mau2 = "[^//s]";// phu dinh viec nhap khoang trang
			Pattern pt2 = Pattern.compile(mau2, Pattern.CASE_INSENSITIVE);
			Matcher mt2 = pt2.matcher(BookID);
			if (mt2.find()) {
				t = 1;
			} else {
				t = 0;
				System.out.println("phai nhap du lieu");
			}
		} while (t != 1);

		System.out.println("nhap price: ");
		this.price = z.nextInt();
	}

	@Override
	public String toString() {
		return "Book [BookID: " + BookID + "\ttheloai: " + theloai + "\ttieude: " + tieude + "\ttacgia: " + tacgia
				+ "\tprice: " + price + "]";
	}
}
