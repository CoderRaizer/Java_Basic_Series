package bt5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
	ArrayList<SinhVien> list;

	File f;

	Scanner o = new Scanner(System.in);

	public Manager() {
		list = new ArrayList<>();
		f = new File("D://BT5_Green//sinhvien.txt");// vao o D tao 1 floder abc

		if (f.exists()) {
			Doc();
			displayAll();
		} else {
			System.out.println("khong ton tai product nao trong list");
		}
	}

	public void Doc()
	{
		try {
			ObjectInputStream os = new ObjectInputStream(new FileInputStream(f));
			list = (ArrayList<SinhVien>) os.readObject();
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	public void Ghi()
	{
		try {
			ObjectOutputStream ps = new ObjectOutputStream(new FileOutputStream(f));
			ps.writeObject(list);
			ps.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void add() {

		System.out.println("nhap maso: ");
		String masv = o.nextLine();
		o = new Scanner(System.in);
		System.out.println("nhap ho ten: ");
		String hoten = o.nextLine();
		o = new Scanner(System.in);
		System.out.println("nhap nam sinh: ");
		String namsinh = o.nextLine();
		o = new Scanner(System.in);
		System.out.println("Nhap dia chi: ");
		String diachi = o.nextLine();
		o = new Scanner(System.in);
		System.out.println("nhap lop hoc: ");
		String lophoc = o.nextLine();

		SinhVien a = new SinhVien(masv, hoten, namsinh, diachi, lophoc);

		list.add(a);
		Ghi();
	}

	public void find() {
		System.out.println("nhap Id can tim: ");
		String masv = o.nextLine();
		for (SinhVien x : list) {
			if (x.getMa().equals(masv) == true) {
				System.out.println("Sinh vien tim thay la: ");
				System.out.println(x);
			} else {
				System.out.println("FIND NOT GET");
			}
		}
	}

	public void xoa() {
		System.out.println("nhap ma so can xoa: ");
		String masv = o.nextLine();
		boolean kq = false;
		for (SinhVien i : list) {
			if (i.getMa().equals(masv)) {
				kq = list.remove(i);
				System.out.println("xoa thanh cong");
				System.out.println("list sau khi duoc xoa");
				displayAll();
				break;
			}
		}

		if (kq = true) {
			Ghi();
		}
	}

	public void displaylophoc() {
		System.out.println("nhap lop hoc: ");
		String lophoc = o.nextLine();
		System.out.println("danh sach cac sinh vien cua lop " + lophoc + "la: ");
		for (SinhVien i : list) {
			if (i.getLophoc().equals(lophoc)) {
				System.out.println(i);
			}
		}
	}

	public void displayAll() {
		for (SinhVien sv : list) {
			System.out.println(sv);
		}
	}

	public void suathongtin() {
		System.out.println("Nhap ma so cua sinh vien can sua: ");
		String masv = o.nextLine();
		for (SinhVien x : list) {
			if (x.getMa().equals(masv)) {
				System.out.println("nhap new name: ");
				String ten = o.nextLine();
				x.setHoten(ten);
				Ghi();
			}
		}
	}
}
