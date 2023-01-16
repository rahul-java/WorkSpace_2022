package max;

public class CustomExp extends Exception{
	CustomExp()
	{
		
	}
	 CustomExp(String s)
	 {
		 super(s);
	 }
	public String mul(int a, int b)throws CustomExp,A,B
	{
		if(a!=0 && b==0)
		{
			throw new B(ProUtility.getValue("b"));
		}
		else if(a==0 && b!=0)
		{
			throw new A(ProUtility.getValue("a"));
		}
		else if(a==0 && b==0)
		{
			throw new CustomExp(ProUtility.getValue("ab"));
		}
		else
		{
			int c=a*b;
			return "Mul is = "+c;
		}
	}
	
	public void div(int a, int b)throws CustomExp
	{   
		  if(b==0)
		  {
			 throw new CustomExp("B is not zerro plz enter Number");
		  }
		  else
		  {
			  int c=a/b;
			  System.out.println("Div "+c);
		  }
		
	}

}
