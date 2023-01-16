package String;

public class FactWithouLoop {
	
	
	public static int facto(int n)
	{
	if(n==0||n==1)
	{
		return 1;
	}
	else
	{
		return n*facto(n-1);
	}
	}
	public static void main(String[] args) {
		int fact;
		fact=facto(10);
		System.out.println("Result is "+fact);
		
	}

}
