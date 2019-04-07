package bt3_Collection;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;


/*--------Support---------*/
class sapxepId implements Comparator<Laptop> {
	@Override
	public int compare(Laptop o1, Laptop o2) {
		return o1.getId().compareTo(o2.getId());
	}
}

public class LaptopManagement {

	TreeSet<Laptop> abc;
	public LaptopManagement() {
		abc = new TreeSet<>(new sapxepId());
	}

	public void add() {
		Laptop a = new Laptop();
		a.Input();
		abc.add(a);
	}

	Scanner o = new Scanner(System.in);
	Laptop u = new Laptop();

	public void search(String id) {
		for (Laptop e : abc) {
			if (id.equals(e.id) == true) {
				System.out.println(e);
			}
		}
	}

	public void displaytangdan()// hinh nhu la da duoc treeset thiet lam theo thu tu tang dan
	{
		for (Laptop e : abc) {
			System.out.println(e);
		}
	}

}
