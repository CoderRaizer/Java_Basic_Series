package test_hinhhoc;

public class ShapeCollection
{
	int dem;
	
	Shape[] listshape;
	
	public ShapeCollection()
	{
		listshape = new Shape[5];//mang nay the hien tinh da hinh:chua duoc cac phan tu co ban chat khac nhau nhung deu cung duoc ke thua boi class cha la interface
		dem = 0;
	}
	
	
	public void AddCricle()
	{
		if(this.dem < 5)
		{
			Circle temp = new Circle();
			temp.nhap();
			listshape[this.dem] = temp;
			dem++;
		}
		else
		{
			System.out.println("full");
		}
	}
	
	public void AddRectangle()
	{
		if(this.dem < 5)
		{
			Rectangle temp = new Rectangle();
			temp.nhap();
			listshape[this.dem] = temp;
			dem++;
		}
		else
		{
			System.out.println("full");
		}
	}
	
	public void show()
	{
		for(int i = 0;i<dem;i++)
		{
			System.out.println(listshape[i]);
		}
	}
}
