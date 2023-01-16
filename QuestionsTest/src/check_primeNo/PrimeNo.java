package check_primeNo;

public class PrimeNo {

	public static void main(String[] args) {
		
		int no=167;
		int temp=0;
		
		for(int i=2;i<no;i++)
		{
			if(no%i==0)
				{
				  temp++;
				  break;
				}
		}
		
		if(temp==0)
			System.out.println(no+" is prime no.");
		else 
			System.out.println(no+" is not prime no.");
	}

}
