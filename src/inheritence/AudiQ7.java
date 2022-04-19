package inheritence;

public class AudiQ7 extends Audi{
	
	public void drivemode()
	{
		System.out.println("Audi has 4 wheel drive mode");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AudiQ7 audiq7=new AudiQ7();
		audiq7.move();
		audiq7.variants();
		audiq7.drivemode();
		
	}

}
