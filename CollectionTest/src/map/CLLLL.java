package map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CLLLL {
public static void main(String[] args) {
	Map<String, Map<String, Integer>> t = TreeMTest.getT();
	Set<Entry<String, Map<String, Integer>>> s = t.entrySet();
	for( Entry<String, Map<String, Integer>> q:s)
	{
		String e = q.getKey();
		System.out.println(e);
		Map<String, Integer> v = q.getValue();
		Set<Entry<String, Integer>> m = v.entrySet();
		for(Entry<String, Integer> a: m)
		{
			String kk = a.getKey();
			Integer vv = a.getValue();
			System.out.println(kk +"  "+vv);
		}
	}
}
}
