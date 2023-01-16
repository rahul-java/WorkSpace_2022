package collection.set.sortedSet.TreeSet;

import java.util.ArrayList;
import java.util.TreeSet;

public class TraverseTest {

	public static void main(String[] args) {
		
		TreeSet<Double> numbers = new TreeSet<>();
		numbers.add(123.123);
		numbers.add(345.876);
		numbers.add(9837.3736);
		numbers.add(99.99);
		numbers.add(100.99);
		numbers.add(99.99);
		System.out.println(numbers);
		
		numbers.forEach(n->{
			System.out.println(n);
		});
		
		ArrayList<String> names=new ArrayList<>();
		names.add("Rahul");
		names.add("Amit");
		names.add("Manish");
		names.add("Varun");
		names.add("Rahul Pandey");
		names.add("Amit Singh");
		System.out.println("============================Sorted Names===============================");
		TreeSet<String> namesTree = new TreeSet<>();
		namesTree.addAll(names);
		namesTree.forEach(n->{
			System.out.println(n);
		});

	}

}
