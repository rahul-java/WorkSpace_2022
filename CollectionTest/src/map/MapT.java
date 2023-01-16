package map;

import java.util.HashMap;
import java.util.Map;

public class MapT {
	public static Map<Emp,String> getData()
	{
		Map<Emp,String> m=new HashMap<Emp, String>();
		m.put(new Emp(1,"raja"), "A");
		m.put(new Emp(7,"arun"), "B");
		m.put(new Emp(4,"dala"), "T");
		m.put(new Emp(3,"baja"), "C");
		m.put(new Emp(4,"dala"), "T");
		return m;
	}

}
