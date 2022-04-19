package inheritence;

public class Benz extends Car{
	
	public void climatecontroller()
	{
		System.out.println("Benz has automatic climate controller");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Benz audi=new Benz();
		audi.move();
		audi.climatecontroller();
	}

}
