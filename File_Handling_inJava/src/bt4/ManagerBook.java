package bt4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ManagerBook {
	String filename = "D://object_file.txt";
	
	
	public void docObject() throws ClassNotFoundException {
		try {
			FileInputStream fis = new FileInputStream(filename);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Book a = new Book();
			a = (Book) ois.readObject();
			System.out.println(a);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	
	public void ghiObject(Book a) {
		try {
			FileOutputStream fos = new FileOutputStream(filename);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(a);
			oos.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
/*--http://thachleblog.com/serializable-va-deserializable-trong-java/--*/