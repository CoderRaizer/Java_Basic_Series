package class_and_object;

import java.util.Scanner;

public class Calculation {
	
	public void fact(int n) {
		int result = 1;
		for(int i = 1; i <= n;i++) {
			result *= i;
		}
		System.out.println("KQ: "+ result);
	}
	
	public static void main(String[] args) {
		
		int number;
		Scanner o = new Scanner(System.in);
		System.out.println("Nhap So: ");
		number = o.nextInt();
		//goi phuong thuc cua doi tuong annoymous
		new Calculation().fact(number);
	}

}
