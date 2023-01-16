package maxit;

public class A {
	public static void main(String[] args) {
		
		Factorial f=new FactorialIMPL();
		String r = f.getFactorial(10);
		System.out.println(r);
	}

}
