package Find_Second_Highest_No_in_Array;

import java.util.Arrays;

public class A {
	
	
	public static void main(String[] args) {
		
		
	int[] arr= {12,2,2,14,32,66,9,10,99,123,101,100,112,114,123,123,111,123};
	//Arrays.sort(arr);
	
	int size=arr.length;
	
		int swap=0;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]>arr[j])
				{
					swap=arr[i];
					arr[i]=arr[j];
					arr[j]=swap;
				}
			}
		}
System.out.println("After Sorting : "+Arrays.toString(arr));
		for(int i=size-2;i>=0;i--)
		{
			if(arr[i]!=arr[size-1])
				{
				 System.out.println("Second Largest No :"+arr[i]);
				 break ;
				}
		}
		
		//System.out.println("Second Largest No :"+arr[size-2]);
		
	}

}
