package demo_dahinh;

public class Office extends Employee {
	int giolam;

	public Office() {
		super();
	}

	public Office(int ma, String name, int giolam) {
		super(ma, name);
		this.giolam = giolam;
	}

	@Override
	public void out() {
		System.out.println("hello Office!");
	}
}
