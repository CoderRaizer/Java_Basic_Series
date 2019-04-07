package method_and_accessspecifier;

public class hinhtamgiac {
	private int ma = 0;
	private int mb = 0;
	private int mc = 0;
	// 3 canh cua tam giac
	
	public hinhtamgiac() {
		
	}
	
	public hinhtamgiac(int ma, int mb, int mc) {
		super();
		this.ma = ma;
		this.mb = mb;
		this.mc = mc;
	}
	
	

	public void setCanhA(int canh_a) {
		this.ma = canh_a;
	}


	public int getCanhA() {
		return this.ma;
	}

	public void setCanhB(int canh_b) {
		this.mb = canh_b;
	}

	public int getCanhB() {
		return this.mb;
	}

	public void setCanhC(int canh_c) {
		this.mc = canh_c;
	}

	public int getCanhC() {
		return this.mc;
	}

	public boolean checkTamGiac() {
		if (this.ma + this.mb > this.mc && this.ma + this.mc > this.mb && this.mb + this.mc > this.ma) {
			return true;
		} else
			return false;
	}

	public void xuatthongtin() {
		System.out.println(this.ma);
		System.out.println(this.mb);
		System.out.println(this.mc);
		System.out.println("=================\n");
	}

	public void getChuVi() {
		int chuvi = this.ma + this.mb + this.mc;
		System.out.print("chu vi la: " + chuvi + "\n");
	}

	public void getDientich() {
		double DT;
		double p;
		p = (double) (this.ma + this.mb + this.mc) / 2;
		DT = Math.sqrt(p * (p - this.ma) * (p - this.mb) * (p - this.mc));
		System.out.print("dien tich la: " + (double) DT + "\n");
	}

}
