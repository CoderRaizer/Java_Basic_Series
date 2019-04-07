package method_and_accessspecifier;

import java.util.Scanner;

public class NhanVien {
	private String maNV;
	private int soSP;

	Scanner o = new Scanner(System.in);

	public void setMaNV(String manv) {
		this.maNV = manv;
	}

	public String getMaNV() {
		return this.maNV;
	}

	public void setSoSP(int sosp) {
		if (sosp < 0) {
			this.soSP = 0;
		}
		this.soSP = sosp;
	}

	public int getSoSP() {
		return this.soSP;
	}

	public int coVuotChuan() {
		if (this.soSP > 500) {
			return 1;
		} else
			return 0;
	}

	public int getLuong() {
		if (soSP > 500) {
			return (30000 * (soSP - 500)) + (20000 * 500);
		} else
			return (20000 * soSP);
	}

	public void xuatnhanvien() {
		System.out.println("ma: " + this.maNV);
		System.out.println("so sp: " + this.soSP);
	}

	public String toString()// ham chuyen doi doi tuong thanh chuoi
	{
		return "ma nhav vien: " + this.maNV + "\nso san pham :" + this.soSP;
	}

}
