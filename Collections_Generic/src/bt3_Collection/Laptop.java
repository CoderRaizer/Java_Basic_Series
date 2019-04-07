package bt3_Collection;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Laptop {
	String id;
	String name;
	String country;
	int price;

	public Laptop() {
	}

	public Laptop(int id, String name, String country, int price) {
		this.id = "";
		this.name = name;
		this.country = country;
		this.price = price;
	}

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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	Scanner o = new Scanner(System.in);

	public void Input() {
		boolean x = false;
		do {
			System.out.println("nhap id: ");
			this.id = o.nextLine();

			String mau1 = "^[L]{1}[0-9]+$";//laptop
			Pattern pt1 = Pattern.compile(mau1, Pattern.CASE_INSENSITIVE);
			Matcher mt1 = pt1.matcher(id);
			
			String mau2 = "^[M]{1}[0-9]+$";//macbook
			Pattern pt2 = Pattern.compile(mau2, Pattern.CASE_INSENSITIVE);
			Matcher mt2 = pt2.matcher(id);

			if (mt1.matches() || mt2.matches()) {
				x = true;
				break;
			}
			if (!mt1.matches() || !mt2.matches()) {
				x = false;
				System.out.println("error");
			}

		} while (x != true);

		
		
		boolean y = false;
		do {
			o = new Scanner(System.in);
			System.out.println("name: ");
			this.name = o.nextLine();
			String mau1 = "[^\\s]";// phủ định việc nhập khoảng trắng, tức là chỉ được nhập ký tự
			Pattern pt1 = Pattern.compile(mau1, Pattern.CASE_INSENSITIVE);
			Matcher mt1 = pt1.matcher(name);

			if (mt1.find())// tim kiem trong chuoi co mau can tim khong->co nhap du lieu
			{
				y = true;
			}

			else {
				System.out.println("error");
			}
		} while (y != true);

		
		
		boolean z = false;
		do {
			System.out.println("price: ");
			this.price = o.nextInt();
			if (price > 0) {
				z = true;
			}
		} while (z != true);
		
		boolean t = false;
		do {
			String quocgia;
			System.out.println("moi ban nhap country: ");
			quocgia = o.nextLine();

			String mau1 = "[CNH]{1}[a-z0-9]+";
			Pattern pt1 = Pattern.compile(mau1, Pattern.CASE_INSENSITIVE);
			Matcher mt1 = pt1.matcher(quocgia);

			String mau3 = "[VN]{1}[a-z0-9]+";
			Pattern pt3 = Pattern.compile(mau3, Pattern.CASE_INSENSITIVE);
			Matcher mt3 = pt3.matcher(quocgia);

			if (mt1.matches()) {
				String mau2 = "CHN";
				Pattern pt2 = Pattern.compile(mau2, Pattern.CASE_INSENSITIVE);
				Matcher mt2 = pt2.matcher(quocgia);
				String country1 = mt2.replaceAll("CHINA ");
				this.country = country1;
				t = true;
				break;
			}

			if (mt3.matches()) {
				String mau4 = "VN";
				Pattern pt4 = Pattern.compile(mau4, Pattern.CASE_INSENSITIVE);
				Matcher mt4 = pt4.matcher(quocgia);
				String country2 = mt4.replaceAll("VIETNAM ");
				this.country = country2;
				t = true;
				break;
			}

			if (mt1.find())// tim kiem trong chuoi co mau can tim khong->co nhap du lieu
			{
				t = true;
			} else {
				t = false;
			}

		} while (t != true);
	}
	

	@Override
	public String toString() {
		return "Laptop [ID: " + id + "\tNAME: " + name + "\tcountry: " + country + "\tprice: " + price + "]";
	}

}
