package class_and_object;

import java.util.Scanner;

public class Account {

	int amount;// tien gui vao hay rut ra
	int balance = 3000000;// so du
	String setAccount = "123456";

	Scanner o = new Scanner(System.in);

	public int deposit(int tiengui)// ham nhap tien gui
	{
		int kq;
		do {
			System.out.print("So tien gui: [::::> ");
			this.amount = o.nextInt();// gan gia tri cho sotiengui
		} while (this.amount <= 0);
		kq = this.amount;
		return kq;
	}

	public int withdraw(int tienrut)// ham rut tien trong tai khoan
	{
		int kq;
		do {
			System.out.print("So tien rut: [::::> ");
			this.amount = o.nextInt();
		} while (this.amount <= 0);
		kq = this.amount;
		return kq;
	}

	
	public int getbalance(int tiengui, int tienrut) {
		int ret;
		ret = this.balance + tiengui - tienrut;// neu ban chon gui thi rut tu dong = 0; neu ban rut thi gui tu dong = 0;
		this.balance = ret;
		return ret;
	}

}
