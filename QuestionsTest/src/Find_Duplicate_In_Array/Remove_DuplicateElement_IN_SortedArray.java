package Find_Duplicate_In_Array;



public class Remove_DuplicateElement_IN_SortedArray {

	public static void main(String[] args) {
		
		int arr[]= {1,2,2,3,4,5,5}; // sorted array
		int temp[]=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				temp[j]=arr[i];
				j++;
			}
		}
		temp[j]=arr[arr.length-1];
		for(int i=0;i<temp.length;i++)
		  System.out.println(temp[i]);
		
		System.out.println("======================================");
	new Remove_DuplicateElement_IN_SortedArray().otherMethod();
	}
	
	public void otherMethod() {
		
		int arr[]= {1,2,2,3,4,5,5}; // sorted array
		
		int j=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				arr[j]=arr[i];
				j++;
			}
		}
		arr[j]=arr[arr.length-1];
		for(int i=0;i<=j;i++)
		  System.out.println(arr[i]);
	}
}
