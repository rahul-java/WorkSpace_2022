package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Remove_Special_String {
	

	
	
	public static void main(String[] args) {
		
		
	String str="bnghammohanlal";
	

	
	      char[] f = str.toCharArray();
	         
	      
	      int[] arr= new int[27];
   		       
		for(int i=0; i<f.length; i++)
		{
			arr[f[i]-97]++;
			
		}
		for(int i=0; i<27; i++)
		{
			if(arr[i]>1)
			{
	 		 System.out.println((char)(i+97)+"----->"+arr[i]);
				
			}
			
		}
		
	}

}
