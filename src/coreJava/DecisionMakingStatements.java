package coreJava;

public class DecisionMakingStatements {
	int a = 2;

	public void ifDemo() {
		if (a % 2 == 0) {
			System.out.println("number is an even number");
		}
	}

	public void ifelseDemo() {
		if (a % 2 == 0)

			System.out.println("number is an even number");

		else
			System.out.println("Number is an odd number");
	}

	public void ifelseifDemo() {
		if (a == 1)
			System.out.println("number is a composite number");
		else if (a % 2 == 0)

			System.out.println("number is an even number");
		else
			System.out.println("Number is an odd number");
	}

	public void switchStatement() {
		switch (a) {
		case 1:
			System.out.println("Jan");
			break;
		case 2:
			System.out.println("Feb");
			break;
		case 3:
			System.out.println("mar");
			break;
		default:
			System.out.println("No match Found");
		}
		System.out.println("Later break;");
	}

	
	//fizzbuuz,fizz,buzz,number
	public void printData()
	{
		int number=11;
		if(number%3==0 && number%5==0)
			System.out.println("fizzbuzz");
		else if(number%3==0)
			System.out.println("fizz");
		else if(number%5==0)
			System.out.println("buzz");
		else
			System.out.println(number);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecisionMakingStatements decisionMakingStatements = new DecisionMakingStatements();
		// decisionMakingStatements.ifDemo();
		// decisionMakingStatements.ifelseDemo();
	//	decisionMakingStatements.ifelseifDemo();
		decisionMakingStatements.switchStatement();

	}

}
