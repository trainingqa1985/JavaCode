package inheritence;

public class Car {
	
	String color="White";
	public void move()
	{
		System.out.println("Car can move from one place to another");
	}
	public void testpublic()
	{
		System.out.println("I am public");
	}
	
	private void testprivate()
	{
		System.out.println("i am private");
	}
	protected void testprotected()
	{
		System.out.println("i am protected");
	}
	void testdefault()
	{
		System.out.println(" i am default");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car=new Car();
		car.move();
		
	}

}
