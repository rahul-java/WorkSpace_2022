package map;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CL {
	public static void main(String[] args) {
		Map<String, List<Emp>> list = MapListTest.getData();
		Set<Entry<String, List<Emp>>> s = list.entrySet();
		Iterator<Entry<String, List<Emp>>> it = s.iterator();
		while(it.hasNext())
		{
			Entry<String, List<Emp>> p = it.next();
			String k = p.getKey();
			System.out.println(k);
			List<Emp> v = p.getValue();
			
			Iterator<Emp> itt = v.iterator();
			while(itt.hasNext())
			{
				Emp q = itt.next();
				System.out.println(q.eid +" "+q.name);
			}
		}
	}

}
