package set;

import java.util.Set;

public class CL {
	public static void main(String[] args) {
		EmpSet empSet=new EmpSet();
		Set<Emp> s = empSet.getData();
		for(Emp p:s)
		{
			System.out.println(p.getEid() +" "+p.getName());
		}
	}

}
