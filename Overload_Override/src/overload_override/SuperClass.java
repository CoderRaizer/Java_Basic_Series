package overload_override;

public class SuperClass {
	
	public int tong2so(int a, int b) {
		return a + b;
	}

	public long tong2so(int a, long b) {
		return a + b;
	}

	public float tong2so(float a, float b) {
		return a + b;
	}

	public float tong2so(float a) {
		return a + 10;
	}
	
	public static void main(String[] args) {
		SuperClass o = new SuperClass();
//		o.tong2so(5, 5);// goi den 5
//		o.tong2so(5, 10L);// goi den 10
//		o.tong2so(10F);// goi den 21
	}
}
