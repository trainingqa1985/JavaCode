package coreJava;

public class Datatype {
	
	byte byteName=100;
	short shortName=1245;
	//2 power -32 to 2 power 32
	int ineName=124567;
	//2 power -64 to 2 power 64
	long longName=1245789;
	
	float floatVar=10.2346567F;
	double doubleVar=1245.4987646524578;
	
	char charVar='&';
	boolean boolVar=true;
	
	String name="java";
	
	public void myFirstMethod(){
		System.out.println("This is my first method in java");
		System.out.println("I have multiple lines inside my method");
		System.out.println(boolVar);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Datatype datatype=new Datatype();
		System.out.println(datatype.name);
		System.out.println(datatype.byteName);
		datatype.myFirstMethod();
	}

}