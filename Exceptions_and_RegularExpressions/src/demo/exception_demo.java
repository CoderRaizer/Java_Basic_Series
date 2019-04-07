package demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exception_demo {

	public static void main(String[] args) {
		Scanner o = new Scanner(System.in);

		int a;
		int b;
		do {
			try
			{
				o = new Scanner(System.in);
				System.out.print("nhap a: ");
				a = o.nextInt();
				if (a < 0)// day la mot cach ap dat theo nguoi dung chu may tinh khong the bat duoc loi
							// khi nhap so
					throw new Exception();

				System.out.print("nhap b: ");
				b = o.nextInt();
				if (b > 100)// day la mot cach ap dat theo nguoi dung chu may tinh khong the bat duoc loi
							// khi nhap so
					throw new Exception();

				float c = (float) a / b;
				System.out.println("c = " + c);
				break;// de day khi ma try khong nhay xuong cac truong hop sai thi no se nhay ra khoi
						// do

			} catch (InputMismatchException e)// loi khi nhap chu
			{
				System.out.println("phai nhap so");
			} catch (Exception e) {
				System.out.println("loi nhap vao!!");
			}

		} while (true);

		System.out.println("ket thuc!!");
	}

}
