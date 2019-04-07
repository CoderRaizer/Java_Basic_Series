package polymophism;

public class Employee
{
	int ma;
	String name;
	
	public Employee() {
		
	}
	
	public Employee(int ma,String name)
	{
		this.ma = ma;
		this.name = name;
	}
	
	
	public void out()
	{
		System.out.println("hello");
	}
}
