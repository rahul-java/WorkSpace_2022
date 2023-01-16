package collection.set.hashSet;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet<Double> numbers = new HashSet<>();
		numbers.add(123.123);
		numbers.add(345.876);
		numbers.add(9837.3736);
		numbers.add(99.99);
		numbers.add(100.99);
		numbers.add(99.99);
		//it store data randomly ordered way.Order UnPreserved
		System.out.println(numbers);

	}

}
