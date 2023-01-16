
public class A {
	
	public static void main(String[]args)
	
	
	{
		String str="askudfdfjjoott";
		
		   char[] l = str.toCharArray();
		
		  int[] arr=new int[27];
		  
		  for(int i=0; i<l.length; i++)
		  {
			  for(int j=1; j<arr.length; j++)
			  {
				 arr[l[i]-96]++;
				 break;
			  }
		  }
		  for(int e=0; e<arr.length; e++)
		  {
			  if(arr[e]>0) {
				  System.out.println((char)(e+96)+"---->"+(arr[e]));
  
			  }
		  }
		
		
	}			
}

