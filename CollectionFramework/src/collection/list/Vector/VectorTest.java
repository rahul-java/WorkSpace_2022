package collection.list.Vector;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		
		//type safe 
		Vector<String> names=new Vector<>();
		names.add("Rahul");
		names.add("Amit");
		names.add("Manish");
		names.add("Varun");
		System.out.println(names);
		System.out.println("Size : "+names.size());
		System.out.println(names.get(0));//checking order preserved or not
		System.out.println(names.get(3));
		
		//Untype safe
		Vector list=new Vector();
		list.add(1234);
		list.add("Rahul Pandey");
		list.add(123.56f);
		list.add(names);// list within list
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(3));
		System.out.println("Size : "+list.size());
		
		names.remove("Varun");
		System.out.println(names);
		System.out.println("Size : "+names.size());
		System.out.println(names.contains("Amit"));
		System.out.println(names.contains("Varun"));
		System.out.println(names.isEmpty());
		System.out.println(names);
		names.set(1, "Ram");
		System.out.println(names);
		names.add(1, "Amit"); //it shifted previous value. and added it into given index
		System.out.println(names);
		//names.clear();
		System.out.println(names);
		
	}

}
