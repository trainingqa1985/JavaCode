package coreJava;

public class StringDemo {
	
	public static void reverse(String input)
	{
		for(int i=0;i<2;i++)
		{
		System.out.println("hello");
		i++;
		}
		for(int i=input.length()-1;i>=0;--i)
			System.out.print(input.charAt(i));
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringDemo.reverse("New");
		String name="Java";
		System.out.println(name);
		name="New Java";
		System.out.println(name);
		System.out.println(name.length());
		System.out.println(name.toUpperCase());
		System.out.println(name);
		System.out.println(name.toLowerCase());
		System.out.println(name.concat(" Learning"));
		System.out.println(name);
		System.out.println(name.charAt(2));
		System.out.println(name.equals("New Java"));
		System.out.println(name.equalsIgnoreCase("new java"));
		System.out.println(name.substring(4));
		System.out.println(name.substring(0, 3));
		System.out.println(name.replace('a', 'D'));
		System.out.println(name.trim());
		String[] data=name.split(" ");
		System.out.println(data[0]);
		System.out.println(data[1]);
		System.out.println(10+20+"--"+1+2+3);
	}

}
