package String;

public class ReverseString {

	public static void main(String[] args) {
		
		String str="Rahul Kumar Pandey";
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
			{
			  rev+=str.charAt(i);
			  System.out.print(str.charAt(i));
			}
		System.out.println();
		System.out.println(str+"\t"+rev);

	}

}
