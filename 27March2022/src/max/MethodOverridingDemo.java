package max;

class AA
{
	public void show()
	{
		System.out.println("in AA");
	}
}
class BB extends AA
{
	//class BB method show override method of class AA.
	//child class method override the parent class method.
	
	@Override        //for compile time checking overriding
	public void show()
	{
		//super.show();
		System.out.println("In BB");
	}
	public void config()
	{
		System.out.println("Config...");
	}
}

class CC extends AA
{
	public void show()
	{
		System.out.println("in CC");
	}
}
public class MethodOverridingDemo {

	//Compile time polymorphism and run time polymorphism..
	public static void main(String[] args) {
		
		BB obj=new BB();
		obj.show();
		
		AA obj1=new BB();  // runtime polymorphism bcoz we decide at run time
		obj1.show();
		//obj1.config();  obj.config();  //You can not call the methods which are not in AA if object ref is AA.

		obj1=new CC();
		obj1.show();     //dynamic method dispatch.
	}

}
