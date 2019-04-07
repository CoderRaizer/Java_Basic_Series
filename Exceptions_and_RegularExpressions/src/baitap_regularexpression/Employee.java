 package baitap_regularexpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Employee
{
	private String name;
	private String address;
	String phonenumber;
	
	
	Scanner o = new Scanner(System.in);
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public String getPhonenumber()
	{
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber)
	{
		this.phonenumber = phonenumber;
	}
	
	public void nhap()
	{
		System.out.println("nhap name: ");
		this.name = o.nextLine();
		System.out.println("nhap address: ");
		this.address = o.nextLine();
		System.out.println("nhap phone: ");
		this.phonenumber = o.nextLine();
	}
		
	
	public String standardizeAddress()
	{
		String mau = "Drive";
		Pattern pt = Pattern.compile(mau,Pattern.CASE_INSENSITIVE);
		Matcher m = pt.matcher(this.address);
		String chuoimoi = m.replaceAll("D");
		
		String mau1 = "Street";
		Pattern pt1 = Pattern.compile(mau1,Pattern.CASE_INSENSITIVE);
		Matcher m1 = pt1.matcher(chuoimoi);
		String chuoimoi1 = m1.replaceAll("S");
		
		String mau2 = "Road";
		Pattern pt2 = Pattern.compile(mau2,Pattern.CASE_INSENSITIVE);
		Matcher m2 = pt2.matcher(chuoimoi1);
		String chuoimoi2 = m2.replaceAll("R");
		
		return chuoimoi2;
	}
	
	
	public String standardizePhone()
	{
		String mau = "[\\ \t\n\r\f\b]+";
		Pattern pt = Pattern.compile(mau,Pattern.CASE_INSENSITIVE);
		Matcher m = pt.matcher(this.phonenumber);
		String chuoimoi = m.replaceAll("-");
		return chuoimoi;
	}
}
