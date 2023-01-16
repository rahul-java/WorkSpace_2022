package max1;
import java.util.Collections;
import java.util.List;
import java.util.Vector;


public class CL {
public static void main(String[] args) {
	List<String> l = ListTest.getEmpName();
	/*for(String p:l)
	{
		System.out.println(p);
	}*/
	
	List<String> list = ListTest.getEmpName();
	
	Collections.synchronizedList(list);
	//Vector<String> v = new Vector<String>(list);
	Collections.sort(list);
	
	for(String q:list)
	{
		System.out.println(q);
	}
}
}
