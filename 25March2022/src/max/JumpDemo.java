package max;

public class JumpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		for( i=1;i<=10;i++)
		{
			System.out.println("value is : "+i);
		}
		System.out.println("-------------------------------");
		for( i=1;i<=10;i++)
		{
			if(i==7)
			{
				continue;  //skip the next code of the iteration. skip the current iteration. jumping statement.
			}
			System.out.println("value is : "+i);
		}
		System.out.println("===============================");
		for( i=1;i<=10;i++)
		{
			if(i==7)
			{
				break;  //break the loop and go out of the loop,.
			}
			System.out.println("value is : "+i);
		}
	}

}
