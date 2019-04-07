package Generic_Demo;
//khanh
import java.util.TreeMap;

public class Manager <K,V>
{
	TreeMap<K,V>list;
	
	public Manager()
	{
		list = new TreeMap<>();
	}
	
	public void Addlist(K key,V value)
	{
		if(!list.containsKey(key))
		{
			list.put(key, value);
		}
	}
	
	
	public void find(K id)
	{
		if(!list.containsKey(id))
		{
			System.out.println("Khong xuat hien");
		}
		else
		{
			System.out.println(list.get(id));
		}
	}
	
	
	public void showAll()
	{
		for(V o:list.values())
		{
			System.out.println(o);
		}
	}
}
