package Count_digit_in_array;

public class D {
	
	public static void main(String[] args) {
		
		int a=464634633;
		
		
		int count=0;
		
		while(a>0)
		{
			a=a/10;
			count++;
			
		}
		
		System.out.println(count);
		
	}

}
