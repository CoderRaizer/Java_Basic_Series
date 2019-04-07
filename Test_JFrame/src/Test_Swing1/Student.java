package Test_Swing1;

public class Student//day la class ghi file ::>D://file_Fromdangky
{
	String hoten;
	String email;
	
	public Student()
	{
		//no code
	}
	
	public Student(String hoten,String email)
	{
		this.hoten = hoten;
		this.email = email;
	}
	
	public String toString()
	{
		return String.format("%s %s",this.hoten,this.email);
	}
}
