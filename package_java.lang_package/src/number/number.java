package number;

public class number {

	public static void main(String[] args)
	{
		String number = "45";
		
		//ham math.-) no la 1 doi tuong cua class Math ma ben trong no co cac chuc nang
		//su dung Wrapper
		Byte byNum = Byte.valueOf(number);
		System.out.println(byNum);
		Short shNum = Short.valueOf(number);
		System.out.println(shNum);
		Integer inNum = Integer.valueOf(number);
		System.out.println(inNum);
		Long loNum = Long.valueOf(number);
		System.out.println(loNum);
		Float flNum = Float.valueOf(number);
		System.out.println(flNum);
		
		System.out.println((int)Math.pow(45, 2));
		System.out.println(Math.log(10));
		System.out.println(Math.sin(90));
		System.out.println(Math.cos(10));
		System.out.println(Math.tan(10));
		System.out.println(Math.ceil(7.2));//lam tron len
		System.out.println(Math.floor(7.8));//lam tron xuong
		System.out.println(Math.round(10.5));
		System.out.println(Math.sqrt(10));
	}

}
