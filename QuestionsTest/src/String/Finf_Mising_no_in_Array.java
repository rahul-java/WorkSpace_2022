package String;

public class Finf_Mising_no_in_Array {
	
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,8,9,10};
		
		int[] b =new int[11]; 
		
		for(int i=0; i<a.length; i++)
		{
			b[a[i]]=b[a[i]]+1;
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
