package bt4_Collection;

import java.util.HashMap;
import java.util.TreeMap;
//dung treemap cung duoc//

public class DoctorManager<K, V> {

	HashMap<K, V> doctorlist;// K là key để mảng sắp xếp dựa trên key , V là value truyền vào : Doctor

	public DoctorManager() {
		doctorlist = new HashMap<>();
	}

//	public void add(K key, V value) {
//		if (!doctorlist.containsValue(key)) {// Trả về true nếu map đang chứa key như là 1 value
//			doctorlist.put(key, value);
//			System.out.println("Them Thanh Cong");
//		} else if (doctorlist.containsKey(key)) {
//			System.out.println("Key da trung trong Map - Ghi de");
//			// Tuy thông báo như vậy nhưng vẫn ghi đè lên record cũ
//		}
//	}
	
	
	public void AddDoctor(K key, V value) {
		if(doctorlist.containsKey(key) == false) {
			doctorlist.put(key, value);
			System.out.println("Them Moi Thanh Cong");
		} else {
			System.out.println("Trung key - ghi de vao record cu");
		}
	}

	public void find(String id) {
		if (!doctorlist.containsKey(id)) {
			System.out.println("khong ton tai");
		} else {
			System.out.println(doctorlist.get(id));
		}
	}

	public void showAll() {
		int size = doctorlist.size();
		System.out.println("HashMap co " + size + " Phan Tu");
		System.out.println("in cach 1");
		for (V i : doctorlist.values()) {
			System.out.println(i);
		}
		// System.out.println("IN cach 2");
		// for(K key:list.keySet()){
		// System.out.println(list.get(key));
	}
}
// Trong map, key là duy nhất, nếu thêm một phần tử có key trùng với key có sẵn
// trong map thì phần tử mới sẽ ghi đè lên phần tử cũ
// Trong hashMap key có thể là null
