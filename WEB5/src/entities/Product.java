package entities;

public class Product
{
	private String masp;
	private String tensp;
	private Integer gia;
	private String hinh;
	private int madm;
	
	
	public Product()
	{
		
	}
	
	
	public int getMadm()
	{
		return madm;
	}



	public void setMadm(int madm)
	{
		this.madm = madm;
	}
	
	
	
	public Product(String masp)
	{
		this.masp = masp;
	}
	
	public Product(String masp, String tensp,Integer gia,String hinh)
	{
		this.masp = masp;
		this.tensp = tensp;
		this.gia = gia;
		this.hinh = hinh;
	}
	
	
	public Product(String masp, String tensp,Integer gia,String hinh,int madm)
	{
		this.masp = masp;
		this.tensp = tensp;
		this.gia = gia;
		this.hinh = hinh;
		this.madm = madm;
	}

	public String getMasp()
	{
		return masp;
	}

	public void setMasp(String masp)
	{
		this.masp = masp;
	}

	public String getTensp()
	{
		return tensp;
	}

	public void setTensp(String tensp)
	{
		this.tensp = tensp;
	}

	public Integer getGia()
	{
		return gia;
	}

	public void setGia(Integer gia)
	{
		this.gia = gia;
	}

	public String getHinh()
	{
		return hinh;
	}

	public void setHinh(String hinh)
	{
		this.hinh = hinh;
	}
	
	
	
	
}
