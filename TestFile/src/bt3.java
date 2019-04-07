
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class bt3
{

	public static void main(String[] args)
	{
		Scanner q = new Scanner(System.in).useDelimiter("\n");
		String fname1 = "D://abc1.txt";
		String fname2 = "D://abc2.txt";
		
		try
		{
			FileReader fr = new FileReader(fname1);
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter(fname2);
			BufferedWriter bw = new BufferedWriter(fw);
			
			String chuoi = br.readLine();//doc theo dong
			
			while(chuoi!=null)
			{
				bw.write(chuoi +"\r\n");
				chuoi = br.readLine();
			}
			bw.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
