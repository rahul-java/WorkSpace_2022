package Find_Duplicate_In_Array;


public class Test1 {

	public static void main(String[] args) {
		
		int arr[]= {10,2,9,2,5,8,3,4,5,5};
		
		//Arrays.sort(arr);
		int temp=0;
		for(int i=0;i<arr.length;i++)
			for(int j=i+1;j<arr.length;j++)
			if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
		
		int j=0;
		for(int i=0;i<arr.length-1;i++)
			if(arr[i]!=arr[i+1])
			{
				arr[j]=arr[i];
				j++;
			}
		arr[j]=arr[arr.length-1];
		System.out.println("=============after================");
		for(int i=0;i<=j;i++)
			System.out.println(arr[i]);
	}
}
