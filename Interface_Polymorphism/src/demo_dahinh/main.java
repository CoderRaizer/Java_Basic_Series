package demo_dahinh;

public class main {

	public static void main(String[] args) {
		Employee a = new Employee();
		Employee b = new Worker();
		Employee c = new Office();

		Employee abc[] = new Employee[3];
		// da hinh la trong mot mang,co nhieu phan tu thi cac phan tu do co ban la khac
		// nhau nhung van ke thua tu 1 cha,van co lien quan gi do voi nhau

		abc[0] = a;
		abc[1] = b;
		abc[2] = c;

		for (Employee x : abc) {
			x.out();
		}
	}

}
