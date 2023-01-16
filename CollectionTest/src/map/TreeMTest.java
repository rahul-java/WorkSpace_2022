package map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMTest {
	public static Map<String,Map<String,Integer>> getT() {
		
		TreeMap<String,Map<String,Integer>> q=new TreeMap<String, Map<String,Integer>>();
	Map<String,Integer> m=new TreeMap<String,Integer>();
	m.put("k1", 1);
	m.put("k2", 10);
	m.put("k3", 11);
	
	q.put("up", m);
	
	
	Map<String,Integer> m1=new TreeMap<String,Integer>();
	m1.put("k11", 11);
	m1.put("k21", 101);
	m1.put("k31", 111);
	q.put("bh", m1);
	//q.subMap("up", "bh");
	return q;
	
	
	}

}
