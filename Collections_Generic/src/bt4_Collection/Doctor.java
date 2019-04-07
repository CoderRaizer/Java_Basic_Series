package bt4_Collection;

import java.util.Scanner;

public class Doctor {
	String id;
	String name;
	int hour;

	public Doctor() {

	}

	public Doctor(String id, String name, int hour) {
		super();
		this.id = id;
		this.name = name;
		this.hour = hour;
	}

	Scanner o = new Scanner(System.in);

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public void nhap() {
		System.out.print("nhap ten: ");
		this.name = o.nextLine();
		o = new Scanner(System.in);
		System.out.print("nhap ID: ");
		this.id = o.nextLine();
		System.out.print("nhap hour: ");
		this.hour = o.nextInt();
	}

	@Override
	public String toString() {
		return "Doctor [id: " + id + "\tname: " + name + "\thour: " + hour + "]";
	}

}
