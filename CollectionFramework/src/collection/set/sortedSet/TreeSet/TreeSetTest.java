package collection.set.sortedSet.TreeSet;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		
		TreeSet<Double> numbers = new TreeSet<>();
		numbers.add(123.123);
		numbers.add(345.876);
		numbers.add(9837.3736);
		numbers.add(99.99);
		numbers.add(100.99);
		numbers.add(99.99);
		//all data will be sorted in ascending order
		System.out.println(numbers);

	}

}
