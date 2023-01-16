package collection.set.hashSet.linkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		
		LinkedHashSet<Double> numbers = new LinkedHashSet<>();
		numbers.add(123.123);
		numbers.add(345.876);
		numbers.add(9837.3736);
		numbers.add(99.99);
		numbers.add(100.99);
		numbers.add(99.99);
		//it store data as it is.Order Preserved
		System.out.println(numbers);

	}

}
