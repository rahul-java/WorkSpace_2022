package sorting;

import java.util.ArrayList;
import java.util.List;

public class TrainList {
	public List<Train> getTrain()
	{
		List<Train> l=new ArrayList<Train>();
		Train t = new Train();
		t.setTime(4);
		t.setName("rajdhani");
		t.setSstn("ndls");
		t.setDstn("hwh");
		l.add(t);
		
		Train t1 = new Train();
		t1.setTime(6);
		t1.setName("garibrath");
		t1.setSstn("dli");
		t1.setDstn("ali");
		l.add(t1);
		
		
		Train t2 = new Train();
		t2.setTime(5);
		t2.setName("mahananda");
		t2.setSstn("kjr");
		t2.setDstn("ali");
		l.add(t2);
		return l;
		
		
		
		
		
		
	}

}
