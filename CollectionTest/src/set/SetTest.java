package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
public static void main(String[] args) {
	  // Set<String> s=new HashSet<String>();
	  // Set<String> s=new LinkedHashSet<String>();
	TreeSet<String> s=new TreeSet<String>();
	   s.add("A"); //10
	   s.add("R");//11
	   s.add("H");//  10
	   s.add("D");
	   System.out.println(s);
	   
	   for(String p:s)
	   {
		   System.out.println(p);
	   }
	   System.out.println("------------------");
	  Iterator<String> it = s.iterator();
	  while(it.hasNext())
	  {
		  String t = it.next();
		  System.out.println(t);
	  }
	  System.out.println("============================");
	  TreeSet<String> r = (TreeSet<String>)s.descendingSet();
	  for(String w:r)
	  {
		  System.out.println(w);
	  }
}

}
