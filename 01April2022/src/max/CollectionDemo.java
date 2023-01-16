package max;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class MyComperator {

}

public class CollectionDemo {

	public static void main(String[] args) {

		Collection values = new ArrayList();
		values.add(10);
		values.add(12);
		values.add(14);
		values.add("XYZ");

		System.out.println(values);

		Iterator it = values.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}

		List lst1 = new ArrayList();
		lst1.add(011); // Integer Object
		lst1.add(122);
		lst1.add(233);
		lst1.add("ABCD");
		for (Object n : lst1) {
			System.out.println(n);
		}

		List lst = new ArrayList();
		lst.add(0, 11);
		lst.add(1, 22);
		lst.add(2, 33);
		lst.add(3, "AAA");
		for (int i = 0; i < 4; i++) {
			System.out.println(lst.get(i));
		}

		List<Integer> lst2 = new ArrayList<Integer>();
		lst2.add(9101);
		lst2.add(5104);
		lst2.add(7105);
		lst2.add(6103);
		lst2.add(3102);

		Collections.sort(lst2);

		for (Integer n : lst2) {
			System.out.println(n);
		}
		// To sort with own logic sort on the basis of unit digit.

		/*
		 * Comparator<Integer> c= new Comparator<Integer>() {
		 * 
		 * @Override public int compare(Integer o1, Integer o2) { // TODO Auto-generated
		 * method stub
		 * 
		 * 
		 * return o1%10>o2%10?1:-1 ;
		 * 
		 * if(o1%10>o2%10) return 1; else return -1; }
		 * 
		 * };
		 */
		
		 Comparator<Integer> c=(o1,o2) -> o1%10>o2%10?1:-1;

		Collections.sort(lst2, c);

		// Collections.reverse(lst2);
		// Collections.shuffle(lst2);

		for (Integer n : lst2) {
			System.out.println(n);
		}
	}

}
