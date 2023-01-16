package max;

class Calculator   //super class, Parent class, Base class
{
	public int add(int i,int j)
	{
		return i+j;
	}
}
class AdvancedCalculator extends Calculator  //sub class, Child class, Derived class
{

	/*
	public int add(int i,int j)
	{
		return i+j;
	}
	*/
	
	public int sub(int i,int j)
	{
		return i-j;
	}
}

class VeryAdvancedCalculator extends AdvancedCalculator
{
	public int multiply(int i,int j)
	{
		return i*j;
	}
}
public class InheritenceDemo {

	public static void main(String[] args) {
		
		Calculator ob=new Calculator();
		int res=ob.add(5, 10);
		System.out.println(res);
		
		AdvancedCalculator obj=new AdvancedCalculator();
		int res1=obj.add(5, 6);
		int res2=obj.sub(20, 6);
		
		System.out.println(res1+"  "+res2);
		
		VeryAdvancedCalculator obj1=new VeryAdvancedCalculator();
	    int r1=obj1.add(10, 20);
	    int r2=obj1.sub(100, 10);
	    int r3=obj1.multiply(5, 20);
	    
	    System.out.println(r1+"  "+r2+"  "+r3);

	}

}
