package max;

import java.util.ArrayList;
import java.util.List;

public class EmpList {
	
public List<Object> getData()
{
	 List<Object> l=new ArrayList<Object>();
	 
	
	Emp e = new Emp();
	 e.setId(11);
	 e.setName("raja");
	 e.setAdd("khurja");
	 l.add(e);
	 User u=new User(2,"kk");
	 l.add(u);
	 
	 Emp e1 = new Emp();
	 e1.setId(12);
	 e1.setName("raji");
	 e1.setAdd("aligarh");
	 l.add(e1);
	 
	 Emp e2 = new Emp();
	 e2.setId(15);
	 e2.setName("arun");
	 e2.setAdd("delhi");
	 l.add(e2);
	 User u1=new User(21,"ok");
	 l.add(u1);
	 return l;
	 
}
	
	
	
}
