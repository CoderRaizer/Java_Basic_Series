package khanh_start_java;

import java.util.Scanner;
import java.util.Date;
import java.util.Random;
import java.math.*;
import java.text.SimpleDateFormat;;


public class coban//cover
{
	
	public static void min(int arr[]) //HAM TINH GIA TRI MIN
	{
		int min = arr[0];
		for(int i=1;i < arr.length;i++)
		{
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
			System.out.print("min la: "+ min);
	}

	
	public static void hamDaoNguoc(int[]a)//a ginog nhu mot mang trong da duoc nhan gia tri tu mang arr ben duoi nhung khac ten
	{
		  int[]b  = new int[a.length];//khai bao mang khac voi kich thuot dung bang mang truyen len--
		  //phuong thuc length luc nay da truy xuat duoc gia tri so phan tu cua mang truyen len thong qua ten mang cuc bo da nhan du lieu tu ham ben duoi
		  int x = a.length;//list.length la kich thuoc --- dong nay khoi tao mang moi co ten result va co so phan tu bang <list.length>
		  System.out.println("so phan tu mang truyen len la: "+x);
		  // vong lap de dao nguoc mang
		  for (int i = 0, j = a.length - 1/*x*/; i < a.length; i++,j--)//j co the bang x
		  {
		    b[j] = a[i];
		  }
		  // vong lap foreach de hien thi cac phan tu trong mang dao nguoc
		  for (int u: b)
		  {
		     System.out.print(+u+"\n");
		  }
	}
	
	
	public static void tong(int abc[],int n)//khac ten mang cung duoc
	{
		int tong = 0;
		for(int i=0;i<n;i++)
		{
			tong += abc[i];
		}
	System.out.println("tong = "+tong);
	}
	

	public static void sapxeptangdan(int v[],int n)
	{
		for(int i=0;i<n;i++)
		{
			
			for(int j = i+1;j<n;j++)
			{
				if(v[i] > v[j])
				{
					int temp;
					temp = v[i];
					v[i] = v[j];
					v[j] = temp;
				}
			}

			System.out.println(+v[i]);
		}

	}
	
	
	/*----------------HAM MAIN----------------*/
	public static void main(String[] args)
	{
		Scanner o = new Scanner(System.in);
		
		/*--------------------------------------------------------------------------*/
//		int n;
//		Random rd = new Random();// tao mot bien de chua cac gia trij ngau nhien
//		System.out.println("nhap so phan tu mang: ");
//		n = o.nextInt();
//		int []abc = new int[n];//int a[];
//		for (int i=0;i <n;i++)// n = abc.length cung duoc vi mang da tiep nhan n la so phan tu
//		{
//			abc[i] = rd.nextInt(10);//cac gia tri ngau nhien se nam trong khoang tu 0-10
//		}
//		for(int i=0;i<n;i++)
//		{
//			System.out.println("abc "+i+"= "+abc[i]);
//		}
//		tong(abc,n);
//		sapxeptangdan(abc,n);
//		for(int i = 0 ; i < n ; i++)
//		{
//			System.out.println(abc[i]+" ");
//		}
		/*--------------------------------------------------------------------------*/
		
		
		
		/*-----------------------TRUY XUAT THOI GIAN THUC---------------------------*/
//		Date date = new Date();
//		System.out.print(date.toString());
//		Date dNow = new Date();
//		SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss: a zzz");
//		System.out.print("Date hien tai: "+ft.format(dNow) );
		/*-----------------------TRUY XUAT THOI GIAN THUC---------------------------*/
		
		
		/*---------------------MANG 2 CHIEU----------------------*/
//		int size1;
//		int size2;
//		System.out.print("dong: ");
//		size1=o.nextInt();
//		System.out.print("cot: ");
//		size2=o.nextInt();
//		int [][]x = new int [size1][size2];
//		
//		for(int i=0;i < size1; i++)
//		{
//			for(int j = 0;j<size2;j++)
//			{
//				System.out.print("x["+i+"]["+j+"] = ");
//				x[i][j] = o.nextInt();
//			}
//		}
//		
//		for(int i=0;i<size1;i++)
//		{
//			for(int j=0;j<size2;j++)
//			{
//				System.out.println("x["+i+"]["+j+"] = "+x[i][j]);
//			}
//		}
		
		
		
//		int [] arr = {1,2,3,4,5,6,7,8,9};//thong nhat la khi vua khai bao vua cho gia tri thi dung kieu khai bao nay
//		hamDaoNguoc(arr);//goi ham
		
		
		
		//VONG FOR-EACH 
//		int []a = {1,2,3,4,5,6,7,8,};
		
//		for(int des : a)//vong foreach cho phep truy xuat mang mot cach lien tuc ma khong can chi muc
//		{
//			System.out.print(des+"\n");
//		}
		
		
		
		
		//TIM MIN TRONG MANG
//		int []arr = new int[7];//int a[];
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.print("a"+i+" = ");
//			arr[i] = o.nextInt();
//		}
//		min(arr);
		

		
		
//		for(int i=0;i<a.length;i++)//length la thuoc tinh cua mang(tu 0 toi  Bien_tham_chieu_mang.length-1)
//		System.out.println(a[i]);
		
//		int a[]={33,3,4,5};//khai bao + khoi tao gia tri phan tu mang
//		for(int i=0;i<a.length;i++)//length la thuoc tinh cua mang 
//		System.out.println(a[i]);
		
		
		
		//TAO GIA TRI NGAU NHIEN
//		double randomnumber = Math.random();
//		System.out.printf("random number = : "+randomnumber);//tao 1 bien ngau nhien co gia tri trong khoang (0;1)
		
		
		
		
		//--------------------//
//		int a = 3,b = 4,c=5;
//		int result = Math.max(a,b);
//		int max = Math.max(result, c);
//		//int max = Math.max(Math.max(a,b),c);//co the bo dong int result
//		int x;
//		double kq;
//		System.out.printf("nhap x: ");
//		x=o.nextInt();
//		kq = (3*Math.pow(x,3)) - (5*Math.pow(x,2)) + 6;
//		System.out.println("kq = "+kq);
		
		
		
		
//		int y;
//		double kq;
//		System.out.printf("nhap y: ");
//		y=o.nextInt();
//		kq = Math.sqrt(y);
//		System.out.println("kq = "+kq);
		
		
		
		
//		int dai,rong;
//		long chuvi,dientich;
//		System.out.printf("nhap chieu dai: ");
//		dai=o.nextInt();
//		o = new Scanner(System.in);
//		System.out.printf("nhap chieu rong: ");
//		rong=o.nextInt();
//		System.out.println("chu vi = "+((dai+rong)*2));
//		System.out.println("dien tich = "+(dai*rong));
		
		
		
		
//		final double pi = 3.14;
//		int r;
//		System.out.println("nhap ban kinh: ");
//		r = o.nextInt();
//		System.out.println("dien tich hinh tron la: "+(r*r*pi));
//		System.out.println("chu vi hinh tron la: "+(r*2*pi));
		
		
		
		//---------------------------//
//		int gio,phut,giay;
//		System.out.print("nhap gio: ");
//		gio=o.nextInt();
//		System.out.print("nhap phut: ");
//		phut=o.nextInt();
//		System.out.print("nhap giay: ");
//		giay=o.nextInt();
//		System.out.print("so giay la : "+((gio*3600)+(phut*60)+giay));
		
//		int giay;
//		System.out.print("nhap giay: ");
//		giay=o.nextInt();
//        System.out.print(""+(giay/3600)+"gio"+" ");//lay phan nguyen cua phep chia nay ta duoc so gio
//		System.out.print(""+((Math.floorMod(giay,3600)/60))+"phut"+" ");//phut bang so giay chia cho 3600 ra so h, sau do lay so du chia cho 60
//		System.out.print(""+(giay-((giay/3600)*3600)-((Math.floorMod(giay,3600)/60)*60))+"giay"+" ");//giay du = tong so giay tru cho (so gio x 3600) - (so phut x 60)
		
		
		//---------------------//
//		int tnct;
//		final long lcb = 650000;
//		System.out.print("nhap tnct : ");
//		tnct = o.nextInt();
//		if(tnct < 12)
//		{
//			System.out.print("luong : "+(float)(1.92*lcb));
//		}
//		else if(12 <= tnct && tnct <36)
//		{
//			System.out.print("luong : "+(float)(2.34*lcb));
//		}
//		else if(36 <= tnct && tnct< 60)
//		{
//			System.out.print("luong : "+(float)(3*lcb));
//		}
//		else if( tnct >=60)
//		{
//			System.out.print("luong : "+(float)(2.34*lcb));
//		}
		
		
		//-----------------------//
//		int a,b;
//		float x;
//		System.out.print("nhap a : ");
//		a=o.nextInt();
//		System.out.print("nhap b : ");
//		b=o.nextInt();
//		if(a == 0)
//		{
//			if(b==0)
//			{
//				System.out.println("pt vo so nghiem!");
//			}
//			if(b != 0)
//			{
//				System.out.println("pt vo nghiem!");
//			}
//		}
//		
//		if(a!=0)
//		{
//			if(b==0)
//			{
//				System.out.println("x = "+0);
//			}
//			if(b!= 0)
//			{
//				x =(float) -b/a;
//				System.out.println("x = "+x);
//			}
//		}
		
		
		
		//-----------------------//
//		String tk = "voduykhanh";
//		int PASS = 123456;
//		String id;
//		int pass;
//		
//		do
//		{
//			System.out.print("nhap ID: ");
//			id = o.nextLine();
//		}while(id.equalsIgnoreCase(tk)==false);
//		
//		do
//		{
//			System.out.printf("nhap password: ");
//			pass = o.nextInt();
//		}
//		while(pass != PASS );
//		
//		
//		System.out.printf("dang nhap thanh cong\n\nMOI BAN GIAI PT BAC 2\n[*.*.*.*.*.*.*.*.*.*]\n");
//		int chon;
//		int a,b,c;
//		float deta;
//		float x1,x2;
//		tt:
//		System.out.printf("a = ");
//		a = o.nextInt();
//		System.out.printf("b = ");
//		b = o.nextInt();
//		System.out.printf("c = ");
//		c = o.nextInt();
//
//		System.out.println("\n\n--------------\n");
//		if(a == 0)
//		{
//			if(b == 0 )
//			{
//				System.out.print("phuong trinh vo nghiem");
//			}
//			else
//			{
//				x1=(float)-c/b;
//				System.out.printf("x = "+Math.round(x1*100)/100);/*lam tron so thap phan den chu so thu 2 dung 100*/
//			}
//		}
//		
//		else
//		{
//			deta = b*b - 4*a*c;
//			if(deta < 0)
//			{
//				System.out.printf("phuong trinh vo nghiem");
//			}
//			else if(deta == 0)
//			{
//				x1 = (float)-b/(2*a);
//				System.out.print("x1=x2="+Math.round(x1*100)/100);
//			}
//			else if(deta > 0)
//			{
//				x1= (float)(-b+Math.sqrt(deta))/(2*a);
//				x2= (float)(-b-Math.sqrt(deta))/(2*a);
//				System.out.println("x1 = "+Math.round(x1*100)/100);
//				System.out.print("x2= "+Math.round(x2*100)/100);
//				System.out.print("\n");
//			}
//		}
		
		
		//--------------//
//		int thang,nam;
//		System.out.print("nhap thang: ");
//		thang = o.nextInt();
//		System.out.print("nhap nam: ");
//		nam = o.nextInt();
//		switch (thang)
//		{
//		case 1:
//		case 3:
//		case 5:
//		case 7:
//		case 8:
//		case 10:
//		case 12: System.out.printf("thang co 31 ngay");break;
//		case 4:
//		case 6:
//		case 9:
//		case 11: System.out.printf("thang co 30 ngay");break;
//		case 2: if(nam % 400 ==0 || (nam % 4 ==0 && nam % 100 !=0))
//		{
//			System.out.printf("thang co 29 ngay! ");
//		}
//		else
//		{
//			System.out.print("thang co 28 ngay");
//		}
//
//		}
		
//		next() : nhập vào một chuỗi các ký tự không chứa khoảng trắng.
//		nextLine() : nhập vào một chuỗi các ký tự (được phép có khoảng trắng).
		
		
		//---------------//
//		int chon;
//		int diem =0;
//		int bonus =0;
//		int choice;
//		int tl;
//		int u =0;
//		int e=0;
//		int f=0;
//		int t =0;
//		System.out.printf("CHAO MUNG BAN DEN VOI CHUONG TRINH TEST IQ!!\n");
//		System.out.printf("BAN CO MUON THAM GI BAI TEST!!\n");
//		System.out.printf("1-THAM GIA\n0-KHONG THAM GIA\n");
//		System.out.printf("1 OR 0: ");
//		chon = o.nextInt();
//		if(chon == 1)
//		{
//			
//			System.out.println("1.Aptitude");
//			System.out.println("2.English");
//			System.out.println("3.Mathematics");
//			System.out.println("4.General Knowledge");
//			System.out.println("5.Exit!");
//			do
//			{
//				System.out.print("choice: ");
//				choice = o.nextInt();
//				switch (choice)
//				{
//				
//				case 1:
//				{
//					if(u == 0)
//					{
//						System.out.println("ban co nang khieu khong?");
//						System.out.print("1.co\n2.khong");
//						tl = o.nextInt();
//						if(tl == 1)
//						{
//							diem += 10;
//						}
//					}
//					else
//					{
//						System.out.printf("ban da lam roi!");
//					}
//					
//				}u=1;break;//bien tam u de xac nhan la da lam cau nay hay chua,neu khi u =1,thi u khong dc vao dk if nua
//				
//				case 2:
//				{
//					if(e==0)//nay da khac
//					{
//						System.out.println("i______gone to your house yesterday!");
//						System.out.print("1.was\n2.had\n3.have\n4.were");
//						tl = o.nextInt();
//						if(tl == 2)
//						{
//							diem += 10;
//						}
//					}
//					else
//					{
//						System.out.printf("ban da lam roi!");
//					}
//					
//				}e=1;break;
//				
//				case 3:
//				{
//					if(f==0)
//					{
//						System.out.println("2=4\n3=6\n4=12\n7=?");
//						System.out.print("1.10\n2.40\n3.31\n4.18");
//						tl = o.nextInt();
//						if(tl == 4)
//						{
//							diem+=10;
//						}
//					}
//					else
//					{
//						System.out.printf("ban da lam roi!");
//					}
//				}f=1;break;
//				
//				
//				case 4:
//				{
//					if(t==0)
//					{
//						System.out.println("trai dat cach mat trang bao nhieu km?");
//						System.out.print("1.200000km\n2.380000km\n3.400000km\n4.50000km");
//						tl = o.nextInt();
//						if(tl == 2)
//						{
//							diem+=10;
//						}
//					}
//					else
//					{
//						System.out.printf("ban da lam roi!");
//					} 
//				}t=1;break;
//				
//				case 5:
//				{
//					System.out.print("CLOSE PROGRAM!");
//				}
//				
//			}
//
//			}while(choice != 5);//kt do
//			
//		}//bao quanh vong do-while
//		if(diem == 10)
//		{
//			bonus=0;
//		}
//		if(diem == 20)
//		{
//			bonus=2;
//		}
//		if(diem == 30)
//		{
//			bonus=5;
//		}
//		if(diem == 40)
//		{
//			bonus=10;
//		}
//		System.out.println("Bonus points earned: "+bonus);
//		System.out.println("Total score out of: "+(diem+bonus));
//		
//		int iq = (diem+bonus);
//		if(iq == 10)
//		{
//			System.out.println("Your IQ lever is below average!");
//		}
//		if(iq == 22)
//		{
//			System.out.println("Your IQ lever is average!");
//		}
//		if(iq == 35)
//		{
//			System.out.println("Your are intelligent!!");
//		}
//		if(iq == 50)
//		{
//			System.out.println("Your are a Genius!");
//		}
//		if(iq == 0)
//		{
//			System.out.println("You need reappear the test!");
//		}
		
		
		
		
		//------------------//
//		int n;
//		System.out.printf("nhap n: ");
//		n = o.nextInt();
//		int giaithua =1;
//		for(int i=1;i<=n;i++)
//		{
//			giaithua *= i;
//		}
//		System.out.printf("kq = "+ giaithua);
//
//		for(int i = 100;i>=5;i-=5)
//		{
//			System.out.printf(" "+i);
//		}
//		
//		int s=0;
//		int i=1;
//		while(s<1000)
//		{
//			s+=i;
//			i++;
//			if(s>i)
//			{
//				break;
//			}
//		}
//		System.out.printf("n nho nhat la "+i);
		
		
		
		//-------------------------------------//
//		System.out.printf("IN BANG CUU CHUONG");
//		int choice;
//		System.out.printf("ban muon in ra cuu chuong may: ");
//		choice = o.nextInt();
//		switch(choice)
//		{
//		
//		case 2:
//		{
//			for(int i = 1;i<=10;i++)
//			{
//				System.out.println("2 x "+i+"= "+(2*i));
//			}
//		}break;
//		
//		case 3:
//		{
//			for(int i = 1;i<=10;i++)
//			{
//				System.out.println("3 x "+i+"= "+(3*i));
//			}
//		}break;
//		
//		case 4:
//		{
//			for(int i = 1;i<=10;i++)
//			{
//				System.out.println("4 x "+i+"= "+(4*i));
//			}
//		}break;
//		
//		case 5:
//		{
//			for(int i = 1;i<=10;i++)
//			{
//				System.out.println("5 x "+i+"= "+(5*i));
//			}
//		}break;
//		
//		case 6:
//		{
//			for(int i = 1;i<=10;i++)
//			{
//				System.out.println("5 x "+i+"= "+(6*i));
//			}
//		}break;
//		
//		case 7:
//		{
//			for(int i = 1;i<=10;i++)
//			{
//				System.out.println("7 x "+i+"= "+(7*i));
//			}
//		}break;
//		
//		case 8:
//		{
//			for(int i = 1;i<=10;i++)
//			{
//				System.out.println("8 x "+i+"= "+(8*i));
//			}
//		}break;
//		
//		case 9:
//		{
//			for(int i = 1;i<=10;i++)
//			{
//				System.out.println("9 x "+i+"= "+(9*i));
//			}
//		}
//		
//		}
		
		
		//----------------------------------//
//		String pass = "abc123";
//		String pass1;
//		int dem=0;
//		do
//		{
//			System.out.printf("nhap password: ");
//			pass1 = o.nextLine();
//			
//			
//			if(pass1 != pass)
//			{
//				dem+=1;
//			}
//			if(pass1 == pass)
//			{
//				System.out.printf("LOGIN SUCCESS!");break;
//			}
//			
//			if(dem == 3)
//			{
//				System.out.printf("SORRY.ID WAS LOCKER!!");
//				break;
//			}
//
//		}
//		while(pass1 != pass);
		
		
		
		//-------------------------------//
//		int a,b;
//		System.out.print("nhap a: ");
//		a=o.nextInt();
//		System.out.print("nhap b: ");
//		b=o.nextInt();
//		
//		for(int i=1;i<=a;i++)
//		{
//			for(int j=1;j<=b;j++)
//			{
//				if(i==a || i==1 || j==b || j==1)
//				{
//					System.out.print("* ");
//				}
//				else
//				{
//					System.out.print("  ");
//				}
//			}
//			System.out.print("\n");
//		}
		
		
		
		
		//------------------------------//
//		int h;
//		System.out.print("nhap h: ");
//		h=o.nextInt();
//		for(int i=h;i>0;i--)
//		{
//			for(int j=i;j>0;j--)
//			{
//				System.out.print("o");
//			}
//			System.out.print("\n");
//		}
//		
//		
//		//-----------------------------//
//		int so1=1,so2=1;
//		int so=0;//gan 1 gia tri tam thoi cho bien de vong lap while co gia tri de so sanh
//		System.out.print(""+so1+" "+so2+" ");
//		
//		while(so<100)//
//		{
//			so = so1+so2;
//			if(so > 100)
//			{
//				break;
//			}
//			System.out.print(""+so+"  ");
//			so1=so2;
//			so2=so;		
//		}
		
		
		//-----------------------------------------//
//		char ch ;
//		System.out.print("nhap ky tu: ");
//		ch=o.nextLine().charAt(0);//lay 1 ky tu dau tien dong do
//		if(ch<'a' || ch>'z')
//		{
//			System.out.print("KHONG PHAI CHU THUONG!");
//		}
//		else
//		{
//			switch(ch)
//			{
//			case 'a':
//			case 'e':
//			case 'o':
//			case 'u':
//			case 'i':System.out.print("nguyen am");break;
//			
//			case 'z':System.out.print("cuoi bang chu cai!");break;
//			
//			default: System.out.println("phu am");
//			}
//		}
		
	//----------------------------------------------//	
		//TAO RA GIA TRI NGAU NHIEN TU 10 - 20
//		int min = 10;
//		int max = 20;
//		int range = (max-min)+1;
//		int randomnumber;
//		randomnumber = 	(int)(Math.random() * range) + min;//do ham random ra gtri so thuc nen can chuyen qua kieu int
//		System.out.print(+randomnumber);
		
		
		
		

		
	}

}
