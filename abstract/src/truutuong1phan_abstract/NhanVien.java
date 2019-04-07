package truutuong1phan_abstract;

public abstract class NhanVien//class truu tuong..khi con la abstract class thi cac ham trong than class co the chi co 1 abstract constructor
//neu la interface class thi ben trong no deu phai la cam ham truu tuong hoan toan va phai ghi de len tat ca o class ke thua no
{
	private String manv;
	private String hoten;
	
	
	
	public String getManv()
	{
		return manv;
	}
	public void setManv(String manv)
	{
		this.manv = manv;
	}
	
	
	public String getHoten()
	{
		return hoten;
	}
	public void setHoten(String hoten)
	{
		this.hoten = hoten;
	}
	
	
	public NhanVien()
	{
		
	}
	
	public NhanVien(String manv , String hoten)
	{
		this.manv = manv;
		this.hoten = hoten;
	}
	
	public abstract int TinhLuong();//la mot phuong thuc nhung la truu tuong,khong co j ben trong,de class ke thua ghi de len va sd
	public abstract void xuat();//
	
}
