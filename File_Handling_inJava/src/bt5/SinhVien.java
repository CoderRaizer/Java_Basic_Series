package bt5;

import java.io.Serializable;

public class SinhVien implements Serializable {
	String masv;
	String hoten;
	String namsinh;
	String diachi;
	String lophoc;

	public SinhVien() {

	}

	public SinhVien(String masv, String hoten, String namsinh, String diachi, String lophoc) {
		this.masv = masv;
		this.hoten = hoten;
		this.namsinh = namsinh;
		this.diachi = diachi;
		this.lophoc = lophoc;
	}

	public String getMa() {
		return masv;
	}

	public void setMa(String masv) {
		this.masv = masv;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public String getNamsinh() {
		return namsinh;
	}

	public void setNamsinh(String namsinh) {
		this.namsinh = namsinh;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getLophoc() {
		return lophoc;
	}

	public void setLophop(String lophoc) {
		this.lophoc = lophoc;
	}

	@Override
	public String toString() {
		return "SinhVien [MASV: " + masv + "\tHOTEN: " + hoten + "\tNAM SINH: " + namsinh + "\tDIA CHI: " + diachi
				+ "\tLOP HOC: " + lophoc + "]";
	}
}
