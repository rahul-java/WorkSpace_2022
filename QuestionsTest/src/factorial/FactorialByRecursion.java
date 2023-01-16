package factorial;

public class FactorialByRecursion {

	int fact=1;
	public static void main(String[] args) {
		
		int no=5;
		FactorialByRecursion byRecursion = new FactorialByRecursion();
		int res = byRecursion.factorial(no);
		System.out.println(res);

	}
	
	public int factorial(int no) {
		if(no>1)
		{
			fact=fact*no;
			factorial(no-1);
		}
		return fact;
	}

}
