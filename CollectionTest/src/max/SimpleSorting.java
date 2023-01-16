package max;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimpleSorting {
	public static void main(String[] args) {
		List<String> l=new ArrayList<String>();
		l.add("bala");
		l.add("ala");
		l.add("kala");
		l.add("dala");
		
		for(String p:l)
		{
			System.out.println(p);
		}
		System.out.println("------------------------");
		Collections.sort(l);
		for(String p:l)
		{
			System.out.println(p);
		}
		
	}

}
