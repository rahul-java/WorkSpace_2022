package Static;

public class ClassB {

	
	static 
	{
		System.out.println("1st Static block is executed.....");
	}
	public static void main(String[] args) {

		System.out.println("Main Method is executed...");

	}
	static 
	{
		System.out.println("2nd Static block is executed.....");
	}

}
