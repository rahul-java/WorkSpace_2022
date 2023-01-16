package Singleton;

public class TestSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal obj1 = Animal.getInstance();
		System.out.println(" 1st Object Reference "+obj1.hashCode());
		
		Animal obj2 = Animal.getInstance();
		System.out.println(" 2nd Object Reference "+obj2.hashCode());
		
		Animal obj3 = Animal.getInstance();
		System.out.println(" 3rd Object Reference "+obj3.hashCode());
	}

}
