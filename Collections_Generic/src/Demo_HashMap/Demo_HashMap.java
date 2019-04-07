package Demo_HashMap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashMap;

public class Demo_HashMap {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();

		map.put(1, "black");
		map.put(2, "blue");
		map.put(3, "red");
		map.put(4, "while");
		map.put(5, "yellow");
		map.put(null, "no color");

		System.out.println(map.get(1));
		System.out.println(map.get(2));
		System.out.println(map.get(null));

		Set<Integer> keyset = map.keySet();//Hàm keySet sẽ trả về tập hợp các key trong map

		for (Integer i : keyset) {
			System.out.println(i + " " + map.get(i));
		}

//		map.remove(1);
//		map.clear();// Xóa toàn bộ các phần tử trong Map
//		System.out.println("sau khi xoa");

//		Set<Integer> keyset1 = map.keySet();
//
//		for (Integer i : keyset1) {
//			System.out.println(i + " " + map.get(i));
//		}

		for (Entry<Integer, String> s : map.entrySet()) {
			//Dùng Entry sẽ lấy ra các cặp key và value tương ứng của map đó
			s.getKey();
			s.getValue();
			System.out.println(s.toString());
		}

//		Map<String, Person> mapPerson = new HashMap<String, Person>();
//
//		mapPerson.put("A", new Person(1));
//		Person p = mapPerson.get("A");
//		System.out.println(p.getId());
	}

}
