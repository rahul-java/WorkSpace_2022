package check_ArmstrongNo;

public class Armstrong {

	public static void main(String[] args) {
		int no=1634; // 153 , 3digit no then cube power 3, 4digit no then power 4
		int temp=no;
		int length=0;
		
		while(temp!=0)
		{
			length++;
			temp=temp/10;
		}
		
		int temp2=no;
		int arm=0;
		
		while(temp2!=0)
		{
			int mul=1;
			int rem=temp2%10;
			for(int i=1;i<=length;i++)
			{
				mul=mul*rem;
			}
			arm=arm+mul;
			temp2=temp2/10;
		}
		if(arm==no)
		  System.out.println(no +" is ARMSTRONG");
		else
			 System.out.println(no +" is NOT ARMSTRONG");

	}

}
