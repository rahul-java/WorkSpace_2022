package max;

class Calc{
	int n1;
	int n2;
	int res;
	
	public Calc()
	{
		n1=5;
		n2=10;
		
		System.out.println("This is Constructor...");
	}
	
	public Calc(int n)
	{
		n1=n;
		n2=n;
		System.out.println("This is parameterised Constructor...");
	}
	
	public Calc(double d)
	{
		n1=(int)d;
		n2=(int)d;
		System.out.println("This is Other parameterised Constructor...");
	}
	
	public Calc(int n,double d)
	{
		n1=n;
		n2=(int)d;
		System.out.println("This is Third parameterised Constructor...");
	}
	
	public Calc(int n1,int n2)
	{
		this.n1=n1;
		this.n2=n2;
		System.out.println("This is parameterised Constructor...with 'this' keyword");
	}
}
public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calc ob=new Calc(10,99); 
		System.out.println("Hi "+ob.n1+"\t"+ob.n2);
	}

}
