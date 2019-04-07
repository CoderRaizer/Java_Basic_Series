package demo;

public class test {

	public static void chiahaiso(int a, int b) throws Myexception// nem ra de ham goi no pahi try-catch
	{
		try {
				int kq = a / b;
				System.out.println(kq);
			} catch (Exception e) {
			throw new Myexception("ERROR chia cho 0");// nem ra mot exception dong thoi truyen vao 1 chuoi cho class
		}
	}

	public static void main(String[] args) {
		try {
			chiahaiso(1, 0);
		} catch (Myexception e) {
			System.out.println(e.LoiNhapVao());
		}
	}
}
