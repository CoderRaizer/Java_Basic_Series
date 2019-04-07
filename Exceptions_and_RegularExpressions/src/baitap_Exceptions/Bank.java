package baitap_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bank {
	Account[] accList;
	int accMax;
	int nextAccount;

	int sotaikhoan;
	int sotiengui;
	int sotienrut;

	Scanner o = new Scanner(System.in);

	public Bank() {
		this.accMax = 10;
		this.nextAccount = 0;
		accList = new Account[accMax];
	}

	public void createAccount() {
		if (this.nextAccount < this.accMax) {
			Account temp = new Account();
			temp.nhap();
			accList[this.nextAccount] = temp;
			nextAccount++;
		}
	}

	public void deposit() {//ham gui tien
		do {
			int index = 0;// xet i
			int i;
			int xet = 0;
			try {
				o = new Scanner(System.in);
				System.out.println("nhap so tai khoan: ");
				this.sotaikhoan = o.nextInt();

				for (i = 0; i < nextAccount; i++) {
					if (this.sotaikhoan == accList[i].accountnumber) {
						xet = 1;// co tai khoan ton tai
						index = i;
					}
				}
				if (xet != 1)
					throw new thongbaoloi("Khong ton tai tai khoan");

				////////
				System.out.println("nhap so tien gui: ");
				this.sotiengui = o.nextInt();
				if (this.sotiengui < 0)
					throw new thongbaoloi("So tien gui khong hop le");
				else
					accList[index].accountbalance += sotiengui;
				break;
			} catch (InputMismatchException e) {
				e.fillInStackTrace();
			} catch (thongbaoloi e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while (true);
	}

	public void withdraw()// ham rut tien
	{
		do {
			int a = 0;
			int i;
			int xet = 0;
			try {
					o = new Scanner(System.in);
					System.out.println("nhap so tai khoan: ");
					this.sotaikhoan = o.nextInt();
				
					for (i = 0; i < nextAccount; i++) {
						if (this.sotaikhoan == accList[i].accountnumber) {
						xet = 1;// co tai khoan ton tai
						a = i;
						}
					}
					if (xet != 1)
					throw new thongbaoloi("khong ton tai");

					System.out.println("nhap so tien rut: ");
					this.sotienrut = o.nextInt();
					if (this.sotienrut > accList[a].accountbalance)
						throw new thongbaoloi("So Du trong tai khoan khong du");
					else
						accList[a].accountbalance -= sotienrut;
					break;
				}catch (thongbaoloi e) {
				System.out.println(e.geterror());
			}

		} while (true);
	}
	
	public void display() {
		for (int i = 0; i < nextAccount; i++) {
			System.out.println(accList[i]);//System.out.println(object) mặc định gọi tới hàm toString
		}
	}


}//END
