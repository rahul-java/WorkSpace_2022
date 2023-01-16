package max;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,String> map=new HashMap<>();   
		
		//Map<String,String> map=new HashMap<>();
		
		
		map.put("myName","Rahul");
		map.put("favAct", "Ramayana");
		map.put("designation", "Developer");
		map.put("favAct", "GameOfThrones");   //it will replace the original value.
		
		System.out.println(map);
		System.out.println(map.get("myName"));
		System.out.println(map.get("favAct"));
		
		Set<String> keys=map.keySet();
		
		for(String key:keys)
		{
			System.out.println(key+"\t"+map.get(key));
		}
	}

}
