package Interview;

public class Find_Target_No_indx {

	public static void main(String[] args) {
		
		int[] arr= {0,1,0,3,12}; //op: 1,3,12,0,0
		int[] arr1=new int[arr.length];
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr1[index++]=arr[i];
			}
			
		}
		for(int n:arr1)
			System.out.println("arr : "+n);
	}

}
