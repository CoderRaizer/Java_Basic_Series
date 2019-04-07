package bt2;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class bt2
{
	public static void main(String[] args)
	{
		Scanner q = new Scanner(System.in).useDelimiter("\n");//lay den ky tu \n thi dung lai
		String fname1 = "D://WEB-DOWNLOAD/testb2_File Handling.txt";//khong can tao san file trong D
		try
		{
			FileOutputStream fos = new FileOutputStream(fname1);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			int n = 3;
			for(int i=1;i<=n;i++)
			{
				System.out.println("nhap du lieu lan "+i);
				String chuoi = q.next() + "\r\n";//next() hoac nextLine() cung duoc va no thuoc (14)
				//"\r\n" la ki hieu noi chuoi ghi xong xuong hang
				
				//chuyen doi chuoi ve mang byte
				
				byte []mangbyte = chuoi.getBytes();//chuyen String vao byte
				bos.write(mangbyte);
				bos.flush();//ham day du lieu ra khoi Buffered
			}
			fos.close();//nho
			bos.close();//to
			//dong tu trong ra ngoai nho ->to
		}
		catch(IOException r)
		{
			r.printStackTrace();
		}
	}

}//vao o D kiem tra file sau khi nhap xong
