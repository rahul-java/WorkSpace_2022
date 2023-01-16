package max;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> values= new HashSet<>();
		
		System.out.println("============HashSet================");
		
		System.out.println(values.add(404));
		System.out.println(values.add(505));
		System.out.println(values.add(101));
		System.out.println(values.add(202));
		System.out.println(values.add(303));
		System.out.println(values.add(404));  //it will not add duplicate value 
		System.out.println(values.add(505));
		
		for(int n:values)
		{
			System.out.println(n);
		}
		
        Set<Integer> v= new TreeSet<>();
		
        System.out.println("==================TreeSet=====================");
        
		System.out.println(v.add(404));
		System.out.println(v.add(505));
		System.out.println(v.add(101));
		System.out.println(v.add(202));
		System.out.println(v.add(303));
		System.out.println(v.add(404));  //it will not add duplicate value 
		System.out.println(v.add(505));
		
		for(int n:v)
		{
			System.out.println(n);
		}
	}

}
