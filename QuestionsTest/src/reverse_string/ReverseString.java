package reverse_string;

public class ReverseString {

	public static void main(String[] args) {
		
		String str="Rahul Kumar Pandey";

		int length=str.length();
		String revString="";
		for(int i=length-1;i>=0;i--)
		{
			revString=revString+str.charAt(i);
		}
		System.out.println(str+"\n"+revString);
	}

}
