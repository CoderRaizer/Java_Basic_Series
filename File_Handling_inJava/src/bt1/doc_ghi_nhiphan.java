package bt1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class doc_ghi_nhiphan
{
	public static void main(String[] args)
	{
		boolean flag = true;
		String filename1 = "D://WEB-DOWNLOAD/boy.jpg";//vao o D lay 1 hinh dat ten la gai
		String filename2 = "D://WEB-DOWNLOAD/boy_copy.jpg";
		try
		{
			FileInputStream fis = new FileInputStream(filename1);//co ham read
			FileOutputStream fos = new FileOutputStream(filename2);//co ham write
			int c;
			do{
				c = fis.read();
				fos.write(c);
			}while(c!=-1);//khi khong con gi de doc ta mac dinh gia tri la -1
			fos.close();
			
		} catch(IOException e)
		{
			e.getMessage();
			System.out.println("NOT FOUND");flag  = false;
		}
		if(flag == true) {
			System.out.print("Success");
		}
	}

}
