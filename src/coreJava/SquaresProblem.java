package coreJava;

public class SquaresProblem {
	
	public  int square(int number)
	{
		return number*number;
	}
	
	public int getSumofSquares(int number)
	{
		int sum=0;
		for(int i=1;i<=number;++i)
		{
			sum+=square(i);
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SquaresProblem squaresProblem=new SquaresProblem();
		int sum=squaresProblem.getSumofSquares(16);
		System.out.println(sum);
	}

}
