package polymorphism;

public class ScientificCalculator extends Calculator{
	
	public void printName()
	{
		System.out.println("This is sceintific calculator");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScientificCalculator sc=new ScientificCalculator();
		sc.printName();
		Calculator cl=new Calculator();
		cl.printName();
		
		Calculator clac=new ScientificCalculator();
		clac.printName();
	}

}
