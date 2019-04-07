package truutuong1phan_abstract;

import java.util.Scanner;

public class main {

	public static void main(String[] args)
	{
		BaoVe a = new BaoVe();
		ThuKy b = new ThuKy();
		
		Scanner o = new Scanner(System.in);
		
		
		System.out.print("ma bao ve: ");
		a.setManv(o.nextLine());
		o = new Scanner(System.in);
		System.out.print("ho ten bao ve: ");
		a.setHoten(o.nextLine());
		System.out.print("gio lam: ");
		a.setgio(o.nextInt());
		
		
		o = new Scanner(System.in);
		System.out.print("ma thu ky: ");
		b.setManv(o.nextLine());
		o = new Scanner(System.in);
		System.out.print("ho ten thu ky: ");
		b.setHoten(o.nextLine());
		System.out.print("gio lam: ");
		b.setgio(o.nextInt());
		
		System.out.print(a);
		a.xuat();
		System.out.print(b);
		b.xuat();
		
		
		
	}

}
