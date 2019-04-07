import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class bt2
{

	public static void main(String[] args)
	{
		
		Scanner q = new Scanner(System.in).useDelimiter("\n");
		
		String fname = "D:\\abc.txt";
		
	try
	{
		FileOutputStream fos = new FileOutputStream(fname);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int n=3;
		for(int i=1;i<=n;i++)
		{
			System.out.println("nhap lan "+i);
			String chuoi = q.next()+"\r\n";
			
			byte[]mangbyte = chuoi.getBytes();
			bos.write(mangbyte);
			bos.flush();
		}
		fos.close();
		bos.close();
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	}

}
