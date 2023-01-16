package comptr;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		 //A B B A D S R H K P P
		//uniquelist   D S R H K 
		//duplicatelist  A A B B P P
		
		List<String> l=new ArrayList<String>();
		l.add("A");
		l.add("B");
		l.add("A");
		l.add("C");
		//l.remove(i)
		System.out.println(l);
		Set<String> s=new HashSet<String>(l);
		System.out.println(s);
		s.remove("A");
		System.out.println(s);
		System.out.println(l.contains(s));
	}

}
