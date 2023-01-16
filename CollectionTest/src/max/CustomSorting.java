package max;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomSorting {

	public static List<Train> getData()
	{
		List<Train> l=new ArrayList<Train>();
		Train t = new Train();
		t.setName("rajdhani");
		t.setSstn("ndls");
		t.setDstn("hwh");
		t.setTime(6);
		l.add(t);
		
		Train t1 = new Train();
		t1.setName("gomti");
		t1.setSstn("ali");
		t1.setDstn("cbc");
		t1.setTime(4);
		l.add(t1);
		
		Train t11 = new Train();
		t11.setName("garibrath");
		t11.setSstn("krj");
		t11.setDstn("dli");
		t11.setTime(5);
		l.add(t11);
		Collections.sort(l);
		return l;
		
	}
	
	
}
