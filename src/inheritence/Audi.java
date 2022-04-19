package inheritence;

public class Audi extends Car{
	String color="Metallic white";
	public void variants()
	{
		System.out.println("Audi has both automatic and manual mode");
	}
	
	public void printcolor()
	{
		System.out.println(super.color);
		System.out.println(this.color);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Audi audi=new Audi();
		audi.move();
		audi.variants();
		audi.printcolor();
		
	}

}
