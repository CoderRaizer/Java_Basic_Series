package entities;

public class Danhmuc
{
	private int madm;
	private String tendm;
	
	public Danhmuc()
	{
		// TODO Auto-generated constructor stub
	}

	public Danhmuc(int madm, String tendm)
	{
		this.madm = madm;
		this.tendm = tendm;
	}

	public int getMadm()
	{
		return madm;
	}

	public void setMadm(int madm)
	{
		this.madm = madm;
	}

	public String getTendm()
	{
		return tendm;
	}

	public void setTendm(String tendm)
	{
		this.tendm = tendm;
	}
}
