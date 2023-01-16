package count_word_in_string;

public class D {

	
	public static void main(String[] args) {
		
		
		String str="fhgdibHHruihetIURYVfrhi";
				System.out.println("Hello");
				int latter=0;
				for(int i=0; i<str.length(); i++)
				{
				char c = str.charAt(i);	
					
				if(Character.isUpperCase(c))
				{
					//latter++;
			
				}
				else if(Character.isLetter(latter))
				{
					latter++;
					System.out.println(latter+"  "+c);
				}
				
				}
				
		
	}
	
}
