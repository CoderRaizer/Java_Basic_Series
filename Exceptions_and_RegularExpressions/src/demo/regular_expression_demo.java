package demo;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regular_expression_demo {

	public static void main(String[] args) {
		Scanner o = new Scanner(System.in);

		// MATCHES

		String chuoi;
		System.out.print("nhap chuoi: ");
		chuoi = o.nextLine();
		// tao mau abc@yahoo.com.vn

		// String mau = "^[a-zA-Z0-9]+@[a-z]+(\\.[a-z]{2,4}){1,4}$";
		String mau = "^[http]{4}{1}[:]{1}[/]{2}{1}[a-z]+\\.[a-z]{3,5}$";

		Pattern pt = Pattern.compile(mau, Pattern.CASE_INSENSITIVE);
		Matcher mt = pt.matcher(chuoi);

		if (mt.matches())// matches chi xet xem co dung mau hay khong
		{
			System.out.println("dung so voi mau");
		} else {
			System.out.println("sai so voi mau");
		}

		// FIND

		// String chuoi;
		// System.out.print("nhap chuoi: ");chuoi=o.nextLine();
		//
		// String mau = "[^\\s]";//phu dinh viec nhap khoang trang->tuc la nhap ky tu
		// Pattern pt = Pattern.compile(mau,Pattern.CASE_INSENSITIVE);
		// Matcher mt = pt.matcher(chuoi);
		//
		// if(mt.find())//tim kiem trong chuoi co mau can tim khong
		// {
		// System.out.println("co nhap du lieu");
		// }
		//
		// else
		// {
		// System.out.println("khong co nhap du lieu");
		// }

		// REPLACE ALL

		// String chuoi;//tao chuoi
		// System.out.print("nhap chuoi: ");chuoi = o.nextLine();
		//
		// String mau = "[b]{2}";//neu trong chuoi xuat hien 2 chu b lien tiep thi thuc
		// hien thay the
		// Pattern pt = Pattern.compile(mau,Pattern.CASE_INSENSITIVE);
		// Matcher mt = pt.matcher(chuoi);
		//
		//
		//
		// String chuoimoi = mt.replaceAll("XXX");//chuoi moi thay the chuoi cu bb==XXX
		// System.out.println("chuoi moi la: "+chuoimoi);
		//
		// //tiep tuc lay chuoi vua lam moi xet them
		//
		//
		// String mau1 = "[c]{2}";//tiep tuctao mau thu 2 de xet voi chuoimoi
		// Pattern pt1 = Pattern.compile(mau1,Pattern.CASE_INSENSITIVE);
		// Matcher mt1 = pt1.matcher(chuoimoi);
		//
		// String chuoimoi1 = mt1.replaceAll("YYY");
		// System.out.println("chuoi moi 1 la: "+chuoimoi1);
	}

}
