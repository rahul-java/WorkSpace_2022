package Interview;

public class Reverse {

	public static void main(String[] args) {
		
		// Print Strig REverse And Special Character Should be on same index	
		
		  String str= "abc$d@e";
		  
		  char[] c = str.toCharArray(); char []ch=c; String s="";
		  
		  for(int i=str.length()-1; i>=0; i--)
		  {
			  if(c[i]>=96 & c[i]<=122 )
			  {
		        s=s+Character.toString(c[i]);
		  
		       }
		   }
		    char[] charArray = s.toCharArray();
		    int l=0;
		    for(int i= 0;i<str.length();i++)
		    { 
		       if(c[i]>=96 & c[i]<=122)
		       { 
		    	   ch[i]=charArray[l];
		    	   l++;
		        }
		      }
		    System.out.println(ch);
		 
	}
}
