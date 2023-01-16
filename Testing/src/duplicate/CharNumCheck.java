package duplicate;

public class CharNumCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="AFKJSI234598LPWXCZ9877";
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if((ch[i]>=65&&ch[i]<=90)||(ch[i]>=97&&ch[i]<=122))
			{
				continue;
			}
			else
			{
				int n=Character.getNumericValue(ch[i]);
				if(n<10)
				{
					if(n%2==0)
						System.out.println(ch[i]+" is : Even");
					else 
					    System.out.println(ch[i]+" is : Odd");
				}
			}
			
		}
	}

}
