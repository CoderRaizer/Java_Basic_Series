package Interface_polymophism;

import java.util.Scanner;

public class VangLai extends Khach {
	int phithamgia;

	Scanner o = new Scanner(System.in);

	public VangLai() {
		super();
		this.phithamgia = 10000;
	}

	public VangLai(int passport, String name, int tiencuoc, int phithamgia) {
		super(passport, name, tiencuoc);
		this.phithamgia = phithamgia;
	}

	@Override
	public void input() {
		super.input();
		System.out.print("phi tham gia: ");
		this.phithamgia = o.nextInt();
	}

	@Override
	public void output()// ghi de in ra them cac thuoc tinh cua no
	{
		System.out.println("\nVANGLAI");
		super.output();
		System.out.println("Phi tham gia : " + this.phithamgia);//
	}

	@Override
	public void tinhtienthang()
	{
		System.out.println("Tien thang cuoc la : " + (this.tiencuoc - this.phithamgia));
	}
}
