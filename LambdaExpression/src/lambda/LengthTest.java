package lambda;

import functionalInterface.LengthInterface;

public class LengthTest {

	public static void main(String[] args) {
		
		LengthInterface lengthInterface=(str)->str.length();
		System.out.println("Length : "+lengthInterface.getLength("RahulKumarPandey"));

	}

}
