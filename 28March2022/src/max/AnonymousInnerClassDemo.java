package max;

class A
{
	public void show()
	{
		System.out.println("In A Show...");
	}
}

/*
class B extends A
{
	public void show()
	{
		System.out.println("I am the best...");
	}
}

*/
public class AnonymousInnerClassDemo {

	public static void main(String[] args) {
		
		//A obj=new A();
		//A obj=new B();
		
		A ob=new A()
				{
			public void show()
			{
				System.out.println("I am the best...");
			}    
			    
			   
				};
		ob.show();
	}
}
