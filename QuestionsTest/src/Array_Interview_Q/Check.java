package Array_Interview_Q;

public class Check {

	public static void main(String[] args) {
		
		if(checkAvailable(3,15))
			System.out.println("Available");
		else
			System.out.println("Not Available");
	}

	private static boolean checkAvailable(int x, int y) {
		
		int arr[]= {2,3,4,1,5,6};
		int count=1;
		int sum=0;
		int size=arr.length;
		
		for(int i=0;i<size;i++)
		{
			sum=arr[i];
			for(int j=i+1;j<size;j++)
			{
				count++;
				sum+=arr[j];
				if(count==x)
					if(sum==y)
						return true;
					else
					{
						count--;
						sum-=arr[j];
					}
				
			}
		}
		return false;
	}
}
