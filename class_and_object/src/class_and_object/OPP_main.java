package class_and_object;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class OPP_main {

	public static void main(String[] args) {

		Scanner o = new Scanner(System.in);

		robot a = new robot();
		// System.out.println(rb.cao);
		// System.out.println(rb.cannang);
		// System.out.println(rb.mausac);
		// System.out.println(rb.model);
		//
		// rb.xuatthongtin();
		// rb.chao();
		// rb.leocauthang();
		//
		// robot b = new robot();
		// b.leocauthang();
		//
		// robot c = new robot(103, 204, "blue", "v2017");
		// // dua du lieu vao ben trong robot
		// c.xuatthongtin();
		//
		// System.out.print("chieu cao:");
		// int chieucao = o.nextInt();
		//
		// System.out.print("can nang:");
		// int cannang = o.nextInt();
		// o = new Scanner(System.in);
		//
		// System.out.print("mau sac:");
		// String mausac = o.nextLine();
		//
		// o = new Scanner(System.in);
		//
		// System.out.print("model:");
		// String model = o.nextLine();
		//
		// robot d = new robot(chieucao, cannang, mausac, model);// ->41 in class robot
		// System.out.print(d);// in ra doi tuong d nho vao ham toString trong class

		// HINH CHU NHAT
		// hinhchunhat a = new hinhchunhat();//goi default constructor
		// a.xuat();
		// a.tinhCV();
		// System.out.println("Sa1 = "+a.tinhDt(a.dai, a.rong));//<- 34 in class
		//
		// a.nhap();
		// a.xuat();
		// a.tinhCV();
		// System.out.println("Sa2 = "+a.tinhDt(a.dai, a.rong));//<- 34 in class
		//
		// hinhchunhat e = new hinhchunhat(10,20);//->15 in class hinhchunhat
		// e.xuat();
		// e.tinhCV();
		// System.out.println("Se1 = "+e.tinhDt(e.dai, e.rong));//<- 34 in class
		//
		// e.nhap();
		// e.xuat();
		// e.tinhCV();
		// System.out.println("Se2 = "+e.tinhDt(e.dai, e.rong));//<- 34 in class

		// ------------------//

		// SINHVIEN

		// sinhvien sv = new sinhvien();
		// sv.nhapSV();
		// sv.xuatSV();
		// System.out.print("diem tb la: "+sv.diemtb(sv.diemtoan,sv.diemvan));

		// ----------------//

		/*-------------------------------------------------------------------------*/
		// Date dNow = new Date();
		// SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss: a
		// +zzz");
		// System.out.print(ft.format(dNow) + "\n\n");
		//
		// int sotienrut = 0;
		// int sotiengui = 0;
		// int dem = 0;// dem so lan nhap sai
		// int quaytrove;
		//
		// Account myaccount = new Account();
		// String accountNo;// dung de kiem tra ma tai khoan
		//
		// do {
		// System.out.print("Ma tai khoan:[::::> ");
		// accountNo = o.nextLine();
		//
		// if (accountNo.compareTo(myaccount.setAccount) != 0)// so sanh 2 chuoi s1 =
		// s2->0/s1>s2->duong/s1<s2->am
		// System.out.println("ma nguoi dung sai!");
		// dem += 1;
		// if (accountNo.compareTo(myaccount.setAccount) == 0) {
		// dem = 3;// de sai dieu kien while de nhay ra thuc hien giao dich
		// }
		// // mat khau nguoi dung nhap vao
		// } while (dem < 3);// gia tri trong while phai la gia tri nguyen khai bao ben
		// // sai qua 3 lan thi se khong vao cai choice nao nen di thang xuong se tro
		// // sau 10'
		//
		// do {
		// if (accountNo.compareTo(myaccount.setAccount) == 0)// so sanh 2 chuoi s1 =
		// s2->0/s1>s2->duong/s1<s2->am
		// {
		// int choice;
		// System.out.println("1.Gui tien");
		// System.out.println("2.Rut Tien");
		// System.out.println("3.van tin tai khoan");
		// System.out.print("lua chon: ");
		// choice = o.nextInt();
		//
		// if (choice == 1)// gui tien
		// {
		// sotiengui = myaccount.deposit(sotiengui);
		// // sotienrut = 0
		// System.out
		// .print("So du con lai trong tai khoan la: " + myaccount.getbalance(sotiengui,
		// 0) + "VND\n");// goi
		// // ham
		// // getbalance
		// // de
		// // tinh
		// // so
		// // du
		// }
		//
		// if (choice == 2)// rut tien
		// {
		// do {
		// sotienrut = myaccount.withdraw(sotienrut);
		// // sotiengui = 0;
		// if (sotienrut > myaccount.balance) {
		// System.out.println("So du Tai Khoan quy khach khong du! ");
		// }
		// } while (sotienrut > myaccount.balance);// so tien rut phai nho hon so du
		//
		// // sotiengui = 0
		// System.out
		// .print("So du con lai trong tai khoan la: " + myaccount.getbalance(0,
		// sotienrut) + "VND\n");//// goi
		// //// ham
		// //// getbalance
		// //// de
		// //// tinh
		// //// so
		// //// du
		// }
		//
		// if (choice == 3) {
		// System.out.println("tai khoan quy khach hien co : " + myaccount.balance +
		// "\n");
		// }
		//
		// }
		//
		// else {
		// System.out.println("============================");
		// System.out.print("please come back in 10 minutes!\n");
		// }
		// System.out.println("1.tiep tuc\n0.Exit");
		// quaytrove = o.nextInt();
		// } while (quaytrove != 0);
		//
		// System.out.println("TRAN TRONG CAM ON QUY KHACH DA SU DUNG DICH VU.HEN GAP
		// LAI!");

	}

}// ROBOT-HINHCHUNHAT-SINHVIEN-ACCOUNT
