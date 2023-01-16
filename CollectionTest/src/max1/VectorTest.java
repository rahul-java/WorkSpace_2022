package max1;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;


public class VectorTest {
	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();
		v.add("D");
		v.add("A");
		v.add("H");
		v.add("B");
		
		Iterator<String> it = v.iterator();
		while(it.hasNext())
		{
			String p = it.next();
			System.out.println(p);
		}
		System.out.println("------------");
		
		Enumeration<String> e = v.elements();
		while(e.hasMoreElements())
		{
			String t = e.nextElement();
			System.out.println(t);
		}
	}

}
