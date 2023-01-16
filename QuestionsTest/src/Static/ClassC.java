package Static;

public class ClassC {
	
	int c;
	static int e;
	public ClassC() {
		System.out.println("c = "+ ++c);
		System.out.println("e = "+ ++e);
	}

	public static void main(String[] args) {
		
		int a=34;
		int b=21;
		
		new ClassC().c=a++ + ++b;
		int d=--a + --b + new ClassC().c--;
		e=a + +b + +new ClassC().c + d--;
		int f=-a + b-- + -new ClassC().c -d++;
		int sum=a + b +new ClassC().c + d + e + f;
		System.out.println(" SUM = "+sum);
	}

}
