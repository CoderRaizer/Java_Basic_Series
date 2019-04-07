package bt4;

import java.io.Serializable;

public class Book implements Serializable
//Trong Class này chỉ được tồn tại các method của hệ thống - vì nó thi hành cho interface Serializable (có sẵn) của Java
//Chỉ có đối tượng implement Serializable mới ghi được vào file
{
	String id;
	String tacgia;
	
	public Book(){
		
	}
	public Book(String id, String tacgia){
		super();
		this.id = id;
		this.tacgia = tacgia;
	}

	@Override
	public String toString(){
		return "Book [id=" + id + ", tacgia=" + tacgia + "]";
	}
}
