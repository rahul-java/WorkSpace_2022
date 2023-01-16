package map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class CLL {
	public static void main(String[] args) {
		Map<Emp, String> d = MapT.getData();
		Map<Emp,String> tt=new TreeMap<Emp,String>(d);
		//Set<Emp> ss = d.keySet();
		
		
		Set<Entry<Emp, String>> s = tt.entrySet();
		Iterator<Entry<Emp, String>> it = s.iterator();
		while(it.hasNext())
		{
			Entry<Emp, String> q = it.next();
			Emp k = q.getKey();
			System.out.println(k.eid +" "+k.name+" value "+q.getValue());
		}
		
	}

}
