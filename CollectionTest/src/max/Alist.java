package max;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Alist {
	public static void main(String[] args) {
		
		List<Object> l=new ArrayList<Object>();
		  l.add(2);
		  l.add(5);
		  l.add(22);
		  l.add(11);
		 // l.add(1, 100);
		  l.add("llhhhh");
		 // l.add(111);
		  System.out.println("before size "+l.size());
		 // l.remove(22);
		 for(int i=0;i<l.size();)
		 {
			 System.out.println(l.get(i));
			// l.remove(0);
			 i++;
		 }
		 System.out.println("-----Iterator-----");
		  Iterator<Object> it = l.iterator();
		 while(it.hasNext())
		 {
			 Object t = it.next(); 
			 System.out.println(t);
			// it.remove();
		 }
		 System.out.println("----for each-----");
		 
		 for(Object  p:l)
		 {
			System.out.println(p); 
			//l.remove(p);
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 System.out.println("after size "+l.size());
		
		
	}

}
