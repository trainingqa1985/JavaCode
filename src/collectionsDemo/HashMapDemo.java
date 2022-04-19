package collectionsDemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	HashMap<Integer, String> data=new HashMap<Integer, String>();
	
	public void addData()
	{
		data.put(1,"swapna");
		data.put(2, "spoorthi");
		data.put(3, "anu");
		data.put(4,"ramya");
		data.put(1,"swapnag");
	}
	
	public void redData()
	{
		System.out.println(data.get(1));
		System.out.println(data.containsKey(5));
		System.out.println(data.containsKey(1));
	}
	
	public void readAllData()
	{
		for(Map.Entry<Integer, String> m:data.entrySet())
		{
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMapDemo hashMapDemo=new HashMapDemo();
		hashMapDemo.addData();
		hashMapDemo.readAllData();
	}

}
