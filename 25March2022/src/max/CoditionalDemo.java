package max;

public class CoditionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=8;
		if(true)
			System.out.println("Hello True");
		else
			System.out.println("Bye");
		
		if(false)
			System.out.println("True");
		else
			System.out.println("Hello False");
		
		if(n==0)
			System.out.println("Nothin...");
		else
			if(n%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
		
		if(n%2!=0)
			System.out.println("Odd");
		else
			System.out.println("Even");
		
		System.out.println("$$$$$$$$$$$$ Ternary Operator $$$$$$$$$$$$$");
		int i=5,j=5;
		if(i<10)
			j++;
		else
			j--;
		System.out.println(i+"\t"+j);
		
		j=i<10?1:2;// Ternary Operator
		System.out.println(j);
			
			
	}

}
