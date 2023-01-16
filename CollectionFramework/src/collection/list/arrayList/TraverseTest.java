package collection.list.arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TraverseTest {

	public static void main(String[] args) {
		
		ArrayList<String> names=new ArrayList<>();
		names.add("Rahul");
		names.add("Amit");
		names.add("Manish");
		names.add("Varun");
		names.add("Rahul Pandey");
		names.add("Amit Singh");
		
		System.out.println(names);
		
		//for Each Loop
		System.out.println("============================for()===============================");
		for(String n:names)
		{
			System.out.println(n+"\t"+names.indexOf(n)+"\t"+new StringBuffer(n).reverse());
		}

		//by Iterator
		System.out.println("============================Iterator===============================");
		Iterator<String> iterator = names.iterator();
		while(iterator.hasNext())
		{
			String str = iterator.next();
			System.out.println(str);
		}
		
		//Backword Traversal
		System.out.println("=========================Backword Traversal==================================");
		ListIterator<String> listIterator = names.listIterator(names.size());
		while(listIterator.hasPrevious())
		{
			String str = listIterator.previous();
			System.out.println(str);
		}
		
		//Enumeration
		System.out.println("============================Enumeration===============================");
		Enumeration<String> enumeration=Collections.enumeration(names); 
		while(enumeration.hasMoreElements())
		{
			System.out.println(enumeration.nextElement());
		}
		
		//For_Each
		System.out.println("============================For_Each===============================");
		names.forEach(str->{
			System.out.println(str);
		});
		
		
		
	}

}
