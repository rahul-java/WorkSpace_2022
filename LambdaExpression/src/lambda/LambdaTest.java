package lambda;

import functionalInterface.FunctionalInterfaceImpl;
import functionalInterface.FunctionalInterfaceTest;

public class LambdaTest {
	public static void main(String[] args) {

		//By Implementing the interace and overriding method of interface.
		FunctionalInterfaceImpl test = new FunctionalInterfaceImpl();
		test.sayHello();

		//No need to implement directly by anonymous functio
		FunctionalInterfaceTest test1 = new FunctionalInterfaceTest() {

			@Override
			public void sayHello() {
				System.out.println("This is first anonymous class...");

			}
		};
		test1.sayHello();

		FunctionalInterfaceTest test2 = new FunctionalInterfaceTest() {

			@Override
			public void sayHello() {
				System.out.println("This is Second anonymous class...");

			}
		};
		test2.sayHello();

		// Using interface with the help of Lambda

		FunctionalInterfaceTest i = () -> {
			System.out.println("This is first use of lambda...");
		};
		i.sayHello();
	}

}
