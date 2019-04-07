package Abstract;

import java.util.Scanner;

public class BaoVe extends NhanVien//Là trình triển khai của abstract class NhanVien
{
	final int luong = 15000;//final là khai báo biến hằng số va không thay đổi trong quá trình thực hiện chương trình
	private int gio;
	
	public BaoVe() {
		super();//Gọi hàm constructor của class Abstract
	}

	public BaoVe(String manv, String hoten,int gio)
	{
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
		System.out.println("Nhap gio lam: ");
		this.gio = o.nextInt();o = new Scanner(System.in);
	}
	
	@Override
	public int TinhLuong()
	{	
		return this.gio*luong;
	}
	
	@Override//Ghi đè lại hàm của class abstract
	public void xuat()
	{
		System.out.println("mabv: "+this.getManv() + "\thoten: "+this.getHoten()+"\t");
		System.out.println("luong bao ve la: "+TinhLuong());
	}
	
}
