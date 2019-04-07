package kethua;

import java.util.Scanner;

public class StandardStudent extends SinhVien {
	int engmark;

	Scanner o = new Scanner(System.in);

	public StandardStudent() {
		super();
	}

	public StandardStudent(int rollNo, String name, int engmark) {
		super(rollNo, name);
		this.engmark = engmark;
	}

	@Override
	public void nhapthongtin() {
		o = new Scanner(System.in);
		super.nhapthongtin();
		System.out.print("engmark: ");
		this.engmark = o.nextInt();
	}

	// ham xuat khong goi cha (ham cua rieng class con)
	public String toString() {
		return "SV:" + this.rollNo + "\t" + this.name + "\t" + this.engmark;
	}

}
