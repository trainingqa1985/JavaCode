package polymorphism;

public class Calculator {
	int a,b;
	public void printName()
	{
		System.out.println("This is calculator");
	}
	
	public void add()
	{
		System.out.println(a+b);
	}
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public void add(int a,float b)
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator=new Calculator();
		calculator.add();
		calculator.add(10, 85);
		calculator.add(10, 45.254F);
		calculator.printName();
	}

}
