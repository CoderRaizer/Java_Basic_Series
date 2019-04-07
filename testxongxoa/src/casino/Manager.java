package casino;

public class Manager
{
	Khach abc[];//tao bien mang kieu Khach de cac phan tu cua mang (abc[i]) truy xuat duoc cac ham cua class Khach
	int count;

	public Manager()
	{
		this.abc = new Khach[10];
		this.count = 0;
	}
	
	
	public void AddThanhVien()
	{
		if(this.count < 10)
		{
			ThanhVien temp = new ThanhVien();
			temp.input();
			this.abc[this.count] = temp;
			this.count++;
		}
		else
			
		{
			System.out.println("-full-");
		}
	}
	
	
	
	public void AddVangLai()
	{
		if(this.count < 10)
		{
			VangLai temp = new VangLai();
			temp.input();
			this.abc[this.count] = temp;
			this.count++;
		}
		else
			System.out.println("-full-");
	}
	
	
	
	public void output()
	{
		for (int i = 0; i < this.count; i++)
		{
           this.abc[i].output();
           this.abc[i].tinhtienthang();
		}
	}
}
