package lambda;

import functionalInterface.SumInterface;

public class SumTest {

	public static void main(String[] args) {
		
		SumInterface sumInterface=(int a,int b)->{
			return a+b;
		};

		System.out.println("Sum of 10 + 20 = "+sumInterface.sum(10, 20));
		
		SumInterface sumInt1=(a,b)->a+b;
		System.out.println("Sum of 100 + 200 = "+sumInt1.sum(100, 200));
	}

}
