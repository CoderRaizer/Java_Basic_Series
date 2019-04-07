package overload_override;

public class SubClass extends SuperClass {

	@Override
	public float tong2so(float a) {
		System.out.println(super.tong2so(a));// tu khoa super goi den ham tong2so cua class SuperClass
		return a + 20;
		// return super.tong2so(a);
	}

	@Override
	public int tong2so(int a, int b)// neu public long..thi sai boi phai giu nguyen phuong thuc tra ve cua class cha
	{
		return a + b + 10;
		// return super.tong2so(a, b);
	}

	public static void main(String[] args) {
		
		SubClass sub = new SubClass();
		System.out.println(sub.tong2so(5f));// goi ham tu class con

//		SuperClass u = new SuperClass();
//		System.out.println(u.tong2so(5f));//goi ham tu class cha

		// --> se cho ra 2 ket qua khac nhau
	}
}
