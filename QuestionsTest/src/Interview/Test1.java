package Interview;

public class Test1 {

	public static void main(String[] args) {

		String str = "tamhid_4 rahul_3 amit_1";
        //arrange by no.
		
		char[] c = str.toCharArray();

		int swap = 0;

		for (int i = 0; i < c.length; i++) {

			if (c[i] > swap) {
				swap = c[i];

			}
		}
		int[] b = new int[swap + 1];
		for (int i = 0; i < c.length; i++) {

			b[c[i]] = b[c[i]] + 1;

		}

		for (int j = 0; j < b.length; j++) {
			if (b[j] > 1) {
				System.out.println((char) +j);
			}
		}
	}
}
