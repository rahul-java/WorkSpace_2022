package max;

public class IterationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;

		while (i <= 10) {
			System.out.println("Hello");
			i++;
		}
		System.out.println("-----------------------------");
		do {
			System.out.println("Hello Do while...");
			i++;
		} while (i <= 10);

		System.out.println("-----------------------------");

		for (i = 1; i <= 5; i++) {
			System.out.println("Hello for Loop...");
		}

		System.out.println("-----------------------------");
		for (i = 1; i <= 4; i++) 
		{
			for (int j = 1; j <= 4; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
