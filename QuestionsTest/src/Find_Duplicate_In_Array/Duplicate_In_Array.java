package Find_Duplicate_In_Array;

public class Duplicate_In_Array {
	
	public static void main(String[] args) {
		
		
		int[] arr={4,6,2,9,6,8,2};
		
		
		int a=0;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					a=arr[i];
					arr[i]=arr[j];
					arr[j]=a;
				}				
			}
		}
	  for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
			
		}

			System.out.println("Second Highst no----->"+arr[ arr.length-2]);
		
		
}
}
