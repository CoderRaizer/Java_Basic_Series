package Abstract;

import java.util.Scanner;

public abstract class NhanVien// class truu tuong..khi con la abstract class thi cac ham trong than class co
								// the chi co 1 abstract constructor
// neu la interface class thi ben trong no deu phai la cac ham truu tuong hoan
// toan va phai ghi de len tat ca o class ke thua no
{
	private String manv;
	private String hoten;
	Scanner o = new Scanner(System.in);

	public NhanVien() {
	}

	public NhanVien(String manv, String hoten) {
		this.manv = manv;
		this.hoten = hoten;
	}

	public String getManv() {
		return manv;
	}

	public void setManv(String manv) {
		this.manv = manv;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	
	public void SetInfo() {
		
		System.out.println("Nhap manv: ");this.manv = o.nextLine();
		o = new Scanner(System.in);
		System.out.println("Nhap ho ten: ");this.hoten = o.nextLine();
	}

	// la cac phuong thuc nhung la truu tuong,khong co gi ben trong,de class ke thua
	// ghi de len va su dung vi cac class ke thua no tuong ung voi cac phuong thuc
	// nay se co cach tinh rieng
	public abstract int TinhLuong();
	public abstract void xuat();

}
