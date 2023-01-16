package Interview;

public class Test5 {

public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int c= -a + -b; //(-10)+(-20) = -30
		int d= a - -b;  //(10)-(-20)  = 30
		int e= a + -b;  //(10)+(-20)  = -10
		int f= -a - -b;  //(-10)-(-20) = 10
		
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("-----------------------");
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
		
	}
}
