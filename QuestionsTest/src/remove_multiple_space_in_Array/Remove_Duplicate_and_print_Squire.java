package remove_multiple_space_in_Array;
public class Remove_Duplicate_and_print_Squire {

	public static void main(String[] args) {

		int arr[] = { 22,3,5,3,6,2,7,4,22,4,8,22,9,7,4,1 };
		
		int max=0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);
		
		int[] b=new int[max+1];
		for(int i=0; i<arr.length; i++) {
			
			b[arr[i]]=b[arr[i]]+1;
			
		}
		for(int i=0; i<b.length; i++)
		{
			if(b[i]>1) {
				System.out.println(i+" Squire-->" +i*i);
			}
		}
		
		}

}
	
	


