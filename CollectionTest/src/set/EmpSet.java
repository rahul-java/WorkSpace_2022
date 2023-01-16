package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmpSet {
	public Set<Emp> getData()
	{
		Set<Emp> l=new HashSet<Emp>();
		Emp e = new Emp();
		e.setEid(11);
		e.setName("Raja");
		l.add(e);
		
		
		Emp e1 = new Emp();
		e1.setEid(11);
		e1.setName("Raja");
		l.add(e1);
		
		
		Emp e2 = new Emp();
		e2.setEid(14);
		e2.setName("arun");
		l.add(e2);
		return l;
	}

}
