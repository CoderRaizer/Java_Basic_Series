package bt5_Collection_Generic;

import java.util.HashMap;

public class StudentImplement<K, V> {
	HashMap<K, V> list;

	public StudentImplement() {
		list = new HashMap<>();
	}

	public boolean Add(K key, V value) {
		if (!list.containsValue(key))//key trả về true nếu map đang chứa key như là 1 value
		{
			list.put(key, value);
			return true;
		} else {
			return false;
		}
	}

	public void displayAll() {
		System.out.println("in cach 1");
		for (V i : list.values()) {
			System.out.println(i);
		}
	}

	public void find(String ID) {
		if (list.containsKey(ID) == true) {
			System.out.println(list.get(ID));
		} else {
			System.out.println("khong ton tai!");
		}
	}

}
