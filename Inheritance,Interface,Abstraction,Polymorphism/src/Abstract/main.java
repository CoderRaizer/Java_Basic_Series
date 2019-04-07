package Abstract;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner o = new Scanner(System.in);

		BaoVe a = new BaoVe();
		ThuKy b = new ThuKy();
		
		a.SetInfo();
		b.SetInfo();
		
		a.xuat();
		b.xuat();
	}
	
	
	
}
