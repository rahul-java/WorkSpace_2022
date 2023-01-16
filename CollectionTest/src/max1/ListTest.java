package max1;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class ListTest {
	public static List<String> getEmpName()
	{
		//List<String> l=new LinkedList<String>();
		List<String> l=new ArrayList<String>();
		l.add("raja");
		l.add("bala");
		l.add("kala");
		l.add("mala");
		l.add(2, "maja");
		return l;
	}
	public List<Object> getAllDetail()
	{
		List<Object> list = new ArrayList<Object>();
		Emp e = new Emp();
		e.setId(10);
		e.setAdd("noida");
		e.setName("raja");
		list.add(e);
		
		Manager m = new Manager(1,"lala");
		list.add(m);
		Manager m1 = new Manager(2,"bala");
		list.add(m1);
		Emp e1 = new Emp();
		e1.setId(20);
		e1.setAdd("gr noida");
		e1.setName("arun");
		list.add(e1);
		
		Emp e2 = new Emp();
		e2.setId(30);
		e2.setAdd("delhi");
		e2.setName("kalu");
		list.add(e2);
		return list;
		
	}
	

}
