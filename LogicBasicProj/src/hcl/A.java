package hcl;
// 10,9, 8,7,6,5,1,2,3,4
public class A {
	
	public void print()
	{
		for(int i=10;i>=1;i--)
		{  
			System.out.println(i);
			  if(i==5)
			  {
				  for(int j=1;j<5;j++)
				  {
					  System.out.println(j);
					  
				  }
				  break;
			  }
		}
	}
	
	
	
	
	
	
	public int getFactWithOutLoop(int n)
	{       int f=1;
		  if(n==1 || n==0)
			  return f;
		  else 
		  {
			 return n*getFactWithOutLoop(n-1);
		  }
		}
	
	
	
	public int getFactorial(int n)
	{       int f=1;
		  if(n==1 || n==0)
			  return f;
		  else 
		  {
			  for(int i=n;i>1;i--)
			  {
				  f=i*f;
			  }
			  return f;
		  }
		}
	
	
	
	
	
	public void ok(int n,int a)
	{   
		if(n<=10)
	   {
		System.out.println(a*n);
		ok(n+1,a);
	}
	}
	
	
	public static void main(String[] args) {
		A b= new A();
		//b.ok(1,5);
		//int r=b.getFactorial(5);
		//int r=b.getFactWithOutLoop(4);
		//System.out.println(r);
		b.print();
	}
	

}
