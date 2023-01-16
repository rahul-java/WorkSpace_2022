
public class Print_Array_No_Missing {
	
	
	public static void main(String[] args) {
		
		int []arr= {1,4,2,5,7,2,9,10};
		
		int[] b= new int [11];
		
		for(int i=0; i<arr.length; i++)
		{
			
			b[arr[i]]=b[arr[i]]+1;
			
		}
		for(int i=1; i<b.length; i++)
		{
		
			if(b[i]<=0)
			{
		System.out.println(i);
			}

			
			
		}
		
	}
	
	
	

}
