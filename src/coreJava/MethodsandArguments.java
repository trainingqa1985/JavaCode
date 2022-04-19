package coreJava;

public class MethodsandArguments {
	
//	int a=10,b=20;
	int a,b;
	public int add(int a,int b)
	{
		this.a=a;
	//	System.out.println(a+b);
		return a+b;
	}
	
	public int diff(int a,int b)
	{
		//System.out.println(a-b);
		return a-b;
	}
	public void printNae(String name)
	{
		System.out.println("My name is "+name);
	}
	

	public void objectArgumentsDemo(OperatorsDemo operatorsDemo)
	{
		operatorsDemo.ArithematicOperators();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsandArguments methodsandArguments=new MethodsandArguments();
		int sum=methodsandArguments.add(85,47);
		System.out.println(sum);
		int diff=methodsandArguments.diff(85, 47);
		System.out.println(diff);
		int finaldiff=methodsandArguments.diff(sum, diff);
		System.out.println(finaldiff);
	/*	methodsandArguments.add(85,46);
		methodsandArguments.printNae("Java");
	*/	
	}

}
