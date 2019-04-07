package baitap_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Account {
	String accountname;
	int accountnumber;
	int accountbalance;

	public Account() {
		this.accountname = "";
		this.accountnumber = 0;
		this.accountbalance = 0;
	}

	public Account(String accountname, int accountnumber, int accountbalance) {
		this.accountname = accountname;
		this.accountnumber = accountnumber;
		this.accountbalance = accountbalance;
	}

	Scanner o = new Scanner(System.in);
	
	private Boolean check_String(String res) {
		char [] newArray = res.toCharArray();
		for(int i = 0 ; i < newArray.length ; i++) {
			Character kytu = new Character(newArray[i]);
			if(Character.isLetter(kytu) == false) {
				return false;
			}
		}
		return true;
	}

	public void nhap() {// RANH LAM LAI PHAN BAT LOI NHAP SO HAY KHONG NHAP NAME VA NUMBER
		do {
			try {
				o = new Scanner(System.in);
				System.out.print("nhap name: ");
				this.accountname = o.nextLine();

				System.out.print("nhap number: ");
				this.accountnumber = o.nextInt();

				System.out.print("nhap balance: ");
				this.accountbalance = o.nextInt();
				
				if (accountbalance < 100) {
					throw new thongbaoloi("Balance khong chinh xac!!!");// Ném lỗi ra cho một đối tượng (Đối tượng được kế thừa từ Exception
				} else if(this.check_String(accountname) == false) {
					throw new thongbaoloi("Name khong duoc ton tai ky tu dac biet!!!");
				}
				else break;
				
			} catch (thongbaoloi e) {
				System.out.println(e.geterror());
			} catch (InputMismatchException e) {
				System.out.println("PHAI NHAP DUNG TRUONG DU LIEU");
			}
		} while (true);
	}

	public String toString() {
		return "name: " + this.accountname + "\tnumber: " + this.accountnumber + "\tbalance: " + this.accountbalance
				+ "\n";
	}

}
