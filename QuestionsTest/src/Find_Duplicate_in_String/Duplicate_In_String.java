package Find_Duplicate_in_String;

public class Duplicate_In_String {
	
	public static void main(String[] args) {
		
		
		String str="fhratagg";
		
		char[] f = str.toCharArray();
		
		for(int i=0; i<f.length; i++)
		{
			for(int j=i+1; j<f.length; j++)
			{
				if(f[i]==f[j])
				{
					System.out.println(f[i]); 
				}
			}
		}

		
	}
	
}
