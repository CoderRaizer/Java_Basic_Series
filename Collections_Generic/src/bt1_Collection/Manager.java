package bt1_Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Manager {

	ArrayList<Product> prlist;

	private int index;// de danh dau so thu tu cua san pham trong mang cam truy xuat thong tin chi tiet

	public Manager() {
		prlist = new ArrayList<Product>();
	}

	public void addProduct() {
		Product newproduct = new Product();
		newproduct.input();
		prlist.add(newproduct);
	}

	public boolean searchByID(String id) {
		for (int i = 0; i < prlist.size(); i++) {
			if (id.equals(prlist.get(i).id) == true) {
				this.index = i;// sptimkiem de dua xuong ham show
				return true;
			}
		}
		return false;
	}

	public void show1Product() {
		System.out.println("thong tin sp la: " + prlist.get(index));
	}

	public void displayAll() {
//		for (Product a : prlist) {
//			System.out.println(a);
//		}
		
		Iterator <Product> x = prlist.iterator();
		while(x.hasNext()) {
			System.out.println(x.next() + "\t");
		}
	}

	public void displayHighValua() {
		for (int i = 0; i < prlist.size(); i++) {
			if (prlist.get(i).unitPrice > 500) {
				System.out.println("=>: " + prlist.get(i).name);
			}
		}
	}
	
}
