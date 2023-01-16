package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {

	public static void main(String[] args) {
		
		//There are number of ways to create the object of Stream.
		
		Stream<Object> emptyStream = Stream.empty();
		emptyStream.forEach(e->{
			System.out.println("Blank Stream Object : "+e);
		});
		
		String names[]= {"Rahul","Akash","Ravi","Vivek","Tamhid"};
		Stream<String> nameStream = Stream.of(names);
		nameStream.forEach(e->{
			System.out.println("Name : "+e);
		});
		
		Stream<Object> buildStream = Stream.builder().build();
		
		IntStream intStream = Arrays.stream(new int[] {1,32,34,65,42,21,78,90});
		intStream.forEach(e->{
			System.out.println("Array Nos : "+e);
		});
		
		List<Integer> list2 = new ArrayList<>(); //mutable list
		list2.add(12);
		list2.add(112);
		list2.add(120);
		list2.add(121);
		list2.add(123);
		list2.add(115);
		Stream<Integer> collectionStream = list2.stream();
		collectionStream.forEach(e->{
			System.out.println("Collection Nos : "+e);
		});
	}

}
