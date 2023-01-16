package fibonacciSeries;

public class Febonacci {

	static int a=0,b=1,c;
	
	public static void main(String[] args) {
		
		System.out.print(a+" "+b);
		new Febonacci().printFibo(10);
	}
	void printFibo(int no)
	{
		while(no>=1)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			no--;
		}
	}

}
