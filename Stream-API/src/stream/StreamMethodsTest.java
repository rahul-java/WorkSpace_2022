package stream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMethodsTest {

	public static void main(String[] args) {
		
		List<String> name=List.of("Rahul","Akash","Ravi","Vivek","Tamhid","Abhishek");
		List<String> collectList = name.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
		System.out.println("Start with A : "+collectList);
		
		System.out.println("******************************************************");
		List<Integer> numbers = List.of(12,32,2,45,75,99,13,121);
		List<Integer> collectNos = numbers.stream().map(n->n*n).collect(Collectors.toList());
		System.out.println(numbers+"\nSquare of Nos : "+collectNos);
		
		System.out.println("******************************************************");
		name.stream().forEach(e->{
			System.out.println(e);
		});
		
		System.out.println("******************************************************");

		name.stream().forEach(System.out::println);
		
		System.out.println("*************************Sorted()*****************************");
		numbers.stream().sorted().forEach(System.out::println);
		
		System.out.println("*************************Min()*****************************");
		Integer min = numbers.stream().min((x,y)->x.compareTo(y)).get();
		System.out.println("Min No : "+min);
		
		System.out.println("*************************Max()*****************************");
		Integer max = numbers.stream().max((x,y)->x.compareTo(y)).get();
		System.out.println("Max No : "+max);
	}

}
