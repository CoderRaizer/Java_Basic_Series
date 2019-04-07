package method_and_accessspecifier;

import java.util.Scanner;

public class Manage {
	Scanner o = new Scanner(System.in);

	public void nhapthongtin(SinhVien x) {
		System.out.print("nhap masv: ");
		x.setMasv(o.nextLine());
		System.out.print("nhap hoten: ");
		x.setHoten(o.nextLine());

		o = new Scanner(System.in);

		System.out.print("nhap diemlt: ");
		x.setDiemlt(o.nextInt());
		System.out.print("nhap diemth: ");
		x.setDiemth(o.nextInt());
	}

	public void xuatthongtin(SinhVien x) {
		System.out.println(x.toString());
	}

	public void tinhdiemtb(SinhVien y) {
		float tb;
		tb = (float) (y.getDiemlt() + y.getDiemth()) / 2;
		System.out.print("\t DIEM TRUNG BINH : " + (float) tb);
	}

}
