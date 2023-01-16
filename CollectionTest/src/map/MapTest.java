package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class MapTest {
	public static void main(String[] args) {
		Map<String,Integer> m=new ConcurrentHashMap<String, Integer>();
		//Map<String,Integer> m=new HashMap<String, Integer>();
		//Map<String,Integer> m=new TreeMap<String, Integer>();
		//Map<String,Integer> m=new LinkedHashMap<String, Integer>();
		      //set    list
		m.put("bala", 1000);  // o1
		m.put("ala",  1000);   // o2
		m.put("dala", 3000);
		m.put("hala", 7000);
		m.put("lala", 2000);
		m.put("kala", 8000);
		System.out.println("before "+m);
		Set<Entry<String,Integer>> s=m.entrySet();
		for(Entry<String,Integer>   e: s)
		{
			
			System.out.println(e.getKey() +" "+e.getValue());
			if(e.getKey().equalsIgnoreCase("dala"))
			{
				m.put("ram", 66666);
			}
		}
		System.out.println("-------------------");
		   Iterator<Entry<String, Integer>> it = s.iterator();
		   while(it.hasNext())
		   {
			  Entry<String, Integer> e = it.next();
			  System.out.println(e.getKey() +" "+e.getValue());
		   }
		   System.out.println("after "+m);
		
	}

}
