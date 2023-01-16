package Find_nth_Smallest_LArgest_No;

import java.util.Arrays;

public class LargestNo {

	public static void main(String[] args) {
		
		//sort array in descending order.
		
		int arr[]= {5,8,12,7,6,2,4};
		int temp=0;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			//nth position largest no
			if(i==3)
				System.out.println("4th largest No :" +arr[i]);
			
		}
		System.out.println(Arrays.toString(arr));
	}
	
}
