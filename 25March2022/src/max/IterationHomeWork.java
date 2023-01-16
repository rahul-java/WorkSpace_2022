package max;

public class IterationHomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int i,j;
  
	for(i=1;i<=6;i++)
	{
		for(j=1;j<=i;j++)
			System.out.print(j+" ");
		System.out.println();
	}
	System.out.println();
	
	for(i=65;i<=70;i++)
	{
		for(j=65;j<=i;j++)
		{
			System.out.print((char)j+" ");
		}
		System.out.println();
	
	}
	
	System.out.println();
	
	int l=4;
	for(i=1;i<=l;i++)
	{
		if(i==1||i==l)
		{
			for(j=1;j<=l;j++)
			{
				System.out.print("$");
			}
		}
		else
		{
			System.out.print("$");
			for(j=2;j<l;j++)
			{
				System.out.print(" ");
				
			}
			System.out.print("$");
		}
		
		System.out.println();
	}
	}

}
