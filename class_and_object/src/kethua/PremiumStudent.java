package kethua;

import java.util.Scanner;

public class PremiumStudent extends SinhVien {
	int mathMark;

	Scanner o = new Scanner(System.in);

	public PremiumStudent() {
		super();
	}

	public PremiumStudent(int rollNo, String name, int mathMark) {
		super(rollNo, name);
		this.mathMark = mathMark;
	}

	@Override
	public void nhapthongtin() {
		super.nhapthongtin();
		System.out.print("mathMark: ");
		this.mathMark = o.nextInt();
	}

	// ham xuat khong goi cha(ham cua rieng class con)
	public String toString() {
		return "SV:" + this.rollNo + "\t" + this.name + "\t" + this.mathMark;
	}
}
