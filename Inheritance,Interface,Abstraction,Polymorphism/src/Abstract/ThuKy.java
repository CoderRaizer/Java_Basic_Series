package Abstract;

import java.util.Scanner;

public class ThuKy extends NhanVien//Là trình triển khai của abstract class NhanVien
{
	final int luong = 20000;//final la khai bao bien hang so,khong the thay doi trong qua trinh thuc thi chuong trinh
	private int gio;
	
	public ThuKy(){
		super();
	}
	
	public ThuKy(String manv, String hoten,int gio){
		super(manv, hoten);
		this.gio = gio;
	}
	
	public int getGio() {
		return gio;
	}

	public void setGio(int gio) {
		this.gio = gio;
	}

	@Override
	public void SetInfo() {
		Scanner o = new Scanner(System.in);
		super.SetInfo();
		System.out.println("Nhap Gio: ");this.gio = o.nextInt();
		
	}
	
	@Override
	public int TinhLuong(){
		return this.gio*luong;
	}
	
	@Override//Ghi đè lại hàm của class abstract
	public void xuat()
	{
		System.out.println("ma tky: "+this.getManv() + "\thoten: "+this.getHoten()+"\t");
		System.out.println("luong thu ky la: "+TinhLuong());
	}
}
