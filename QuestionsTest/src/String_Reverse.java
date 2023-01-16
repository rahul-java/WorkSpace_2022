
public class String_Reverse {
	
	public static void main(String[] args) {
		
		String str= "styeahvst";
		
		char[] t = str.toCharArray();
		
		for(int i=0; i<t.length; i++)
		{
			for(int  j=i+1; j<t.length; j++)
			{
				if(t[i]==t[j])
				{
					System.out.println(t[i]);
				}
			}
		}
		
	}
	
}
