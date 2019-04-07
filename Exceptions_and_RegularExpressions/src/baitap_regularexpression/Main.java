package baitap_regularexpression;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner o = new Scanner(System.in);
		
		Employee a = new Employee();
		
		a.nhap();
		
		String kqaddress = a.standardizeAddress();
		System.out.println(kqaddress);
		String kqphone = a.standardizePhone();
		System.out.println(kqphone);
	}

}
