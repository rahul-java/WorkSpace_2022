package jdbsPostgres.fatch;

import java.util.ArrayList;

public class FatchClient {
 public static void main(String[] args) {
	ArrayList<Emp> r = FatchDAO.getEmpDetails("all");
	for(Emp p:r)
	{
		System.out.println(p.getId()+ " "+p.getName()+ " "+p.getAddress());
	}
}
}
