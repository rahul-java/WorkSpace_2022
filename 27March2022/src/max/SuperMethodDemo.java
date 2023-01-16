package max;

class A
{
	public A()
	{
		System.out.println("In A");
	}
	public A(int i)
	{
		System.out.println("In A with parameter "+i);
	}
}

class B extends A
{
	public B()
	{
		//super();           //by default it is there. and call its super constructor
		//super(100);
		System.out.println("In B");
	}
	public B(int i)
	{
		//super();                 ////by default it is there. and call its super constructor
		super(i);
		System.out.println("In B with parameter "+i);
	}
}

public class SuperMethodDemo {

	public static void main(String[] args) {
		
		A ob=new A();
		B ob1=new B();
		B obj=new B(10);

	}

}
