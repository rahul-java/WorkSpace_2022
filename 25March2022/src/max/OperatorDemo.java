package max;

public class OperatorDemo {

	public static void main(String[] args) {
		
		int m=6, n=4;
		
		int r1=m+n;
		int r2=m-n;
		int r3=m*n;
		int r4=m/n;
		int r5=m%n;
		
		double r6=(double)m/n;
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);
		System.out.println(r6);
	
	System.out.println("**************************************");
	
	int r7=m++;  //post increment first assign then increment
	int r8=++n;  //pre increment first increment then assign
	
	System.out.println(r7);
	System.out.println(r8);
	System.out.println(m);
	System.out.println(n);
	
	
	}
}
