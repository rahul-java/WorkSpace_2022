package Duplicate_Element_in_Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class DuplicateElement {

	public static void main(String[] args) {
		
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(1, 10000, "Amit"));
		empList.add(new Employee(2, 5000, "Ram"));
		empList.add(new Employee(3, 12000, "Shyam"));
		empList.add(new Employee(4, 10500, "Ravi"));
		empList.add(new Employee(5, 1000, "Ram"));
		empList.add(new Employee(6, 20000, "Amit"));
		
		List<String> nameList = empList.stream().map(emp -> emp.getName()).collect(Collectors.toList());
        Set<String> unique = new HashSet<>();	
        Set<String> duplicateNames = nameList.stream().filter(name->!unique.add(name)).collect(Collectors.toSet());
	    
        System.out.println("------All Names------");
	    System.out.println(nameList);
        System.out.println("------Unique Names------");
	    System.out.println(unique);
	    System.out.println("------Duplicate Names------");
	    System.out.println(duplicateNames);
	    
	    System.out.println("------Count Unique And Duplicate Names------");
	    Map<String, Long> mapOfNames = nameList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	    System.out.println(mapOfNames);
	   
	    Set<String> set = nameList.stream().filter(name->Collections.frequency(nameList, name)>1).collect(Collectors.toSet());
	    System.out.println("--********----Duplicate Names---********---");
	    System.out.println(set);
	}
}
