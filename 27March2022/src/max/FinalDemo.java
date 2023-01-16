package max;

class A1
{
	int i=0;
	final int j;   //constant
	
	public A1()
	{
		j = 11;
		i=10;
		//j=9; can not change if once initialized
	}
}

class AB                        //making class final class AB will not be inheritable
{
	public void show()          // if making method final then method can not be override.
	{
		System.out.println("in AB show....");
	}
}

class ABC extends AB
{
	public void show()
	{
		System.out.println("in ABC  show....");
	}
}
public class FinalDemo {

	public static void main(String[] args) {
		
		A1 obj=new A1();
		
		System.out.println(obj.i);
		System.out.println(obj.j);
		
		ABC ob=new ABC();
		ob.show();

	}

}
