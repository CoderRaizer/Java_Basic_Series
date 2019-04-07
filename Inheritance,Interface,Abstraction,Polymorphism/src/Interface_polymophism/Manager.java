package Interface_polymophism;

import java.util.Scanner;

public class Manager {
	Khach[] list_client;
	int count;

	public Manager() {
		this.list_client = new Khach[SetQuantityClient()];
		this.count = 0;
	}
	
	private int SetQuantityClient() {
		System.out.println("Nhap So Luong Client co the luu tru: ");
		Scanner o = new Scanner(System.in);
		return o.nextInt();
	}
	
	public void AddThanhVien() {
		if (count < 10) {
			ThanhVien temp = new ThanhVien();
			temp.input();
			list_client[this.count] = temp;
			count++;
		} else {
			System.out.println("-full-");
		}
	}

	public void AddVangLai() {
		if (count < 10) {
			VangLai temp = new VangLai();
			temp.input();
			list_client[this.count] = temp;
			count++;
		} else
			System.out.println("-full-");
	}

	public void output() {
		for (int i = 0; i < this.count; i++) {
			this.list_client[i].output();
			this.list_client[i].tinhtienthang();
		}
	}
}
