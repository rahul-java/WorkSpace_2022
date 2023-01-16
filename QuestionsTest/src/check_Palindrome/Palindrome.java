package check_Palindrome;

public class Palindrome {

	public static void main(String[] args) {
		
		int no=12121;
		int temp=no;
		int rev=0,rem;
		
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(rev==no)
			System.out.println(no +" is a PALINDROM number");
		else
		   System.out.println(no +" is NOT PALINDROM number");

	}

}
