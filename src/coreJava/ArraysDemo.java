package coreJava;

import java.util.Arrays;

public class ArraysDemo {
	int[] marks={85,90,80,95,100,80};
	int[] marks1 =new int[10];
	
	public void readData()
	{
	//	System.out.println(marks[0]);
	//	System.out.println(marks[1]);
		for(int i=0;i<marks1.length;++i)
			System.out.println(marks1[i]);
	}
	
	public void addData()
	{
		marks1[0]=2;
		marks1[1]=4;
		for(int i=0;i<marks1.length;++i)
			marks1[i]=(i+1)*2;
	}

	public static Integer func(Integer a,Integer b)
	{
		if(b==0)
		
			return 1;
		Integer temp=func(a,b/2);
		if(b%2!=0){
			return temp*temp*a;
		}
		else
			return temp*temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={5,1,3,2};
		int[] expected = new int[arr.length];
		System.arraycopy(arr, 0, expected, 0, arr.length);
		Arrays.sort(expected);
		int j=0;
		int n=arr.length;
		int ans=n;
		for (int k : arr) {
		if (k == expected[j]) {
		j++;
		ans--;
		}
		}
		System.out.println(ans);
	}

}
