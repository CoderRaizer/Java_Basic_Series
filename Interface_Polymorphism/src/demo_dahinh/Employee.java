package demo_dahinh;

public class Employee {
	int ma;
	String name;

	public Employee() {
		this.ma = 0;
		this.name = "";
	}

	public Employee(int ma, String name) {
		this.ma = ma;
		this.name = name;
	}

	public void out() {
		System.out.println("hello employee");
	}
}
