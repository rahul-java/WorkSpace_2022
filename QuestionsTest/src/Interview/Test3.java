package Interview;

public class Test3 {

public static void main(String[] args) {
		
		
		
		int[] arr= {0,1,0,2,12};
		
		//output 12,0,1,0,2
		int swap=0;
		int[] arr1=new int[5];
		arr1[0]=arr[arr.length-1];
		for(int i=0; i<arr.length-1; i++)
		{
			arr1[i+1]=arr[i];
		}
		for(int i=0; i<arr1.length; i++)
		System.out.println(arr1[i]);
		
		
	}
}
