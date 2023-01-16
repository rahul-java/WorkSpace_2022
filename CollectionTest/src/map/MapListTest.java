package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapListTest {
public static Map<String,List<Emp>> getData() {
	Map<String,List<Emp>> m=new HashMap<String, List<Emp>>();
	List<Emp> l=new ArrayList<Emp>();
	 l.add(new Emp(2,"bala"));
	l.add(new Emp(4,"ala"));
	l.add(new Emp(6,"ala"));
	l.add(new Emp(7,"bala"));
	m.put("lst", l);
	
	return m;
	
}
}
