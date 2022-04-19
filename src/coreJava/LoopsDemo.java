package coreJava;

import inheritence.Car;

public class LoopsDemo extends Car{
	int a = 1;

	public void whileLoop() {
		while (a < 1) {
			System.out.println(a);
			++a;
		}
	}

	public void doWhileLoop() {
		do {
			System.out.println(a);
			++a;
		} while (a < 1);
	}

	public void forLoop()
	{
		for(int i=1;i<=10;++i)
		{
			System.out.println(i);
			System.out.println(i+"----"+i);
		}
	}
	
	public void forLoop1()
	{
		for(int i=2;i<=10;i+=2)
			System.out.println(i);
	}
	
	public void nestedLoops()
	{
		for(int i=4;i>=1;--i)
		{
			for(int j=1;j<=i;++j)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoopsDemo loopsDemo = new LoopsDemo();
	//	loopsDemo.doWhileLoop();
		loopsDemo.nestedLoops();
		//loopsDemo.test
	}
//	2,4,6,8,10

}
