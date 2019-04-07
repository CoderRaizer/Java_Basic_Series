package method_and_accessspecifier;

public class SinhVien {
	private String masv;
	private String hoten;
	private int diemlt;
	private int diemth;

	public SinhVien() {
		this.masv = "";
		this.hoten = "";
		this.diemlt = 0;
		this.diemth = 0;
	}
	

	public SinhVien(String masv, String hoten, int diemlt, int diemth) {
		this.masv = masv;
		this.hoten = hoten;
		this.diemlt = diemlt;
		this.diemth = diemth;
	}


	public void setMasv(String masv) {
		this.masv = masv;
	}

	public String getMasv() {
		return this.masv;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public String sethoten() {
		return this.hoten;
	}

	public void setDiemlt(int diemlt) {
		this.diemlt = diemlt;
	}

	public int getDiemlt() {
		return this.diemlt;
	}

	public void setDiemth(int diemth) {
		this.diemth = diemth;
	}

	public int getDiemth() {
		return this.diemth;
	}

	public String toString()// ham cho phep class ben ngoai chuyen doi tuong sinh vien thanh chuoi bang
							// phuong
							// thuc System.out.(SinhVien);
	{
		return "manv:" + this.masv + "\t hoten:" + this.hoten + "\t diemlt: " + this.diemth + "\t diemth: "
				+ this.diemth;
	}

}
