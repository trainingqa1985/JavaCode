package collectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {

	LinkedList<String> arrayList = new LinkedList<String>();
	LinkedList<String> arrayList1 = new LinkedList<String>();

	public void addData() {
		arrayList.add("java123");
		arrayList.add("ruby");
		arrayList.add("python");
		arrayList.add("ruby");
		arrayList.add("java1");
		arrayList.add("ruby1");
		arrayList.add("python1");
		arrayList1.add("java123");
		arrayList1.add("ruby123");
		
	}

	public void readData() {
		//System.out.println(arrayList.get(2));
		arrayList.remove(0);
		arrayList.remove("python");
		for(int i=0;i<arrayList.size();++i)
			System.out.println(arrayList.get(i));
	}
	
	public void foreach()
	{
		for(String st:arrayList)
			System.out.println(st);
	}

	public void others()
	{
		System.out.println(arrayList.containsAll(arrayList1));
		arrayList.addAll(arrayList1);
		Collections.sort(arrayList);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListDemo arrayListDemo = new LinkedListDemo();
		arrayListDemo.addData();
		
		arrayListDemo.others();
		arrayListDemo.foreach();
	}

}
