package method_and_accessspecifier;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner u = new Scanner(System.in);

		// main->Manage->SinhVien

		// Manage mn = new Manage();
		// SinhVien sv = new SinhVien();
		// mn.nhapthongtin(sv);
		// mn.xuatthongtin(sv);
		// mn.tinhdiemtb(sv);

		//------------------------------------------//

		// //main->hinhtamgiac

		// hinhtamgiac abc = new hinhtamgiac();
		//
		// System.out.print("canh a: ");
		// abc.setCanhA(u.nextInt());//dua a vao trong
		//
		// System.out.print("canh b: ");
		// abc.setCanhB(u.nextInt());//dua a vao trong
		//
		// System.out.print("canh c: ");
		// abc.setCanhC(u.nextInt());//dua a vao trong
		//
		// boolean xet ;
		// xet = abc.checkTamGiac();
		//
		// if(xet != true)
		// {
		// System.out.print("khong thanh lap duoc tam giac!");
		// }
		// else
		// {
		// abc.xuatthongtin();
		// abc.getChuVi();
		// abc.getDientich();
		// }

		// -----------------------------------------------//

		// main->nhanvien
		int xet = 2;

		NhanVien nhanvien1 = new NhanVien();
		NhanVien nhanvien2 = new NhanVien();

		System.out.print("ma nhan vien1: ");
		nhanvien1.setMaNV(u.nextLine());
		System.out.print("so san pham 1: ");
		nhanvien1.setSoSP(u.nextInt());

		u = new Scanner(System.in);

		System.out.print("ma nhan vien2: ");
		nhanvien2.setMaNV(u.nextLine());
		System.out.print("so san pham 2: ");
		nhanvien2.setSoSP(u.nextInt());

		nhanvien1.xuatnhanvien();// cac xuat goi ham
		xet = nhanvien1.coVuotChuan();

		if (nhanvien1.getSoSP() > 0) {
			if (xet == 1) {
				System.out.print("luong la: " + nhanvien1.getLuong() + "\n");
				System.out.println("VUOT");
			}

			if (xet == 0) {
				System.out.print("luong la: " + nhanvien1.getLuong() + "\n");
				System.out.println("KHONG VUOT");
			}
		} else {
			System.out.print("khong co luong!\n");
		}

		System.out.println(nhanvien2);// cach xuat theo phuong thuc string
		xet = nhanvien2.coVuotChuan();

		if (nhanvien2.getSoSP() > 0) {
			if (xet == 1) {
				System.out.print("luong la: " + nhanvien2.getLuong() + "\n");
				System.out.println("VUOT");
			}

			if (xet == 0) {
				System.out.print("luong la: " + nhanvien2.getLuong() + "\n");
				System.out.println("KHONG VUOT");
			}
		} else {
			System.out.print("khong co luong\n!!");
		}

	}
}// MANAGE-SINHVIEN-HINHTAMGIAC-NHANVIEN-RUNTIMEDEMO
