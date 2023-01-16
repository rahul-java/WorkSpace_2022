package max;

import java.util.Collections;
import java.util.List;

public class CL {
	public static void main(String[] args) {
		EmpList empList=new EmpList();
		  List<Object> q = empList.getData();
		  Collections.synchronizedList(q);
		  
		  for( Object pp: q)
		  {
			 
			  if(pp instanceof Emp)
			  {
			  Emp p = (Emp) pp;
			  System.out.println(p.getId()+" "+p.getName()+" "+p.getAdd());
			  }
			  else if(pp instanceof User)
			  {
				  User u = (User)pp;
				  System.out.println(u.uid+" "+u.name);
			  }
			  }
		  
		  
		  
	}

}
