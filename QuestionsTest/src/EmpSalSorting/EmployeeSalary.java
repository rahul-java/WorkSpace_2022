package EmpSalSorting;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class EmployeeSalary {

	public static void main(String[] args) {
		
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(1, 10000));
		empList.add(new Employee(2, 5000));
		empList.add(new Employee(3, 12000));
		empList.add(new Employee(4, 10500));
		empList.add(new Employee(5, 1000));
		empList.add(new Employee(6, 20000));
		
		//sorting based on sal
		List<Employee> list = empList.stream().sorted((o1,o2) -> (int)(o2.getSalary()-o1.getSalary())).collect(Collectors.toList());
		System.out.println("-----Sorted in descending order based on salary-----");
		System.out.println(list);
		
		//top 3 highest sal
		List<Employee> top3 = empList.stream().sorted((o1,o2) -> (int)(o2.getSalary()-o1.getSalary()))
				              .limit(3)
				              .collect(Collectors.toList());
		System.out.println("-----Sorted in descending order based on Top 3 High salary-----");
		System.out.println(top3);
		
		//top 3 highest sal
		List<Employee> bottom3 = empList.stream().sorted((o1,o2) -> (int)(o2.getSalary()-o1.getSalary()))
				              .skip(3)
				              .collect(Collectors.toList());
		System.out.println("-----Sorted in descending order based on Top 3 Lowest salary-----");
		System.out.println(bottom3);
	}

}
