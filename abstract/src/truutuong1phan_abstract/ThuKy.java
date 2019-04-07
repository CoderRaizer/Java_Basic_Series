package truutuong1phan_abstract;

public class ThuKy extends NhanVien
{
	final int luong = 20000;//final la khai bao bien hang so,khong the thay doi trong qua trinh thuc thi chuong trinh
	private int gio;
	
	
	public void setgio(int gio)
	{
		this.gio = gio;
	}
	
	
	@Override
	public int TinhLuong()
	{
		return this.gio*luong;
	}
	
	
	@Override
	public void xuat()
	{
		System.out.println("luong thu ky la: "+TinhLuong());
	}
	
	
	public ThuKy()
	{
		super();
	}

	public ThuKy(String manv, String hoten,int gio)
	{
		super(manv, hoten);
		this.gio = gio;
	}
	
	public String toString ()
	{
		return "matk: "+this.getManv() + "\thoten: "+this.getHoten()+"\t";
	}
}
