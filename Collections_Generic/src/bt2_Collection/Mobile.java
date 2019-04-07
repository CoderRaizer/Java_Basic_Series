package bt2_Collection;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mobile {
	String mobile_ID;
	String model;
	String color;
	int price;

	Scanner o = new Scanner(System.in);

	public Mobile() {

	}

	public Mobile(String mobile_ID, String model, String color, int price) {
		super();
		this.mobile_ID = mobile_ID;
		this.model = model;
		this.color = color;
		this.price = price;
	}

	public void input() { // id va model duoc nhap tu ben ngoai
		System.out.print("nhap color: ");
		this.color = o.nextLine();
		System.out.print("nhap price: ");
		this.price = o.nextInt();
	}

	@Override
	public String toString() {
		return "Mobiles [mobile_ID: " + mobile_ID + "\tmodel: " + model + "\tcolor: " + color + "\tprice: " + price
				+ "]";
	}
	// Khi ta định nghĩa 1 danh sách với các phần tử không được trùng lặp nhau ,
	// hashSet sẽ thực hiện băm ra Object để thêm vào DS
	// Khi sử dụng hashSet thì luôn phải override 2 phương thức (HashCode & equals)

	@Override
	public int hashCode() {
		final int prime = 31;
		int key = 1;
		key = prime * key + ((mobile_ID == null) ? 0 : mobile_ID.hashCode());
		return key;
	}

	@Override
	public boolean equals(Object obj) {// equals chỉ so sánh được 2 đối tượng cùng dduowjc tao ra từ 1 class
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		Mobile other = (Mobile) obj;
		if (mobile_ID == null) {
			if (other.mobile_ID != null)
				return false;
		} else if (!mobile_ID.equals(other.mobile_ID))
			return false;
		return true;
	}// Tại đây thực hiện việc tránh trùng lặp ID

}
