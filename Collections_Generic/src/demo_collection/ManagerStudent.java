package demo_collection;

import java.util.ArrayList;

public class ManagerStudent {
	ArrayList<Student> list;

	public ManagerStudent() {
		list = new ArrayList<>();
	}

	public void addStudent() {
		Student a = new Student();
		a.input();
		list.add(a);
	}

	public void showList() {
		for (Student a : list) {
			System.out.println(a);
		}
	}
}
