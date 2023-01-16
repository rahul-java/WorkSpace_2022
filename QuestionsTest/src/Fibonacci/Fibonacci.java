package Fibonacci;

import Interview.Find_Target_No_indx;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fibbonaciTest(0,1,50);
	}

	private static void fibbonaciTest(int i, int j, int limit) {
		// TODO Auto-generated method stub
		System.out.print(i+" , "+j+" , ");
		int sum=0;
		while((i+j)<limit)
		{
			sum=i+j;
			i=j;
			j=sum;
			System.out.print(sum+" , ");
		}
	}

}
