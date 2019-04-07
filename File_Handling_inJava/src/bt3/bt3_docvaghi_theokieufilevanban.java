package bt3;


import java.awt.image.BufferedImageFilter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class bt3_docvaghi_theokieufilevanban
{
	public static void main(String[] args)
	{
		Scanner q =new Scanner(System.in).useDelimiter("\n");
		String fname1 = "D://abc1.txt";
		String fname2 = "D://abc2.txt";
		
		try
		{
			FileReader fr = new FileReader(fname1);
			BufferedReader br = new BufferedReader(fr);//chua ham readLine
			FileWriter fw = new FileWriter(fname2);
			BufferedWriter bw = new BufferedWriter(fw);//chua ham write
			
			String chuoi = br.readLine();//doc theo tung dong
			
			while(chuoi!=null) {
				bw.write(chuoi+"\r\n");
				chuoi = br.readLine();
			}
			bw.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("File khong ton tai");
		} catch(IOException e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}//Vào ổ D, tạo sẵn file abc1(txt) rồi vào đây ctrl f11 --> sẽ xuất hiện file abc2
