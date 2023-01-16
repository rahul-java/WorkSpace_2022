package StringRotation;

public class RotationOfString {

	public static void main(String[] args) {
		
		String str1="rahulpandey";
		String str2="pandeyrahul";
		
		if(str1.length()==str2.length())
		{
			str1=str1+str1;
			if(str1.indexOf(str2)!=-1)
			  System.out.println("String 2 is a ROTATION OF STRING 1");
			else
				System.out.println("String 2 is not a rotation of string 1");
		}
		else {
			System.out.println("String 2 is not a rotation of string 1");
		}

	}

}
