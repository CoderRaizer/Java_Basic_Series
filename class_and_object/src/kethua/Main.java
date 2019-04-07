package kethua;

public class Main {

	public static void main(String[] args) {
		SinhVien x = new SinhVien();
		StandardStudent a = new StandardStudent();
		PremiumStudent b = new PremiumStudent();

		x.nhapthongtin();
		x.xuatthongtin();
		a.nhapthongtin();
		System.out.println(a);
		b.nhapthongtin();
		System.out.println(b);

	}

}
