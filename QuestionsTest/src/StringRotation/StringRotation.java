package StringRotation;

public class StringRotation {

	public static void main(String[] args) {
		
		String str="rahulpandey";
		int r=2;
		System.out.println("---------------Left Rotation-----------------");
		System.out.println(leftRotate(str,r));
		System.out.println("---------------Right Rotation-----------------");
		System.out.println(rightRotate(str,r));

	}

	private static String rightRotate(String str, int r) {
		String rotatedString=str.substring(str.length()-r)+str.substring(0,str.length()-r);
		return rotatedString;
	}

	private static String leftRotate(String str,int r) {
		
		String rotatedString=str.substring(r)+str.substring(0, r);
		return rotatedString;
	}

}
