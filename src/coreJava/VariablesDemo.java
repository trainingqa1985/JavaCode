package coreJava;

import inheritence.Car;

public class VariablesDemo {
	// class or instance Variables
	int classVar = 10;
	static int staticVar=100;
	public void usage() {
		System.out.println(classVar);
	//	System.out.println(lc);
	}
	
	public void localVariables()
	{
		int lc=100;
		System.out.println(lc);
	}

	public void add()
	{
		++classVar;
		++staticVar;
	}
	public static void staticMethod()
	{
		System.out.println("I am astatic method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(VariablesDemo.staticVar);
		VariablesDemo.staticMethod();
		
		VariablesDemo variablesDemo1 = new VariablesDemo();
		System.out.println(variablesDemo1.classVar);
		
		VariablesDemo variablesDemo2 = new VariablesDemo();
		System.out.println(variablesDemo2.classVar);
		System.out.println(variablesDemo1.staticVar);
		System.out.println(variablesDemo2.staticVar);
		variablesDemo1.add();
		System.out.println(variablesDemo1.classVar);
		System.out.println(variablesDemo2.classVar);
		System.out.println(variablesDemo1.staticVar);
		System.out.println(variablesDemo2.staticVar);
		Car car=new Car();
		car.testpublic();
	
	}

}
