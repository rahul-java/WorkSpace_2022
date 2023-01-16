package dinf_Spl_Char_remove;

public class N {
	
	public static void main(String[] args) {
		
		String str="&^%g^%s$#@f##$@W$$@@$#%&*&%% java%*^*^ tamHid^%@$^$$^$^%f$%&%*%&$%$$^%&%^%$";
				
				
		/*
		 * String s2 = str.replaceAll("[^a-zA-Z0-9]"," ");
		 * System.out.println(s2.trim());
		 */
		char[] s = str.toCharArray();
		for(int i=0; i<str.length(); i++)
		{
			if(s[i]>=97&&s[i]<=122)
			{
				
				System.out.print(s[i]+" ");
			}
		}
	}

}
//char[] ch=str.toCharArray();
//for(int i=0;i<ch.length;i++)
//{
//	if(ch[i]>=97&&ch[i]<=122)
//		System.out.print(ch[i]);
//}