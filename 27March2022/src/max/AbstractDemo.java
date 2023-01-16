package max;

abstract class Human
{
	public void eat()
	{
		
	}
	public void walk()
	{
		
	}
	public abstract void sleep();      //Abstract Method
}

class Men extends Human
{

	@Override
	public void sleep() {
		
		
	}
	
}
public class AbstractDemo {

	public static void main(String[] args) {
		
		//Human obj=new Human();  we can not create object of abstract class/can not instatiate.
		Human obj=new Men();
		

	}

}
