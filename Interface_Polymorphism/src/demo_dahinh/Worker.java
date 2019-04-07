package demo_dahinh;

public class Worker extends Employee {
	int giolam;

	public Worker() {
		super();
	}

	public Worker(int ma, String name, int giolam) {
		super(ma, name);
		this.giolam = giolam;
	}

	@Override
	public void out() {
		System.out.println("hello Worker!");
	}

}
