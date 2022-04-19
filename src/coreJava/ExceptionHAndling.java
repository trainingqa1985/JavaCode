package coreJava;

public class ExceptionHAndling {
	
	int[] marks={10,20};
	
	public void print()
	{
		try{
		System.out.println(marks[10]);
		}
		catch(Exception e)
		{
			System.out.println("handling exception");
		}
		
		finally{
			System.out.println("any time execution");
		}
		System.out.println("after exception");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionHAndling exceptionHAndling=new ExceptionHAndling();
		exceptionHAndling.print();
	}

}
