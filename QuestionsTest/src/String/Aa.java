package String;

public class Aa {
	public static void main(String[] args) {

		/*
		 * String str="647372374574";
		 * 
		 * int count=0;
		 * 
		 * for(int i=0; i<str.length(); i++) { char r = str.charAt(i); {
		 * if(Character.isDigit(r)) { count++;
		 * 
		 * }
		 * 
		 * }
		 * 
		 * } System.out.println(count);
		 * 
		 * 
		 */

		
		//Duplicate_Remove_with_frequency_count
		String a = "aahello";

		int[] arr = new int[123];

		int c = 0;
		for (int i = 0; i < a.length(); i++) {

			for (int j = 1; j < arr.length; j++) {
				c = a.charAt(i);
				arr[c]++;
				break;
			}
		}
		for (int k = 1; k < arr.length; k++) {
			if (arr[k] > 0) {
				System.out.println((char) k + " --->" + arr[k]);

			}

		}

	}
}
