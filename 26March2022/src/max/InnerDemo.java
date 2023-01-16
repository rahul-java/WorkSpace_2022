package max;

class Outer
{
    int a;
	
	public void show()
	{
		System.out.println("in show......");
	}
	
	class Inner   //Member class  //Outer$Inner.class
	{
		public void display()
		{
			System.out.println("in display...");
		}
	}
	
	static class Inner1    //static class
	{
		public void display()
		{
			System.out.println("in Inner 1 display...");
		}
	}
}
public class InnerDemo 
{

	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Outer obj=new Outer();
		obj.show();
		
		Outer.Inner ob=obj.new Inner();  //for member class
		ob.display();
		
		Outer.Inner1 ob1=new Outer.Inner1();      //for inner class.
		ob1.display();
	}

}
