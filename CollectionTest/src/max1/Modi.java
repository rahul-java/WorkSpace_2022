package max1;
import java.util.Iterator;
import java.util.List;
public class Modi {
public static void main(String[] args) {
	ListTest listTest=new ListTest();
	List<Object> list = listTest.getAllDetail();
	
	
	
	
	for(Object p:list)
	{
		if(p instanceof Emp)
		{
			  Emp e = (Emp)p;
	 System.out.println(e.getId()+" "+e.getName()+" "+e.getAdd());
		}
		else if(p instanceof Manager)
		{
			  Manager m = (Manager)p;
			  System.out.println(m.mid+" "+m.name);
		}
	}
}
}
