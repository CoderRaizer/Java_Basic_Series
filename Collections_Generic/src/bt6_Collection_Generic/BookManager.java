package bt6_Collection_Generic;

import java.util.HashMap;
import java.util.TreeMap;

public class BookManager<K, V> {
	TreeMap<K, V> listbook;

	int dem = 0;

	public BookManager() {
		listbook = new TreeMap<>();
	}

	public void add(K key, V value) {
		if (!listbook.containsValue(key)) {
			listbook.put(key, value);
			this.dem += 1;
		} else {
			System.out.println("da ton tai sach trong listbook");
		}
	}

	public void displayAll() {
		for (V i : listbook.values()) {
			System.out.println(i);
		}
	}
}
