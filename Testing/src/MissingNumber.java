
public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,6,8};
		int[] arr1=new int[11];
		 
			 for(int i=0;i<arr.length;i++)
			 {
				 arr1[arr[i]]=arr1[arr[i]]+1;
			 }
		 
		 for(int i=1;i<arr1.length;i++)
		 {
			 if(arr1[i]<=0)
				 System.out.println(i);
		 }
		

	}

}
