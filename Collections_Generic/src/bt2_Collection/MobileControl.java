package bt2_Collection;

import java.util.Scanner;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileControl {
	HashSet<Mobile> list;
	// HashSet không cho phép các phần tử thêm vào trùng với các phần tử có trong mảng
	// HashSet luôn phải có hashCode để get được key và so sánh 2 đối tượng có giống nhau hay không
	// HashSet lưu trữ các phần tử theo cơ chế gọi là băm
	
	Scanner o = new Scanner(System.in);

	public MobileControl() {
		list = new HashSet<>();
	}

	public void AddMobiles() {
		int u;
		Mobile a = new Mobile();
		do {
			u = 0;
			String addmobile_ID = "";
			o = new Scanner(System.in);
			System.out.print("nhap mobile_ID: ");
			addmobile_ID = o.nextLine();

			String mau1 = "^[SS]{1}[a-z]+[ a-z0-9]{1,}$";
			Pattern pt1 = Pattern.compile(mau1, Pattern.CASE_INSENSITIVE);
			Matcher mt1 = pt1.matcher(addmobile_ID);

			String mau3 = "^[IP]{1}[a-z]+[ a-z0-9]{1,}$";
			Pattern pt3 = Pattern.compile(mau3, Pattern.CASE_INSENSITIVE);
			Matcher mt3 = pt3.matcher(addmobile_ID);

			String mau5 = "^[NK]{1}[a-z]+[ a-z0-9]{1,}$";
			Pattern pt5 = Pattern.compile(mau5, Pattern.CASE_INSENSITIVE);
			Matcher mt5 = pt5.matcher(addmobile_ID);

			String mau7 = "^[MT]{1}[a-z]+[ a-z0-9]{1,}$";
			Pattern pt7 = Pattern.compile(mau7, Pattern.CASE_INSENSITIVE);
			Matcher mt7 = pt7.matcher(addmobile_ID);

			if (mt1.matches())// SAMSUNG
			{
				System.out.println("enter correct!!!");
				if (a.mobile_ID.contains(addmobile_ID)) {
					System.out.println("ma so bi trung");
					u = 0;
					break;
				} else {
					String mau2 = "SS";
					Pattern pt2 = Pattern.compile(mau2, Pattern.CASE_INSENSITIVE);
					Matcher m2 = pt2.matcher(addmobile_ID);
					String addmodel = m2.replaceAll("SAMSUNG ");
					a.mobile_ID = addmobile_ID;
					a.model = addmodel;
					u = 1;
					break;
				}
			}

			if (mt3.matches())// iphone
			{
				System.out.println("enter correct!!!");
				if (a.mobile_ID.contains(addmobile_ID)) {
					System.out.println("ma so bi trung");
					u = 0;
					break;
				} else {
					String mau4 = "IP";
					Pattern pt4 = Pattern.compile(mau4, Pattern.CASE_INSENSITIVE);
					Matcher m4 = pt4.matcher(addmobile_ID);
					String addmodel = m4.replaceAll("IPHONE ");
					a.mobile_ID = addmobile_ID;
					a.model = addmodel;
					u = 1;
					break;
				}
			}

			if (mt5.matches())// nokia
			{
				System.out.println("enter correct!!!");
				if (a.mobile_ID.contains(addmobile_ID))// ham contain chua trong hashSet
				{
					System.out.println("ma so bi trung");
					u = 0;
					break;
				} else {
					String mau6 = "NK";
					Pattern pt6 = Pattern.compile(mau6, Pattern.CASE_INSENSITIVE);
					Matcher m6 = pt6.matcher(addmobile_ID);
					String addmodel = m6.replaceAll("NOKIA ");
					a.mobile_ID = addmobile_ID;
					a.model = addmodel;
					u = 1;
					break;
				}
			}

			if (mt7.matches())// nokia
			{
				System.out.println("enter correct!!!");
				if (a.mobile_ID.contains(addmobile_ID)) {
					System.out.println("ma so bi trung");
					u = 0;
					break;
				} else {
					String mau8 = "MT";
					Pattern pt8 = Pattern.compile(mau8, Pattern.CASE_INSENSITIVE);
					Matcher m8 = pt8.matcher(addmobile_ID);
					String addmodel = m8.replaceAll("MOTOROLA ");
					a.mobile_ID = addmobile_ID;
					a.model = addmodel;
					u = 1;
					break;
				}
			}

			else// nhap sai mau
			{
				System.out.println(" error-please enter againt");
			}

		} while (u != 1);
		// dinh dang cho model
		a.input();
		list.add(a);
	}

	public void deleteMobile(String idxoa)// xoa 1 dien thoai theo mobile_ID
	{
		for (Mobile x : list) {
			if (x.mobile_ID.equalsIgnoreCase(idxoa)) {
				list.remove(x);
				return;
			}
		}
		System.out.println("khong tim thay ID dien thoai can xoa");
	}

	public void displayAll() {
		if (list.size() == 0) {
			System.out.println("DANH SACH DIEN THOAI RONG");
		} else {
			for (Mobile a : list) {
				System.out.println(a);
			}
		}
	}

}
