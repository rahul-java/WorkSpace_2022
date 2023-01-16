package Static;



public class ClassA {
	
	int a;
	static int b;
	
	public void meth1() {
		System.out.println("Method 1 is called....");
		System.out.println("Instance variable : "+a);
		System.out.println("static variable : "+b);
	}
	
	public static void meth2() {
		System.out.println("Method 2 is called....");
		System.out.println("Instance variable : "+new ClassA().a);
		//System.out.println("Instance variable : ");
		System.out.println("static variable : "+b);
	}
	
	public static void meth3() {
		System.out.println("Method 2 is called....");
		System.out.println("Instance variable : "+new ClassA().a);
		System.out.println("static variable : "+b);
	}

	public static void main(String[] args) {
		
		ClassA aObj = new ClassA();
		aObj.meth1();
		System.out.println("====================");
		aObj.meth2();
		System.out.println("====================");
		ClassA.meth2();
		System.out.println("====================");
		ClassA.meth3();
		
		

	}

}
