package Generic_Demo;

import java.util.HashMap;
import java.util.TreeMap;
//Generic  dùng treeMap hoặc hashMap cũng được

public class Manage<K, V> {
	TreeMap<K, V> list;

	public Manage() {
		list = new TreeMap<>();
	}

	public void addDoc(K key, V doctor) {
		 Doctor a = new Doctor();
		 a.nhap();
		if (!list.containsKey(key))
			list.put(key, doctor);
		else {
			System.out.println("ID da ton tai.");
		}
	}

	public void displayAll() {
		System.out.println("Danh Sach: ");
		for (V a : list.values())
			System.out.println(a);

	}

	public void SearchbyID(K ID) {
		if (list.containsKey(ID))
			System.out.println(list.get(ID));
		else
			System.out.println("ID khong ton tai.");
	}
}
