package Generic_Demo;

import java.util.Scanner;

public class Doctor {
	private String id;
	private String name;
	private int availHours;

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

	public int getAvailHours() {
		return availHours;
	}

	public void setVailHours(int vailHours) {
		this.availHours = vailHours;
	}

	public Doctor(String id, String name, int availHours) {
		this.id = id;
		this.name = name;
		this.availHours = availHours;
	}

	public Doctor() {
		this.id = "";
		this.name = "";
		this.availHours = 0;
	}

	public void nhap() {
		Scanner o = new Scanner(System.in);
		System.out.println("Nhap ID doctor: ");
		this.id = o.nextLine();
		o = new Scanner(System.in);
		System.out.println("Nhap ten doctor: ");
		setName(o.nextLine());
		System.out.println("Nhap hour: ");
		setVailHours(o.nextInt());
	}

	@Override
	public String toString() {
		return "ID: " + getId() + " Name: " + getName() + " Hour: " + getAvailHours();
	}

}
