package demo_collection;

import java.util.ArrayList;

public class Test
{

	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();//tao doi tuong tu class array co san trong java
		//them phan tu vao mang
		list.add(1);
		list.add(2);
		
		//kcih thuot mang
		System.out.println("so phan tu: "+list.size());
		
		//xuat mang
		for(int i = 0;i<list.size();i++)
		{
			System.out.println(list.get(i));//dua ra gia tri tung phan tu tai vi tri i
		}
		
		//xoa 1 phan tu trong mang
		list.remove(0);//xoa phan tu thu i
		System.out.println("xuat phan tu mang sau khi xoa: ");
		for(int i = 0;i<list.size();i++)
		{
			System.out.println(list.get(i));//dua ra gia tri tung phan tu tai vi tri i
		}
	}

}
