package String;

public class Remove_A_Character {

	public static void main(String[] args) {
		String str="CloudTeCh";
		
		char ch='C';
		removeChar(str,ch);
	}

	private static void removeChar(String str, char ch) {
		String finalString="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=ch)
				finalString+=str.charAt(i);
		}
		System.out.println(finalString);
		
	}
}
