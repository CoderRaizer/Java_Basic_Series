package baitap_Exceptions;

public class thongbaoloi extends Exception
{
	String error;
	public thongbaoloi(String error)
	{
		super();
		this.error = error;
	}
	
	public String geterror()
	{
		return this.error;
	}
}
